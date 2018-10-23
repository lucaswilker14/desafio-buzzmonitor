package com.javasampleapproach.elasticsearch.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javasampleapproach.elasticsearch.model.Post;
import com.javasampleapproach.elasticsearch.repository.PostRepository;
import com.javasampleapproach.elasticsearch.service.PostService;

@RestController
@RequestMapping("/desafio/posts")
public class PostController {

	@Autowired
	PostService postService;
	
	@Autowired
	PostRepository postRepository;
	
	//retorna todos os posts
	@GetMapping(value = "/listagem")
	public @ResponseBody List<Post> returnPost(){
		List<Post> posts = new ArrayList<Post>();
		Iterable<Post> postI = postRepository.findAll();
		for (Post post : postI) {
			posts.add(post);
		}
		return posts;
	}
	
	//retorna post pelo nome do autor.
//	@GetMapping(value = "/author/{name}", produces = "application/json")
//	public @ResponseBody Post returnPostByAuthorName(@PathVariable String name){
//		return postService.findByAuthor(name);
//	}
	
	@PutMapping(value = "/loadDataSet")
	@Transactional
	public @ResponseBody String loadDataSet() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		TypeReference<List<Post>> typeReference = new TypeReference<List<Post>>(){};
		InputStream inputStream = TypeReference.class.getResourceAsStream("/json/dataset.json");
		
		try {
			List<Post> posts = mapper.readValue(inputStream, typeReference);
			postRepository.saveAll(posts);
			System.out.println("Posts Saved!");
			return "Posts Saved!";
		} catch (IOException e){
			System.out.println("Unable to save users: " + e.getMessage());
			return "Unable to save users: " + e.getMessage();
		}
	}
}
