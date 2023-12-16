package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Customer;
import com.customer.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService serv;
	
	@GetMapping("/{custId}")
	public Object get(@PathVariable Integer custId ) {
		
		return serv.getCustomer(custId);
		
	}
	
	
	@PostMapping("/savecustomer")
	public Customer Savecus(@RequestBody Customer cust) {
		return serv.saveCustomer(cust);
	}

}
