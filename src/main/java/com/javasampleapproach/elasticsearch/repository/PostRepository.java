package com.javasampleapproach.elasticsearch.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.javasampleapproach.elasticsearch.model.Author;
import com.javasampleapproach.elasticsearch.model.Post;

@Repository
public interface PostRepository extends ElasticsearchRepository<Post, String> {
	
	Post findByid(String id);
	
	List<Post> findByService(String service);
	
}