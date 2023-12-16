package com.customer.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customer.model.Customer;

@Repository
public interface Repo extends CrudRepository<Customer, Integer> {

}
