package com.cardealer.Service;

import java.util.List;
import java.util.Optional;

import com.cardealer.Model.Customer;

public interface CustomerService {

	int save(Customer customer);

    int update(Customer customer);

    int deleteById(int id);

    List<Customer> findAll();

    Customer findById(int id);

}