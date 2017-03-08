package com.application.controller;

import java.security.Principal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.application.entity.Reply;
import com.application.entity.Topic;
import com.application.entity.User;
import com.application.service.ReplyService;
import com.application.service.TopicService;
import com.application.service.UserService;

@Controller
public class ForumController {

	@Autowired
	private TopicService topicService;

	@Autowired
	private UserService userService;

	@Autowired
	private ReplyService replyService;

	@ModelAttribute("topic")
	private Topic newTopic() {

		return new Topic();
	}

	@ModelAttribute("reply")
	private Reply newReply() {

		return new Reply();
	}

	// ******************

	@RequestMapping(value = "forum")
	public String IndexPage(Model model) {

		model.addAttribute("topics", topicService.findAll());

		return "forum";
	}

	@RequestMapping(value = "newTopic")
	public String newTopic(Model model, Principal principal) {
		String name = principal.getName();

		model.addAttribute("user", userService.findOne(name));
		return "newTopic";
	}

	@RequestMapping(value = "newTopic", method = RequestMethod.POST)
	public String newTopic(Model model, @ModelAttribute("topic") Topic topic, Principal principal) {

		String name = principal.getName();

		User user = userService.findOne(name);

		topic.setUser(user);
		topicService.save(topic);

		return "redirect:/forum.html";
	}

	@RequestMapping(value = "forum/{id}")
	public String showTopic(Model model, @PathVariable int id) {

		model.addAttribute("topic", topicService.findById(id));

		return "topic";
	}

	@RequestMapping(value = "forum/{id}", method = RequestMethod.POST)
	public String catchReplyTopic(@ModelAttribute("reply") Reply reply, Principal principal, Model model,
			@PathVariable int id) {

		Topic topic = topicService.findById(id);
		String username = principal.getName();
		User user = userService.findOne(username);

		reply.setUser(user);
		reply.setTopic(topic);
		replyService.save(reply);

		model.addAttribute("topic", topic);
		return "redirect:/forum/{id}.html";
	}

}
