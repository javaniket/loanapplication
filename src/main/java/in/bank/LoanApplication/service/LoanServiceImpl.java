package in.bank.LoanApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bank.LoanApplication.model.Loans;
import in.bank.LoanApplication.repository.LoanRepository;
import jakarta.transaction.Transactional;



@Service
@Transactional
public class LoanServiceImpl implements LoanService{
	
	@Autowired
	private LoanRepository loanRepository;

	@Override
	public List<Loans> getAllLoans() {
		return this.loanRepository.findAll();
	}

	@Override
	public List<Loans> getLoansByCustomerId(int id) {
		return this.loanRepository.searchByCustomerId(id);
	}

}
