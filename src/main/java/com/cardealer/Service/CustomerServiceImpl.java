package com.cardealer.Service;

import java.util.List;

import com.cardealer.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements com.cardealer.Service.CustomerService {

	@Autowired
	CustomerService customerRepository;
	
	
	@Override
	public int save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public int update(Customer customer) {
		return customerRepository.update(customer);
	}

	@Override
	public int deleteById(int id) {
		return customerRepository.deleteById(id);
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findById(int id) {
		return customerRepository.findById(id);
	}

}