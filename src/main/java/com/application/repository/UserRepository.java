package com.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.entity.User;
import java.lang.String;



public interface  UserRepository extends JpaRepository<User, Integer>
{

	
	List<User> findAll();
	
	
	User findByName(String name);
	
	
	
}
