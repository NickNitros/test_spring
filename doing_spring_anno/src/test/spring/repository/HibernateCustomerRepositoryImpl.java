package test.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import test.spring.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
	
		Customer customer = new Customer();
		
		customer.setFirstname("Bill");
		customer.setLastname("Bob");
		
		customers.add(customer);
		
		return customers;
	}
	
}
