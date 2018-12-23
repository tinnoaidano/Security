package com.security;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOauth2GoogleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauth2GoogleApplication.class, args);
	}

	@RequestMapping(value="/user")
	public Principal user(Principal principal) {
		return principal;
	}
	
}

