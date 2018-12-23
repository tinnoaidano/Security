package com.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.security.beans.Users;
import com.security.repositories.UsersRepository;

public class UsersServiceImpl implements UsersService{

	@Autowired 
	UsersRepository usersRepository;
	
	public Users findByUserName(String username) {
		return usersRepository.findByUserName(username);
	}

	public Users save(Users user) {
		return usersRepository.save(user);

	}

	public void delete(Long id) {
		usersRepository.deleteById(id);
	}

	public List findAll() {
		return usersRepository.findAll();
	}
}
