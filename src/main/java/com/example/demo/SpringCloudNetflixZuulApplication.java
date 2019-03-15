package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudNetflixZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudNetflixZuulApplication.class, args);
	}

}

