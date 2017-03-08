package com.application.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.application.entity.Topic;




public interface  TopicRepository extends JpaRepository<Topic, Integer>
{

	Topic findById(Integer id);

	
	
	
}
