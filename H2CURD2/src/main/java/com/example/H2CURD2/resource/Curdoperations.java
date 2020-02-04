package com.example.H2CURD2.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.H2CURD2.domain.User;
import com.example.H2CURD2.services.UserService;

@RestController
public class Curdoperations {

	@Autowired
	UserService userService;
	
	
	@RequestMapping("saveuser")
	public User saveUser() {
		User user=new User();
		user.setFirstName("RRReddy");
		user.setLastName("r");
		user.setEmail("rrr@gmail.com");
		return userService.save(user);
		
		
	}
}
