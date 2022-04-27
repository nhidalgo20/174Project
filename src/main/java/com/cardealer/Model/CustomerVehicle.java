package com.cardealer.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

public class CustomerVehicle {

	private String VIN;
    private int customerId;


    public CustomerVehicle(String customerId, String vin) {
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
        return VIN == customerVehicle.VIN && customerId == customerVehicle.customerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(VIN,customerId);
    }
}

