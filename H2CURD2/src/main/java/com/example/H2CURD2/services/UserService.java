package com.example.H2CURD2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.H2CURD2.domain.User;
import com.example.H2CURD2.repository.UserRepository;

@Service
public class UserService {
	 
	@Autowired
	UserRepository userRepository;
	
	public User save(User user) {
		
		return userRepository.save(user);
		
	}
	
}
