package com.poc.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UsersController {

	@Autowired
	UserService userservice;

	@GetMapping(value = "/list")
	public List<Users> getUsers() {
		return userservice.getUser();
	}
}