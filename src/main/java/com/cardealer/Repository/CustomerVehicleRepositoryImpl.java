package com.cardealer.Repository;

import java.util.List;

import com.cardealer.Model.CustomerVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CustomerVehicleRepositoryImpl implements CustomerVehicleRepository {

	// Just need to autowire JdbcTemplate, spring boot will
	// do auto configure
    @Autowired
    private JdbcTemplate jdbcTemplate;

    
    @Override
    public int save(CustomerVehicle customerVehicle) {
        return jdbcTemplate.update(
                "insert into CUSTOMERSELLINGORBUYINGVEHICLE (VIN, customerId) values(?,?)",
                customerVehicle.getVehicleVIN(), customerVehicle.getCustomerId());
    }

    @Override
    public int updateCustomer(CustomerVehicle customerVehicle) {
        return jdbcTemplate.update(
                "update CUSTOMERSELLINGORBUYINGVEHICLE set VIN = ? where customerId = ?",
                customerVehicle.getVehicleVIN(),customerVehicle.getCustomerId());
    }
        @Override
    public int updateVehicle(CustomerVehicle customerVehicle) {
        return jdbcTemplate.update(
                "update CUSTOMERSELLINGORBUYINGVEHICLE set customerId = ? where VIN = ?",
                customerVehicle.getCustomerId(),customerVehicle.getVehicleVIN());
    }


    @Override
    public int deleteById(long customerId, String VIN) {
        return jdbcTemplate.update(
                "delete CUSTOMERSELLINGORBUYINGVEHICLE where customerId = ? and VIN = ?",
                customerId,VIN);
    }

    @Override
    public List<CustomerVehicle> findAll() {
        return jdbcTemplate.query(
                "select * from CUSTOMERSELLINGORBUYINGVEHICLE",
                (rs, rowNum) ->
                        new CustomerVehicle(
                                rs.getString("customerId"),
                                rs.getString("VIN")
                        )
        );
    }

    @Override
    public CustomerVehicle findByCustomerId(Long id) {
        return jdbcTemplate.queryForObject(
                "select * from CUSTOMERSELLINGORBUYINGVEHICLE where customerId = ?",
                new BeanPropertyRowMapper<>(CustomerVehicle.class),id);
    }
        @Override
    public CustomerVehicle findByVIN(Long id) {
        return jdbcTemplate.queryForObject(
                "select * from CUSTOMERSELLINGORBUYINGVEHICLE where VIN = ?",
                new BeanPropertyRowMapper<CustomerVehicle>(CustomerVehicle.class),id);
    }
}