package test_spring.service;

import java.util.List;

import test_spring.model.Customer;

public interface CustomerService {

	public abstract List<Customer> findAll();

}