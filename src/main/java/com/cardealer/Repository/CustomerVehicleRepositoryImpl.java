package com.cardealer.Repository;

import java.util.List;
import java.util.Optional;

import com.cardealer.Model.CustomerVehicle;
import com.springframework.beans.factory.annotation.Autowired;
import com.springframework.jdbc.core.JdbcTemplate;
import com.springframework.stereotype.Repository;

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
    public int deleteById(int customerId, String VIN) {
        return jdbcTemplate.update(
                "delete CUSTOMERSELLINGORBUYINGVEHICLE where customerId = ? and VIN = ?",
                id,VIN);
    }

    @Override
    public List<CustomerVehicle> findAll() {
        return jdbcTemplate.query(
                "select * from CUSTOMERSELLINGORBUYINGVEHICLE",
                (rs, rowNum) ->
                        new CustomerVehicle(
                                rs.getInt("customerId"),
                                rs.getString("VIN")
                        )
        );
    }

    @Override
    public Optional<CustomerVehicle> findByCustomerId(Long id) {
        return jdbcTemplate.queryForObject(
                "select * from CUSTOMERSELLINGORBUYINGVEHICLE where customerId = ?",
                new Object[]{id},
                (rs, rowNum) ->
                        Optional.of(new CustomerVehicle(
                                rs.getInt("customerId"),
                                rs.getString("VIN")
                        ))
        );
    }
        @Override
    public Optional<CustomerVehicle> findByVIN(Long id) {
        return jdbcTemplate.queryForObject(
                "select * from CUSTOMERSELLINGORBUYINGVEHICLE where VIN = ?",
                new Object[]{id},
                (rs, rowNum) ->
                        Optional.of(new CustomerVehicle(
                                rs.getInt("customerId"),
                                rs.getString("VIN")
                        ))
        );
    }
}