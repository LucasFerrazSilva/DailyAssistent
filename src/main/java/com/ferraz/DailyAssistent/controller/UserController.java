package com.ferraz.DailyAssistent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ferraz.DailyAssistent.model.User;
import com.ferraz.DailyAssistent.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	
	@GetMapping("/all")
	public @ResponseBody Iterable<User> getAll() {
		return userRepository.findAll();
	}
	
}
