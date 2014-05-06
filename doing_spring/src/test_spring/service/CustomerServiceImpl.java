package test_spring.service;

import java.util.List;

import test_spring.model.Customer;
import test_spring.rep.CustomerRepository;
import test_spring.rep.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see test_spring.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
