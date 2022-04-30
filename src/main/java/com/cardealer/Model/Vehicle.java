package com.cardealer.Model;

import org.springframework.lang.Nullable;

import java.util.Objects;

public class Vehicle {

	private String VIN;
    private double price;
    private String make;
    private String model;
    private String body;
    private String color;
    private String vehicleType;
    @Nullable
    private String towCapacity;
    @Nullable
    private String motorcycleType;
    @Nullable
    private String waterCapacity;

    public Vehicle(){
    }

    public Vehicle(String VIN, double price, String make, String model, String body, String color, String vehicleType, String towCapacity, String motorcycleType, String waterCapacity) {
        this.VIN = VIN;
        this.price = price;
        this.make = make;
        this.model = model;
        this.body = body;
        this.color = color;
        this.vehicleType = vehicleType;
        this.towCapacity = towCapacity;
        this.motorcycleType = motorcycleType;
        this.waterCapacity = waterCapacity;
    }

    public Vehicle(String vin, double price, String make, String model, String body, String color) {
    }

    public String getVehicleVIN() {
        return VIN;
    }

    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getBody() {
        return body;
    }
    public String getColor() {
        return color;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public String getTowCapacity() {
        return towCapacity;
    }
    public String getMotorcycleType() {
        return motorcycleType;
    }
    public String getWaterCapacity() {
        return waterCapacity;
    }

    public void setVehicleVIN(String vehicleVIN) {
        this.VIN = vehicleVIN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBody(String body) {
        this.body = body;
    }
     public void setColor(String color) {
        this.color = color;
    }
     public void setVehicleType(vehicleTypes vehicleType) {
        this.vehicleType = vehicleType.toString();
    }
     public void setTowCapacity(String towCapacity) {
        this.towCapacity = towCapacity;
    }
     public void setMotorcycleType(motorcycleTypes motorcycleType) {
        if(motorcycleType == null){
            this.motorcycleType = null;
        }
        else {
            this.motorcycleType = motorcycleType.toString();
        }
    }
     public void setWaterCapacity(String waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return VIN == vehicle.VIN && price == vehicle.price && make == vehicle.make && model == vehicle.model && body == vehicle.body
                && color.equals(vehicle.color)&& vehicleType.equals(vehicle.vehicleType)
                && towCapacity == vehicle.towCapacity && motorcycleType.equals(vehicle.motorcycleType)&& waterCapacity == vehicle.waterCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(VIN,price,make,model,body,color,vehicleType,towCapacity,motorcycleType,waterCapacity);
    }

    @Override
    public String toString()
    {
        if(this.vehicleType == vehicleTypes.Truck.toString()){
            return this.VIN + " " + this.vehicleType + " " + this.body + " " + this.make + " "+ this.model+" "
                    + this.color + " "+ this.towCapacity + " "+ this.price;
        }
        else if(this.vehicleType == vehicleTypes.MotorCycle.toString()){
            return this.VIN + " " + this.vehicleType + " " + this.body + " " + this.make + " "+ this.model+" "
                    + this.color + " "+ this.motorcycleType + " "+ this.price;
        }
        else if(this.vehicleType == vehicleTypes.RV.toString()){
            return this.VIN + " " + this.vehicleType + " " + this.body + " " + this.make + " "+ this.model+" "
                    + this.color + " "+ this.waterCapacity + " "+ this.price;
        }
        else{
            return this.VIN + " " + this.vehicleType + " " + this.body + " " + this.make + " "+ this.model +" "
                    + this.color + " "+ this.price;
        }
    }
}

