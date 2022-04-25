package com.cardealer.Service;

import java.util.List;
import java.util.Optional;

import com.cardealer.Model.CustomerVehicle;

public interface CustomerVehicleService {

	int save(CustomerVehicle customerVehicle);

    int updateCustomer(CustomerVehicle customerVehicle);

    int updateVehicle(CustomerVehicle customerVehicle);

    int deleteById(int id,String vin);

    List<CustomerVehicle> findAll();

    CustomerVehicle findByCustomerId(Long id);

    CustomerVehicle findByVIN(Long id);

}

