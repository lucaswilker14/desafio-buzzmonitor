package com.javasampleapproach.elasticsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.javasampleapproach.elasticsearch.model.Author;
import com.javasampleapproach.elasticsearch.model.Post;
import com.javasampleapproach.elasticsearch.repository.PostRepository;
import com.javasampleapproach.elasticsearch.util.Crud;

@Service
public class PostService implements Crud<Post>{

	@Autowired
	PostRepository postRep;
	
//	@Autowired
//	AuthorRepository ar;
	
	@Override
	public Iterable<Post> findAll() {
		return postRep.findAll();
	}

	@Override
	public List<Post> findByPost_id(String post_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post findByid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post findByAuthor(String name_author) {
//		Author author = ar.findByName(name_author);
//		return postRep.findByAuthor(author);
		return null;
	}

	@Override
	public Post update(Post obj1, Post obj2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String post_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
