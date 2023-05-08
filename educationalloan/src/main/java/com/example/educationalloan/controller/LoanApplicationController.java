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

import com.example.educationalloan.model.LoanApplicationModel;
import com.example.educationalloan.service.LoanApplicationService;

@RestController
public class LoanApplicationController {

	@Autowired
	LoanApplicationService userService;
	
	 @GetMapping(value="/fetchLoan")
	 public List<LoanApplicationModel> getAllLoans()
	 {
		 return userService.getAllLoans();
	 }
	 
	@PostMapping("/saveLoan")
	 public LoanApplicationModel saveLoan(@RequestBody LoanApplicationModel s) {
			LoanApplicationModel obj=userService.saveLoan(s);
			return obj;
		}
	 
	 @PutMapping("/updateLoan/{loanId}")
		public LoanApplicationModel updateLoan(@RequestBody LoanApplicationModel s,@PathVariable int loanId) {
			 return userService.updateLoan(s,loanId);
		}

	 @DeleteMapping("/deleteLoan/{id}")
		public void deleteLoan(@PathVariable int id) {
			userService.deleteLoan(id);
		}
}
