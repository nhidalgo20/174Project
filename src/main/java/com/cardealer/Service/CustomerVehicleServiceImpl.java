package com.cardealer.Service;

import java.util.List;
import java.util.Optional;

import com.cardealer.Model.CustomerVehicle;
import com.cardealer.Repository;
import com.springframework.beans.factory.annotation.Autowired;
import com.springframework.stereotype.Service;

@Service
public class CustomerVehicleServiceImpl implements CustomerVehicleService{

	@Autowired
	CustomerVehicleRepository customerVehicleRepository;
	
	
	@Override
	public int save(CustomerVehicle customerVehicle) {
		return customerVehicleRepository.save(customerVehicle);
	}

	@Override
	public int updateCustomer(CustomerVehicle customerVehicle) {
		return customerVehicleRepository.update(customerVehicle);
	}
		@Override
	public int updateVehicle(CustomerVehicle customerVehicle) {
		return customerVehicleRepository.update(customerVehicle);
	}

	@Override
	public int deleteById(int id,String vin) {
		return customerVehicleRepository.deleteById(id,vin);
	}

	@Override
	public List<CustomerVehicle> findAll() {
		return customerVehicleRepository.findAll();
	}

	@Override
	public Optional<CustomerVehicle> findByCustomerId(Long id) {
		return customerVehicleRepository.findByCustomerId(id);
	}
		@Override
	public Optional<CustomerVehicle> findByVIN(Long id) {
		return customerVehicleRepository.findByVIN(id);
	}

}