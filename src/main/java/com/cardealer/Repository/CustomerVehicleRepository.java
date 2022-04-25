package com.cardealer.Repository;

import java.util.List;
import java.util.Optional;

import com.cardealer.Model.CustomerVehicle;

public interface CustomerVehicleRepository{

    int save(CustomerVehicle customerVehicle);

    int updateCustomer(CustomerVehicle customerVehicle);

    int updateVehicle(CustomerVehicle customerVehicle);

    int deleteById(long id,String VIN);

    List<CustomerVehicle> findAll();

    Optional<CustomerVehicle> findByCustomerId(Long id);

    Optional<CustomerVehicle> findByVIN(Long id);

}
