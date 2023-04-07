package in.bank.LoanApplication.service;

import java.util.List;

import in.bank.LoanApplication.model.Loans;


public interface LoanService {
	
	List<Loans> getAllLoans();
	
	List<Loans> getLoansByCustomerId(int customerId);
	
}
