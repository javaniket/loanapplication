package in.bank.LoanApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.bank.LoanApplication.model.Customer;
import in.bank.LoanApplication.model.Loans;
import in.bank.LoanApplication.service.LoanService;

@RestController
public class LoanController {

	@Autowired
	private LoanService loanService;
	
	@GetMapping("/loans")
	public ResponseEntity<List<Loans>> getAllProduct(){
		return ResponseEntity.ok().body(loanService.getAllLoans());
	}
	
	@GetMapping("/loans/{id}")
	public ResponseEntity<List<Loans>> getLoansByCustomerId(@PathVariable int id){
		return ResponseEntity.ok().body(loanService.getLoansByCustomerId(id));
	}
	
	@PostMapping("/loans")
	public ResponseEntity<List<Loans>> getLoansByCustomerIdByPost(@RequestBody Customer customer){
		return ResponseEntity.ok().body(loanService.getLoansByCustomerId(customer.getCustomerId()));
	}

}
