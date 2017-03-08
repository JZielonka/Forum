package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.application.service.TopicService;
import com.application.service.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService userService;
	
	@Autowired
	TopicService topicService;


	@RequestMapping(value = "/login")
	public String login() {

		return "login";
	}

	@RequestMapping("/")
	public String hello(Model model) {

		model.addAttribute("topics", topicService.findAll().size());
		model.addAttribute("users", userService.findAll().size());
		return "index";
	}

}
