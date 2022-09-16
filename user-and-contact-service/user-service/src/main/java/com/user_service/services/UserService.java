package com.user_service.services;

import java.util.List;

import com.user_service.entity.User;

public interface UserService {
	
	public User getUser(Long id);
	
	public List<User> getAllUsers();
}
