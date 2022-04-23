package com.cardealer.Model;

import java.util.Objects;

enum vehicleTypes{
   Truck,MotorCycle,RV,Car;
}
enum motorcycleTypes{
   SportsBike,Crusier,OffRoad,Touring;
}

public class Vehicle {
	private String VIN;
    private double price;
    private String make;
    private String model;
    private String body;
    private String color;
    private vehicleTypes vehicleType;
    private int towCapacity;
    private motorcycleTypes motorcycleType;
    private int waterCapacity;


    public Vehicle() {
    }

    public Vehicle(String VIN, double price, String make, String model, String body,String color,vehicleTypes vehicleType,int towCapacity,motorcycleTypes motorcycleType,int waterCapacity) {
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
    public vehicleTypes getvehicleType() {
        return vehicleType;
    }
    public int getTowCapacity() {
        return towCapacity;
    }
    public motorcycleTypes getMotorcycleType() {
        return motorcycleType;
    }
    public int getWaterCapacity() {
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
        this.vehicleType = vehicleType;
    }
     public void setTowCapacity(int towCapacity) {
        this.towCapacity = towCapacity;
    }
     public void setMotorcycleType(motorcycleTypes motorcycleType) {
        this.motorcycleType = motorcycleType;
    }
     public void setWaterCapacity(int waterCapacity) {
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
}

