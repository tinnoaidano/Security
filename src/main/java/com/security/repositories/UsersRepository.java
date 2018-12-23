package com.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.beans.Users;


@Repository
public interface UsersRepository extends JpaRepository<Users,Long>{

	public Users findByUserName(String username);
	
	public Users save(Users user);

	public void deleteById(Long id);
}
