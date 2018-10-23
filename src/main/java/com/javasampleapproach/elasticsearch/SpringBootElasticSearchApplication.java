package com.javasampleapproach.elasticsearch;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javasampleapproach.elasticsearch.model.Post;
import com.javasampleapproach.elasticsearch.repository.PostRepository;

@SpringBootApplication
public class SpringBootElasticSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootElasticSearchApplication.class, args);
	}
}