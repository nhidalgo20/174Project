package com.cardealer.Repository;

import java.util.List;
import java.util.Optional;

import com.cardealer.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository {
 
	int save(Customer customer);

    int update(Customer customer);

    int deleteById(long id);

    List<Customer> findAll();
    
    Customer findById(int id);

}