package com.cardealer.Model;

import java.util.Objects;

public class Customer {

    private long customerId;
    private String fName;
    private String lName;
    private String address;
    private String phoneNumber;


    public Customer() {
    }

    public Customer(int customerId, String fName, String lName, String address, String phoneNumber) {
        this.customerId = customerId;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId && fName.equals(customer.fName) && lName.equals(customer.lName) && address.equals(customer.address) && phoneNumber.equals(customer.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, fName, lName, address, phoneNumber);
    }

}
