package com.oauth.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.oauth.authntication.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	RestTemplate restTemple;
	
	private static final String USER_SERVICE_URL = "http://localhost:8091/api/users/email/";

	@GetMapping("/")
	public String home() {
		return "user/home";
	}

}
