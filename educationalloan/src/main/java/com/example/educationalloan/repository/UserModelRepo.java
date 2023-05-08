package com.example.educationalloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.educationalloan.model.UserModel;

@Repository
public interface UserModelRepo extends JpaRepository<UserModel,Integer>{

	UserModel findByEmail(String email);
}
