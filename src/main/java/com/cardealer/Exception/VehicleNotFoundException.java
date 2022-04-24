package com.cardealer.Exception;

public class VehicleNotFoundException extends RuntimeException {
    public VehicleNotFoundException(Long id) {
        super("Could not find Vehicle " + id);
    }
}
