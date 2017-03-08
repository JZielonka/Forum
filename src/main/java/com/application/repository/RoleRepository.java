package com.application.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.application.entity.Role;




public interface  RoleRepository extends JpaRepository<Role, Integer>
{

	Role findByName(String string);

	
	
	
}
