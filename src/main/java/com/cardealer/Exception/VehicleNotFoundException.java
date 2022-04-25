package com.cardealer.Exception;

public class VehicleNotFoundException extends RuntimeException {
    public VehicleNotFoundException(String id) {
        super("Could not find Vehicle " + id);
    }
}
