package com.javasampleapproach.elasticsearch.util;

import java.util.List;

import com.javasampleapproach.elasticsearch.model.Post;

public interface Crud<T> {

	// getAll
	Iterable<Post> findAll();
	
	List<T> findByPost_id(String post_id);

	// getId
	T findByid(Long id);

	// getAuthorByPost
	T findByAuthor(String name_author);

	// update
	T update(T obj1, T obj2);

	// delete
	String delete(String post_id);

	// deleteAll
	String deleteAll();

}
