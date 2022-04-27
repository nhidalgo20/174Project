package com.cardealer.Controller;

import com.cardealer.Model.Customer;

import com.cardealer.Service.CustomerService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    List<Customer> all() {
        return customerService.findAll();
    }

    @PostMapping("/customers")
    int newCustomer(@RequestBody Customer newCustomer) {
        return customerService.save(newCustomer);
    }

    @GetMapping("/customers/{id}")
    Customer getSingleCustomer(@PathVariable int id) {

        return customerService.findById(id);
    }

//    @PutMapping("/customer/{id}")
//    Integer replaceCustomer(@RequestBody Customer newCustomer, @PathVariable int id) {
//
//        return custRepo.findById(id).
//    }

    @DeleteMapping("/customer/{id}")
    void deleteCustomer(@PathVariable int id) {
        customerService.deleteById(id);
    }
}
