package com.application.init;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.application.entity.Role;
import com.application.entity.Topic;
import com.application.entity.User;
import com.application.repository.InfoRepository;
import com.application.repository.RoleRepository;
import com.application.repository.TopicRepository;
import com.application.repository.UserRepository;

@Service
public class DBInit {

	@Autowired
	public RoleRepository roleRepository;

	@Autowired
	public UserRepository userRepository;

	@Autowired
	public InfoRepository infoRepository;

	@Autowired
	public TopicRepository topicRepository;

	@PostConstruct
	public void init() {

		Role ADMIN = new Role();
		ADMIN.setName("hasRole('ROLE_ADMIN')");
		Role ADMIN2 = new Role();
		ADMIN2.setName("ROLE_ADMIN");

		Role USER = new Role();
		USER.setName("ROLE_USER");

		List<Role> roles = new ArrayList<Role>();
		roles.add(USER);
		roles.add(ADMIN);
		roles.add(ADMIN2);
		roleRepository.save(USER);
		roleRepository.save(ADMIN);
		roleRepository.save(ADMIN2);

		BCryptPasswordEncoder crypt = new BCryptPasswordEncoder();

		User maniek2 = new User();
		maniek2.setEnabled(true);
		maniek2.setRoles(roles);
		maniek2.setName("maniek2");
		maniek2.setPassword(crypt.encode("test"));
		maniek2.setRoles(roles);
		userRepository.save(maniek2);

		User maniek = new User();
		maniek.setRoles(roles);
		maniek.setEnabled(true);
		maniek.setName("Maniek");
		maniek.setPassword(crypt.encode("admin"));
		userRepository.save(maniek);
		maniek.setRoles(roles);

		Topic neww = new Topic();
		neww.setName("Asd");

		neww.setUser(maniek);

		topicRepository.save(neww);
	}
}