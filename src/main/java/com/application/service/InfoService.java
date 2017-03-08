package com.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.entity.Info;
import com.application.repository.InfoRepository;



@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;





	public void saveInfo(String name, Info info) {
	
		
		infoRepository.save(info);	
		
	

	}

	public void delete(int id) {

		infoRepository.delete(id);
	}



}
