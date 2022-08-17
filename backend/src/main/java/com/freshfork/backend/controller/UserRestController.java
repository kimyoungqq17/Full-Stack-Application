package com.freshfork.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.freshfork.backend.services.FreshForkServices;
import com.freshfork.backend.dto.*;
import com.freshfork.backend.model.*;

@RestController
public class UserRestController {
	
	@Autowired
	FreshForkServices freshfork;
	
	@PostMapping("/users/create")
	public UserDto createUserController(@RequestParam(name = "name") String username, @RequestParam(name = "password") String password, @RequestParam(name = "email") String email, @RequestParam(name = "isPro") boolean isPro) {
		User tempUser = freshfork.createUser(username, email, password, isPro);
		//Returns Dto is user was succesfully created, null otherwise
		if(tempUser != null) {
			UserDto returnUser = new UserDto(username, email, isPro);
			return returnUser;
		}
		else {
			return null;
		}
		
		
	}
}
