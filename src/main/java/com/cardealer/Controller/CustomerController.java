package com.cardealer.Controller;

import com.cardealer.Exception.CustomerNotFoundException;
import com.cardealer.Model.Customer;
import com.cardealer.Repository.CustomerRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerRepository custRepo;

    public CustomerController(CustomerRepository custRepo) {
        this.custRepo = custRepo;
    }

    @GetMapping("/customers")
    List<Customer> all() {
        return custRepo.findAll();
    }

    @PostMapping("/customers")
    int newCustomer(@RequestBody Customer newCustomer) {
        return custRepo.save(newCustomer);
    }

    @GetMapping("/customers/{id}")
    Customer getSingleCustomer(@PathVariable Long id) {

        return custRepo.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException(id));
    }

    @PutMapping("/customer/{id}")
    Customer replaceCustomer(@RequestBody Customer newCustomer, @PathVariable Long id) {

        return custRepo.findById(id)
                .map(customer -> {
                    customer.setfName(newCustomer.getfName());
                    customer.setlName(newCustomer.getlName());
                    customer.setAddress(newCustomer.getAddress());
                    customer.setPhoneNumber(newCustomer.getPhoneNumber());
                    return custRepo.save(customer);
                })
                .orElseGet(() -> {
                    newCustomer.setCustomerId(id);
                    return custRepo.save(newCustomer);
                });
    }

    @DeleteMapping("/customer/{id}")
    void deleteCustomer(@PathVariable Long id) {
        custRepo.deleteById(id);
    }
}
