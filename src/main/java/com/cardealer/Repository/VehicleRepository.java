package com.cardealer.Repository;

import java.util.List;

import com.cardealer.Model.Vehicle;

public interface VehicleRepository{
 
	int save(Vehicle vehicle);

    int update(Vehicle vehicle);

    int deleteById(String id);

    List<Vehicle> findAll();
    
    Vehicle findById(String id);

}