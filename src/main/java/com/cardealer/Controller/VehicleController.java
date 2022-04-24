package com.cardealer.Controller;

import com.cardealer.Model.Vehicle;
import com.cardealer.Repository.VehicleRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {

    private final VehicleRepository vehicleRepo;

    public VehicleController(VehicleRepository vehicleRepo) {
        this.vehicleRepo = vehicleRepo;
    }

    @GetMapping("/vehicles")
    List<Vehicle> all() {
        return vehicleRepo.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/vehicles")
    int newEmployee(@RequestBody Vehicle newVehicle) {
        return vehicleRepo.save(newVehicle);
    }

    // Single item

    @GetMapping("/vehicles/{id}")
    Vehicle one(@PathVariable Long id) {

        return vehicleRepo.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/vehicles/{id}")
    Vehicle replaceVehicle(@RequestBody Vehicle newVehicle, @PathVariable Long id) {

        return vehicleRepo.findById(id)
                .map(vehicle -> {
                    vehicle.setVehicleVIN(newVehicle.getVehicleVIN());
                    vehicle.setPrice(newVehicle.getPrice());
                    vehicle.setMake(newVehicle.getMake());
                    vehicle.setModel(newVehicle.getModel());
                    vehicle.setBody(newVehicle.getBody());
                    vehicle.setColor(newVehicle.getColor());
                    vehicle.setVehicleType(newVehicle.getvehicleType());
                    vehicle.setTowCapacity(newVehicle.getTowCapacity());
                    vehicle.setMotorcycleType(newVehicle.getMotorcycleType());
                    vehicle.setWaterCapacity(newVehicle.getWaterCapacity());
                    return vehicleRepo.save(vehicle);
                })
                .orElseGet(() -> {
                    newVehicle.setVehicleVIN(id);
                    return vehicleRepo.save(newVehicle);
                });
    }

    @DeleteMapping("/vehicles/{id}")
    void deleteEmployee(@PathVariable Long id) {
        vehicleRepo.deleteById(id);
    }
}
