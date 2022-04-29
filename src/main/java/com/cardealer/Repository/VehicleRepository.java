package com.cardealer.Repository;

import java.util.List;

import com.cardealer.Model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository {
 
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