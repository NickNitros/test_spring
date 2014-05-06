package test_spring.rep;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import test_spring.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see test_spring.rep.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();

		Customer customer = new Customer();

		customer.setFirstname("Bill");
		customer.setLastname("Bob");

		customers.add(customer);

		return customers;
	}

}
