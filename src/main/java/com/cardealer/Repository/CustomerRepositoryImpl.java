package com.cardealer.Repository;

import java.util.List;
import java.util.Optional;

import com.cardealer.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	// Just need to autowire JdbcTemplate, spring boot will
	// do auto configure
    @Autowired
    private JdbcTemplate jdbcTemplate;

    
    @Override
    public int save(Customer customer) {
        return jdbcTemplate.insert(
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
                "delete customer where customerId = ?",
                id);
    }

    @Override
    public List<Customer> findAll() {
        return jdbcTemplate.query(
                "select * from customer",
                (rs, rowNum) ->
                        new Customer(
                                rs.getInt("customerId"),
                                rs.getString("firstName"),
                                rs.getString("lastName"),
                                rs.getString("address"),
                                rs.getString("phoneNumber")
                        )
        );
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return jdbcTemplate.queryForObject(
                "select * from customer where customerId = ?",
                new Object[]{id},
                (rs, rowNum) ->
                        Optional.of(new Customer(
                                rs.getInt("id"),
                                rs.getString("firstName"),
                                rs.getString("lastName"),
                                rs.getString("address"),
                                rs.getString("phoneNumber")
                        ))
        );
    }
}