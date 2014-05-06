package test_spring.rep;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import test_spring.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${someProperty}")
	private String someValue;
	
	@Value("${anotherName}")
	private String anotherValue;
	
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();

		Customer customer = new Customer();

		//customer.setFirstname("Bill");
		customer.setFirstname(someValue);
		//customer.setLastname("Bob");
		customer.setLastname(anotherValue);

		customers.add(customer);

		return customers;
	}

}
