package com.example.educationalloan.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.educationalloan.model.UserModel;
import com.example.educationalloan.service.UserModelService;

@RestController
public class UserModelController {

	@Autowired
	UserModelService userService;
	
	@GetMapping(value="/fetchUser")
	 public List<UserModel> getAllUser()
	 {
		 return userService.getAllUser();
	 }
	 
	 @PostMapping("/saveUser")
	 public UserModel saveUser(@RequestBody UserModel s) {
			return userService.saveUser(s);
		}
	 
	 @PutMapping("/updateUser/{id}")
		public UserModel updateUser(@RequestBody UserModel s,@PathVariable int id) {
			 return userService.updateUser(s,id);
		}

	 @DeleteMapping("/deleteUser")
		public void deleteUser(int id) {
			userService.deleteUser(id);
		}
	
}
