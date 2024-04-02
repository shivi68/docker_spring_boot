package com.nagarro.devops_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
	
	@GetMapping("/welcome")
	public String getMessage() {
		return "This is DevOps Assignment!!";
	}

	@GetMapping("/Assignment2")
	public String getMessage2() {
		return "In Assignment 2-A) U have to create a Jenkins freestyle project to download code from the GitHub.";
	}
	
	@GetMapping("/Assignment3")
	public String getMessage3() {
		return "In Assignment 3-A) U have to create a freestyle Jenkins pipeline to build and deploy the Spring Boot Application using Docker.";
	}
	@GetMapping("/")
    public String getAllMessages() {
        StringBuilder sb = new StringBuilder();
        sb.append(getMessage()).append("\n");
        sb.append(getMessage2()).append("\n");
        sb.append(getMessage3());
        return sb.toString();
    }
}
