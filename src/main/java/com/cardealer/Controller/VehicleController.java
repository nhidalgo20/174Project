//package com.cardealer.Controller;
//
//import com.cardealer.Model.Vehicle;
//
//import com.cardealer.Service.VehicleService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class VehicleController {
//
//    private final VehicleService vehicleService;
//
//    public VehicleController(VehicleService vehicleService) {
//        this.vehicleService = vehicleService;
//    }
//
//    @GetMapping("/vehicles")
//    List<Vehicle> all() {
//        return vehicleService.findAll();
//    }
//    // end::get-aggregate-root[]
//
//    @PostMapping("/vehicles")
//    int newEmployee(@RequestBody Vehicle newVehicle) {
//        return vehicleService.save(newVehicle);
//    }
//
//    // Single item
//
//    @GetMapping("/vehicles/{id}")
//    Vehicle oneVehicle(@PathVariable String id) {
//
//        return vehicleService.findById(id);
//    }
//
////    @PutMapping("/vehicles/{id}")
////    Integer replaceVehicle(@RequestBody Vehicle newVehicle, @PathVariable String id) {
////        return vehicleService.findById(id).map( vehicle -> {
////            vehicle.setVehicleVIN(newVehicle.getVehicleVIN());
////            vehicle.setVehicleType(newVehicle.getVehicleType());
////            vehicle.setBody(newVehicle.getBody());
////            vehicle.setMake(newVehicle.getMake());
////            vehicle.setColor(newVehicle.getColor());
////            vehicle.setModel(newVehicle.getModel());
////            vehicle.setMotorcycleType(newVehicle.getMotorcycleType());
////            vehicle.setPrice(newVehicle.getPrice());
////            vehicle.setTowCapacity(newVehicle.getTowCapacity());
////            vehicle.setWaterCapacity(newVehicle.getWaterCapacity());
////            return vehicleRepo.save(vehicle);
////        }).orElseGet(()->{
////            newVehicle.getVehicleVIN();
////            return vehicleRepo.save(newVehicle);
////        });
////    }
//
//    @DeleteMapping("/vehicles/{id}")
//    void deleteEmployee(@PathVariable String id) {
//        vehicleService.deleteById(id);
//    }
//}
