package com.javasampleapproach.elasticsearch.util;

import java.util.List;

import com.javasampleapproach.elasticsearch.model.Post;

public interface Crud<T> {

	// getAll
	Iterable<Post> findAll();
	
	List<Post> findByService(String service);
	
	// delete
	String delete(String post_id);

	// deleteAll
	String deleteAll();

}
