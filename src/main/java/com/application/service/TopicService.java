package com.application.service;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.application.entity.Topic;
import com.application.repository.ReplyRepository;
import com.application.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;

	@Autowired
	ReplyRepository replyRepository;

	public void save(Topic topic) {

		Date today = new Date();
		DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.FULL);
		String dateOut = dateFormatter.format(today);

		topic.setTopicDate(dateOut);
		topicRepository.save(topic);

	}

	public List<Topic> findAll() {

		return topicRepository.findAll();

	}

	public Topic findById(int id) {

		return topicRepository.findById(id);
	}

	

}
