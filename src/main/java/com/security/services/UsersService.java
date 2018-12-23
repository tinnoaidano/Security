package com.security.services;

import java.util.List;

import com.security.beans.Users;

public interface UsersService {

	public Users findByUserName(String username);
	
	public Users save(Users user);

	public void delete(Long id);

	public List findAll();
}
