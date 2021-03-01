package com.rakuten.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MoviesProjectApplication {

	public static void main(String[] args) {
	ApplicationContext springContainer = SpringApplication.run(MoviesProjectApplication.class, args);
	
	TestCode.testMovieDAO(springContainer);
	}

}