package com.cardealer.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.cardealer.Model.Customer;
import com.cardealer.Model.Vehicle;
import com.cardealer.Model.motorcycleTypes;
import com.cardealer.Model.vehicleTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class VehicleRepositoryImpl implements VehicleRepository {

    // Just need to autowire JdbcTemplate, spring boot will
    // do auto configure
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public int save(Vehicle vehicle) {
        if (vehicle.getVehicleType() == vehicleTypes.Truck.toString()) {
            return jdbcTemplate.update(
                    "insert into VEHICLE (VIN, price,make, model, body,color,vehicleType,towCapacity,motorcycleType,waterCapacity) values(?,?,?,?,?,?,?,?,?,?)",
                    vehicle.getVehicleVIN(), vehicle.getPrice(), vehicle.getMake(), vehicle.getModel(), vehicle.getBody(), vehicle.getColor(), vehicle.getVehicleType(), vehicle.getTowCapacity(), null, null);
        } else if (vehicle.getVehicleType() == vehicleTypes.MotorCycle.toString()) {
            return jdbcTemplate.update(
                    "insert into VEHICLE (VIN, price,make, model, body,color,vehicleType,towCapacity,motorcycleType,waterCapacity) values(?,?,?,?,?,?,?,?,?,?)",
                    vehicle.getVehicleVIN(), vehicle.getPrice(), vehicle.getMake(), vehicle.getModel(), vehicle.getBody(), vehicle.getColor(), vehicle.getVehicleType(), null, vehicle.getMotorcycleType(), null);
        } else if (vehicle.getVehicleType() == vehicleTypes.RV.toString()) {
            return jdbcTemplate.update(
                    "insert into VEHICLE (VIN, price,make, model, body,color,vehicleType,towCapacity,motorcycleType,waterCapacity) values(?,?,?,?,?,?,?,?,?,?)",
                    vehicle.getVehicleVIN(), vehicle.getPrice(), vehicle.getMake(), vehicle.getModel(), vehicle.getBody(), vehicle.getColor(), vehicle.getVehicleType(), null, null, vehicle.getWaterCapacity());
        } else {
            return jdbcTemplate.update(
                    "insert into VEHICLE (VIN, price,make, model, body,color,vehicleType,towCapacity,motorcycleType,waterCapacity) values(?,?,?,?,?,?,?,?,?,?)",
                    vehicle.getVehicleVIN(), vehicle.getPrice(), vehicle.getMake(), vehicle.getModel(), vehicle.getBody(), vehicle.getColor(), vehicle.getVehicleType(), null, null, null);
        }
    }

    @Override
    public int update(Vehicle vehicle) {
        return jdbcTemplate.update(
                "update VEHICLE set price = ? set make = ? set model = ? set body = ? set color = ? set vehicleType = ? set towCapacity = ? set motorcycleType = ? set waterCapacity = ? where VIN = ? ",
                vehicle.getPrice(), vehicle.getMake(), vehicle.getModel(), vehicle.getBody(), vehicle.getColor(), vehicle.getVehicleType(), vehicle.getTowCapacity(), vehicle.getMotorcycleType(), vehicle.getWaterCapacity(), vehicle.getVehicleVIN());
    }


    @Override
    public int deleteById(String id) {
        return jdbcTemplate.update(
                "delete from VEHICLE where VIN = ?",
                id);
    }

    @Override
    public List<Vehicle> findAll() {
        return jdbcTemplate.query(
                "select * from VEHICLE",
                (rs, rowNum) ->
                        new Vehicle(
                                rs.getString("VIN"),
                                rs.getDouble("price"),
                                rs.getString("make"),
                                rs.getString("model"),
                                rs.getString("body"),
                                rs.getString("color"),
                                (rs.getString("vehicleType")),
                                rs.getString("towCapacity"),
                                (rs.getString("motorcycleType")),
                                rs.getString("waterCapacity")
                        )
        );
    }

    public List<Vehicle> findAllTrucks() {
        return jdbcTemplate.query(
                "select * from VEHICLE WHERE vehicleType = 'Truck'",
                (rs, rowNum) ->
                        new Vehicle(
                                rs.getString("VIN"),
                                rs.getDouble("price"),
                                rs.getString("make"),
                                rs.getString("model"),
                                rs.getString("body"),
                                rs.getString("color"),
                                (rs.getString("vehicleType")),
                                rs.getString("towCapacity"),
                                (rs.getString("motorcycleType")),
                                rs.getString("waterCapacity")
                        )
        );
    }

    @Override
    public List<Vehicle> findAllMotorcycles() {
        return jdbcTemplate.query(
                "select * from VEHICLE WHERE vehicleType ='MotorCycle' ",
                (rs, rowNum) ->
                        new Vehicle(
                                rs.getString("VIN"),
                                rs.getDouble("price"),
                                rs.getString("make"),
                                rs.getString("model"),
                                rs.getString("body"),
                                rs.getString("color"),
                                (rs.getString("vehicleType")),
                                rs.getString("towCapacity"),
                                (rs.getString("motorcycleType")),
                                rs.getString("waterCapacity")
                        )
        );
    }

    public List<Vehicle> findAllRVs() {
        return jdbcTemplate.query(
                "select * from VEHICLE WHERE vehicleType = 'RV' ",
                (rs, rowNum) ->
                        new Vehicle(
                                rs.getString("VIN"),
                                rs.getDouble("price"),
                                rs.getString("make"),
                                rs.getString("model"),
                                rs.getString("body"),
                                rs.getString("color"),
                                (rs.getString("vehicleType")),
                                rs.getString("towCapacity"),
                                (rs.getString("motorcycleType")),
                                rs.getString("waterCapacity")
                        )
        );
    }

    public List<Vehicle> findAllCars() {
        return jdbcTemplate.query(
                "select * from VEHICLE WHERE vehicleType ='CAR' ",
                (rs, rowNum) ->
                        new Vehicle(
                                rs.getString("VIN"),
                                rs.getDouble("price"),
                                rs.getString("make"),
                                rs.getString("model"),
                                rs.getString("body"),
                                rs.getString("color"),
                                (rs.getString("vehicleType")),
                                rs.getString("towCapacity"),
                                (rs.getString("motorcycleType")),
                                rs.getString("waterCapacity")
                        )
        );
    }

    @Override
    public Vehicle findById(String id) {
        return jdbcTemplate.queryForObject("select * from VEHICLE where VIN = ?",
                new BeanPropertyRowMapper<Vehicle>(Vehicle.class), id);
    }

    public int vehicleCount() {
        return jdbcTemplate.queryForObject("select count(*) from VEHICLE",Integer.class);
    }
}
