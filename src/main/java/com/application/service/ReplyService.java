package com.application.service;

import java.text.DateFormat;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.entity.Reply;

import com.application.repository.ReplyRepository;
import com.application.repository.TopicRepository;

@Service
public class ReplyService {

	@Autowired
	ReplyRepository replyRepository;
	
	@Autowired
	TopicRepository topicRepository;

	public void save(Reply reply) {
		
		Date today = new Date();
		DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.FULL);
		String dateOut = dateFormatter.format(today);
		reply.setDate(dateOut);
		
		replyRepository.save(reply);
		
	
	}

	public List<Reply> findAll() {
	
		return replyRepository.findAll();
	}

	
}