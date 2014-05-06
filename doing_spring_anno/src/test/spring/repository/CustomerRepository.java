package test.spring.repository;

import java.util.List;

import test.spring.model.Customer;

public interface CustomerRepository {

	public abstract List<Customer> findAll();

}