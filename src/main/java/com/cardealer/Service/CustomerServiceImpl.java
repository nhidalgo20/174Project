package com.cardealer.Service;

import java.util.List;
import java.util.Optional;

import com.cardealer.Model.Customer;
import com.cardealer.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	
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
	public Customer findById(Long id) {
		return customerRepository.findById(id);
	}

}