package com.cardealer.Service;

import java.util.List;
import java.util.Optional;

import com.cardealer.Model.CustomerVehicle;
import com.cardealer.Repository.CustomerVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
		return customerVehicleRepository.updateCustomer(customerVehicle);
	}
		@Override
	public int updateVehicle(CustomerVehicle customerVehicle) {
		return customerVehicleRepository.updateVehicle(customerVehicle);
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
	public CustomerVehicle findByCustomerId(Long id) {
		return customerVehicleRepository.findByCustomerId(id);
	}
		@Override
	public CustomerVehicle findByVIN(Long id) {
		return customerVehicleRepository.findByVIN(id);
	}

}