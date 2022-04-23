package com.cardealer.Service;

import java.util.List;
import java.util.Optional;

import com.cardealer.Model.Vehicle;

public interface VehicleService {

	int save(Vehicle vehicle);

    int update(Vehicle vehicle);

    int deleteById(int id);

    List<Vehicle> findAll();
    
    Optional<Vehicle> findById(Long id);

}