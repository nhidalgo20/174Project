package com.cardealer;

import com.cardealer.Model.Customer;
import com.cardealer.Model.Vehicle;
import com.cardealer.Model.motorcycleTypes;
import com.cardealer.Model.vehicleTypes;
import com.cardealer.Service.CustomerService;
import com.cardealer.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class CarDealerApplication implements CommandLineRunner {

	@Autowired
	CustomerService customerService;
	@Autowired
	VehicleService vehicleService;
	public static void main(String[] args) {
		SpringApplication.run(CarDealerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("StartApplication....");
		testCustomerData();
	}
	void testCustomerData() {

		List customers = Arrays.asList(
				new Customer(1,"John","Hit","784 away strig", "784-779-4891"),
				new Customer(1,"Bext","asd","789 away strig", "654-321-4568"),
				new Customer(1,"No","You","suhc away strig", "465-779-4891")
		);
		List vehicles = Arrays.asList(
				new Vehicle("JH4KA7532NC036794",19999,"Honda","Civic", "Coupe","Black", vehicleTypes.Car.toString()),
				new Vehicle("1JCCN18N0CT047552",50000,"Jeep","Cherokee", "Big","Red", vehicleTypes.Truck.toString(),5410),
				new Vehicle("19UUA9E58AA800601",1000000,"Acura","Long", "RV","Brown", vehicleTypes.RV.toString(),0,null,85),
				new Vehicle("5J8TB4H56DLG00206",00001,"Honda","Speedstire", "Small","Green", vehicleTypes.MotorCycle.toString(),0, motorcycleTypes.SportsBike.toString(),0)
		);


		System.out.println("[Start Save] Customer");
		customers.forEach(customer -> {
			customerService.save((Customer) customer);
		});
		System.out.println("[Save] Customer");

		System.out.println("[Start Save] vehicle");
		vehicles.forEach(vehicle -> {
			vehicleService.save((Vehicle) vehicle);
		});
		System.out.println("[Save] vehicle");

		// find all
		System.out.println("get All students: "+customerService.findAll());

		// find by id
		System.out.println("Find Student with id 1");
		Customer customer = customerService.findById(1);
		System.out.println(customer);

		System.out.println("get All vehicle: "+vehicleService.findAll());

	}
}
