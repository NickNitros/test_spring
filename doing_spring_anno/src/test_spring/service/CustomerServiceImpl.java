package test_spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import test_spring.model.Customer;
import test_spring.rep.CustomerRepository;
import test_spring.rep.HibernateCustomerRepositoryImpl;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
