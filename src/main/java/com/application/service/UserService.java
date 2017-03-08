package com.application.service;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import com.application.entity.Role;
import com.application.entity.User;

import com.application.repository.RoleRepository;
import com.application.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	public RoleRepository roleRepository;

	public List<?> findAll() {

		return userRepository.findAll();

	}

	public User findOne(int id) {

		return userRepository.findOne(id);
	}

	public void saveUser(User user) {

		user.setEnabled(true);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		List<Role> roles = new ArrayList<Role>();

		roles.add(roleRepository.findByName("ROLE_USER"));
		user.setRoles(roles);
		Date today = new Date();
		DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.FULL);
		String dateOut = dateFormatter.format(today);
		user.setRegisterDate(dateOut);
		
		userRepository.save(user);

	}

	public User findOne(String name) {

		User user = userRepository.findByName(name);

		return findOne(user.getId());

	}

	public void deleteUser(int id) {
		userRepository.delete(id);

	}

}
