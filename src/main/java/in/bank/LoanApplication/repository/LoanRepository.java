package in.bank.LoanApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.bank.LoanApplication.model.Loans;
@Repository
public interface LoanRepository extends JpaRepository<Loans, Integer>{

	@Query(value="SELECT * FROM loans l WHERE l.customer_id=?1", nativeQuery = true)
	List<Loans> searchByCustomerId(int customerId);
	
}
