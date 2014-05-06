package test_spring.rep;

import java.util.List;

import test_spring.model.Customer;

public interface CustomerRepository {

	public abstract List<Customer> findAll();

}