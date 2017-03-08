package com.application.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.application.entity.Info;
import com.application.entity.User;

import com.application.service.InfoService;
import com.application.service.UserService;

@Controller
public class InfoController {

	@Autowired
	private UserService userService;

	@Autowired
	private InfoService infoService;

	@ModelAttribute("user")
	public User createNewUser() {

		return new User();
	}

	@ModelAttribute("info")
	public Info createInfo() {

		return new Info();
	}

	@RequestMapping("/index")
	public String index() {

		return "index";
	}

	@RequestMapping("/users")

	public String users(Model model) {

		model.addAttribute("users", userService.findAll());
		return "users";

	}

	@RequestMapping("/users/{id}")
	public String UserDetail(Model model, @PathVariable int id) {

		model.addAttribute("user", userService.findOne(id));
	

		return "details";
	}
	
	

	@Secured("isAuthenticated()")
	@RequestMapping("/user-detail")
	public String UserDetail(Model model, Principal principal) {
		String name = principal.getName();

		model.addAttribute("user", userService.findOne(name));
		return "user-detail";

	}

	@RequestMapping(value = "/user-detail", method = RequestMethod.POST)
	public String UserAddInfoDetail(@ModelAttribute("info") Info info, Principal principal) {

		String name = principal.getName();
		User user = userService.findOne(name);
		user.setInfo(info);
		infoService.saveInfo(name, info);
		

		return "redirect:user-detail.html";

	}

	@RequestMapping(value = "/register")
	public String showRegister() {

		return "registration";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String doRegister(@ModelAttribute("user") User user) {

		try {
			
			userService.saveUser(user);
			
			
			return "redirect:/register.html?registered=true";

		} catch (Exception e) {
			return "403";
		}

	}

	

	@RequestMapping(value = "users/delete/{id}")
	public String deleteUser(@PathVariable int id) {

		userService.deleteUser(id);

		return "redirect:/users.html";
	}

	@RequestMapping(value = "/403")
	public String accesDenied(Principal principal, Model model) {
		

		return "403";
	}

}
