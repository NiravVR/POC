package com.poc.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    UserServiceRepository userserviceRepo;
	
	@Override
	public List<Users> getUser() {
		// TODO Auto-generated method stub
		return userserviceRepo.findAll();
	}

	
}
