package com.cardealer.Repository;

import java.util.List;

import com.cardealer.Model.Customer;

public interface CustomerRepository{
 
	int save(Customer customer);

    int update(Customer customer);

    int deleteById(long id);

    List<Customer> findAll();
    
    Customer findById(Long id);

}