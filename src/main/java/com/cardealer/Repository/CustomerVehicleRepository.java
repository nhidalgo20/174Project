package com.cardealer.Repository;

import java.util.List;

import com.cardealer.Model.CustomerVehicle;

public interface CustomerVehicleRepository{

    int save(CustomerVehicle customerVehicle);

    int updateCustomer(CustomerVehicle customerVehicle);

    int updateVehicle(CustomerVehicle customerVehicle);

    int deleteById(long id,String VIN);

    List<CustomerVehicle> findAll();

    CustomerVehicle findByCustomerId(Long id);

    CustomerVehicle findByVIN(Long id);

}
