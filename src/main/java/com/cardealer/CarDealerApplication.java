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

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class CarDealerApplication implements CommandLineRunner{

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
				new Vehicle("JH4KA7532NC036794",12568.89,"Honda","Civic", "Coupe","Black", vehicleTypes.Car.toString(),"0",null,"0"),
				new Vehicle("1JCCN18N0CT047552",500.00,"Jeep","Cherokee", "Big","Red", vehicleTypes.Truck.toString(),"5410",null,"0"),
				new Vehicle("19UUA9E58AA800601",10000.00,"Acura","Long", "RV","Brown", vehicleTypes.RV.toString(),"0",null,"85"),
				new Vehicle("5J8TB4H56DLG00206",1.00,"Honda","Speedstire", "Small","Green", vehicleTypes.MotorCycle.toString(),"0", motorcycleTypes.Sports_Bike.toString(),"0")
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
		Vehicle vehicle = vehicleService.findById("JH4KA7532NC036794");
		System.out.println(vehicle);
		vehicle = vehicleService.findById("1JCCN18N0CT047552");
		System.out.println(vehicle);
		vehicle = vehicleService.findById("19UUA9E58AA800601");
		System.out.println(vehicle);

		System.out.println("get All vehicle: "+vehicleService.findAllTrucks());

		System.out.println("get All vehicle: "+vehicleService.findAllMotorcycles());

		System.out.println("get All vehicle: "+vehicleService.findAllRVs());

		System.out.println("get All vehicle: "+vehicleService.findAllCars());

		vehicleService.deleteById("JH4KA7532NC036794");

		System.out.println("get All vehicle: "+vehicleService.findAllCars());

	}
}
