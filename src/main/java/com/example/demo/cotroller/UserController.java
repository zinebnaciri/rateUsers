package com.example.demo.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.services.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired
	UserService ratingService;
	
	

}
