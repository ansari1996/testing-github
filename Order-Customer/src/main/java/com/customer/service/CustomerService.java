package com.customer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.customer.model.Customer;
import com.customer.repo.Repo;

@Service
public class CustomerService {
	
	@Autowired
	Repo repo;

	public Optional<Customer> getCustomer(Integer custId) {
		return repo.findById(custId);
	}
	
	public Customer saveCustomer(Customer customer) {
		return repo.save(customer);
	}

}
