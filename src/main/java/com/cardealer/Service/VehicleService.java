package com.cardealer.Service;

import java.util.List;
import java.util.Optional;

import com.cardealer.Model.Vehicle;

public interface VehicleService {
	int save(Vehicle vehicle);
    int update(Vehicle vehicle);
    int deleteById(String id);
    List<Vehicle> findAll();
    List<Vehicle> findAllTrucks();
    List<Vehicle> findAllMotorcycles();
    List<Vehicle> findAllRVs();
    List<Vehicle> findAllCars();
    Vehicle findById(String id);
}