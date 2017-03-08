package com.application.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.application.entity.Info;




public interface  InfoRepository extends JpaRepository<Info, Integer>
{

	 void delete(Info info);




	
	
}
