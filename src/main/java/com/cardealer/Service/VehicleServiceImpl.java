package com.cardealer.Service;

import java.util.List;
import java.util.Optional;

import com.cardealer.Model.Vehicle;
import com.cardealer.Repository;
import com.springframework.beans.factory.annotation.Autowired;
import com.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService{

	@Autowired
	VehicleRepository vehicleRepository;
	
	
	@Override
	public int save(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

	@Override
	public int update(Vehicle vehicle) {
		return vehicleRepository.update(vehicle);
	}

	@Override
	public int deleteById(int id) {
		return vehicleRepository.deleteById(id);
	}

	@Override
	public List<Vehicle> findAll() {
		return vehicleRepository.findAll();
	}

	@Override
	public Optional<Vehicle> findById(Long id) {
		return vehicleRepository.findById(id);
	}

}
