package com.example.educationalloan.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educationalloan.model.LoanApplicationModel;
import com.example.educationalloan.repository.LoanApplicationModelRepo;

@Service 
public class LoanApplicationService {
	
	@Autowired
	LoanApplicationModelRepo loanRepo; 
	
	public List<LoanApplicationModel> getAllLoans() {
		return loanRepo.findAll();
	}
	
	public LoanApplicationModel saveLoan(LoanApplicationModel s) {
		LoanApplicationModel obj=loanRepo.save(s);
		return obj;
	}

	public LoanApplicationModel updateLoan(LoanApplicationModel s,int loanId) {
		 Optional<LoanApplicationModel> data=loanRepo.findById(loanId);
		 if(data.isPresent())
		 {
			 return loanRepo.save(s);
		 }
		 return null;	 
	}
	
	public void deleteLoan(int loanId) {
		loanRepo.deleteById(loanId);
	}
}
