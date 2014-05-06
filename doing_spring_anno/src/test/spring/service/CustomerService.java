package test.spring.service;

import java.util.List;

import test.spring.model.Customer;

public interface CustomerService {

	public abstract List<Customer> findAll();

}