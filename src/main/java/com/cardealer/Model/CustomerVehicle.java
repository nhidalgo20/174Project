package com.cardealer.Model;

public class CustomerVehicle {
	private String VIN;
    private int customerID;


    public CustomerVehicle() {
    }

    public CustomerVehicle(String VIN, int customerId) {
        this.VIN = VIN;
        this.customerId = customerId;
    }

    public String getVehicleVIN() {
        return VIN;
    }

    public double getCustomerId() {
        return customerId;
    }

 
    public void setVehicleVIN(String vehicleVIN) {
        this.VIN = vehicleVIN;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerVehicle customerVehicle = (CustomerVehicle) o;
        return VIN == vehicle.VIN && customerId.equals(vehicle.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(VIN,customerId);
    }
}

