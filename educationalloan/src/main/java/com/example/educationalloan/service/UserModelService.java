package com.example.educationalloan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educationalloan.model.UserModel;
import com.example.educationalloan.repository.UserModelRepo;

@Service
public class UserModelService {

	@Autowired
	UserModelRepo userRepo;
	
	public List<UserModel> getAllUser() {
		return userRepo.findAll();
	}
	
	public UserModel saveUser(UserModel s) {
		UserModel obj=userRepo.save(s);
		return obj;
	}
	public UserModel updateUser(UserModel s,int id)
	{
		Optional<UserModel> data=userRepo.findById(id);
		if(data.isPresent())
		{
			return userRepo.save(s);
		}
		return null;
	}
	

	public void deleteUser(int id) {
		userRepo.deleteById(id);
	}
}
