package com.cardealer.Repository;

import java.util.List;
import java.util.Optional;

import com.cardealer.Model.Vehicle;
import com.springframework.beans.factory.annotation.Autowired;
import com.springframework.jdbc.core.JdbcTemplate;
import com.springframework.stereotype.Repository;

@Repository
public class VehicleRepositoryImpl implements VehicleRepository {

	// Just need to autowire JdbcTemplate, spring boot will
	// do auto configure
    @Autowired
    private JdbcTemplate jdbcTemplate;

    
    @Override
    public int save(Vehicle vehicle) {
        return jdbcTemplate.update(
                "insert into vehicle (VIN, price,make, model, body,color,vehicleType,towCapacity,motorcycleType,waterCapacity) values(?,?,?,?,?,?,?,?,?,?)",
                vehicle.getVehicleVIN(), vehicle.getPrice(),vehicle.getMake(),vehicle.getModel(),vehicle.getBody(),vehicle.getColor(),vehicle.getvehicleType(),vehicle.getTowCapacity(),vehicle.getMotorcycleType(),vehicle.getWaterCapacity());
    }

    @Override
    public int update(Vehicle vehicle) {
        return jdbcTemplate.update(
                "update vehicle set price = ? set make = ? set model = ? set body = ? set color = ? set vehicleType = ? set towCapacity = ? set motorcycleType = ? set waterCapacity = ? where VIN = ? ",
                vehicle.getPrice(),vehicle.getMake(),vehicle.getModel(),vehicle.getBody(),vehicle.getColor(),vehicle.getvehicleType(),vehicle.getTowCapacity(),vehicle.getMotorcycleType(),vehicle.getWaterCapacity()vehicle.getVehicleVIN(),);
    }


    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update(
                "delete vehicle where VIN = ?",
                id);
    }

    @Override
    public List<Vehicle> findAll() {
        return jdbcTemplate.query(
                "select * from vehicle",
                (rs, rowNum) ->
                        new Vehicle(
                                rs.getString("VIN"),
                                rs.getDouble("price"),
                                rs.getString("make"),
                                rs.getString("model"),
                                rs.getString("body"),
                                rs.getString("color"),
                                rs.getString("vehicleType"),
                                rs.getInt("towCapacity"),
                                rs.getString("motorcycleType"),
                                rs.getInt("waterCapacity"),
                        )
        );
    }

    @Override
    public Optional<Vehicle> findById(Long id) {
        return jdbcTemplate.queryForObject(
                "select * from vehicle where VIN = ?",
                new Object[]{id},
                (rs, rowNum) ->
                        Optional.of(new Vehicle(
                                rs.getString("VIN"),
                                rs.getDouble("price"),
                                rs.getString("make"),
                                rs.getString("model"),
                                rs.getString("body"),
                                rs.getString("color"),
                                rs.getString("vehicleType"),
                                rs.getInt("towCapacity"),
                                rs.getString("motorcycleType"),
                                rs.getInt("waterCapacity"),
                        ))
        );
    }
}