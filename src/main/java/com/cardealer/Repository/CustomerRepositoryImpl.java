package com.cardealer.Repository;

import com.cardealer.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	// Just need to autowire JdbcTemplate, spring boot will
	// do auto configure
    @Autowired
    private JdbcTemplate jdbcTemplate;

    
    @Override
    public int save(Customer customer) {
        return jdbcTemplate.update(
                "insert into customer (fName, lName,address,phoneNumber) values(?,?,?,?)",
                customer.getfName(), customer.getlName(),customer.getAddress(),customer.getPhoneNumber());
    }

    @Override
    public int update(Customer customer) {
        return jdbcTemplate.update(
                "update customer set fName = ? set lName = ? set address = ? set phoneNumber = ? where customerId = ?",
                customer.getfName(), customer.getlName(),customer.getAddress(),customer.getPhoneNumber(), customer.getCustomerId());
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update(
                "delete from customer where customerId = ?",
                id);
    }
    @Override
    public List<Customer> findAll() {
        return jdbcTemplate.query(
                "select * from customer",
                (rs, rowNum) ->
                        new Customer(
                                rs.getInt("customerId"),
                                rs.getString("fname"),
                                rs.getString("lname"),
                                rs.getString("address"),
                                rs.getString("phoneNumber")
                        )
        );
    }

    @Override
    public Customer findById(int id) {
        return jdbcTemplate.queryForObject("select * from CUSTOMER where customerId = ?",
                new BeanPropertyRowMapper<Customer>(Customer.class), id);

    }
}