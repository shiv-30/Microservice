package com.user_service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user_service.entity.User;

@Service
public class UserServiceImp implements UserService{

	List<User> list = List.of(
			
			new User(1331L, "Durgesh", "98764773"),
			new User(1332L, "Aniket", "98939939"),
			new User(1333L, "Shyam", "98299292")
			
	);
	
	
	
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}



	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return list;
	}

}
