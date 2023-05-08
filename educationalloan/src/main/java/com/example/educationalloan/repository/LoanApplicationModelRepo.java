package com.example.educationalloan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.educationalloan.model.LoanApplicationModel;

@Repository
public interface LoanApplicationModelRepo extends JpaRepository<LoanApplicationModel,Integer>{

	Optional<LoanApplicationModel> findById(Integer loanid);
}
