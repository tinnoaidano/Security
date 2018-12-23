package com.security.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.security.beans.Users;
import com.security.services.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public List listUser() {
		return usersService.findAll();
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public Users create(@RequestBody Users user) {
		return usersService.save(user);
	}

	@RequestMapping(value="/user/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable(value="id")Long id) {
		 usersService.delete(id);
	}
}
