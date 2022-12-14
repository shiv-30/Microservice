package com.user_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user_service.entity.User;
import com.user_service.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
//	Synchronous Call
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/all")
	public List<User> getAllUsers() {
		return this.userService.getAllUsers();
	}
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable Long userId) {
		User user = userService.getUser(userId);
		String url = "http://contact-service/contact/user/" + userId.toString();
		List contacts = this.restTemplate.getForObject(url, List.class);
		user.setContacts(contacts);
		return user;
	}
	
}
