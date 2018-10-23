package com.javasampleapproach.elasticsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.elasticsearch.model.Post;
import com.javasampleapproach.elasticsearch.repository.PostRepository;
import com.javasampleapproach.elasticsearch.util.Crud;

@Service
public class PostService implements Crud<Post>{

	@Autowired
	PostRepository postRep;
	
	@Override
	public Iterable<Post> findAll() {
		return postRep.findAll();
	}

	public String saveAll(List<Post> posts){
		postRep.saveAll(posts);
		return "Post Salvos!";
	}
	
	@Override
	public String delete(String post_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAll() {
		postRep.deleteAll();
		return "Todos os documentos deletados";
	}

	@Override
	public List<Post> findByService(String service) {
		return postRep.findByService(service);
	}

}
