package com.mongodb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.document.Users;
import com.mongodb.repository.UserRepository;

@RestController
@RequestMapping("rest/users")
public class UsersResource {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/all")
	public List<Users> getAll(){
		
		return userRepository.findAll();
		
	}
}
