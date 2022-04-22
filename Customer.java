import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Customer {

  private @Id @GeneratedValue int customerId;
  private String fname;
  private String lname;
  private String role;
  private String address;
  private String phoneNumber;

  Customer() {}

  Customer(String fname, String lname, String role, String address, String phoneNumber) {

    this.fname = fname;
    this.lname = lname;
    this.role = role;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public int getId() {
    return this.id;
  }

  public String getFname() {
    return this.fname;
  }
  
    public String getLname() {
    return this.lname;
  }

  public String getRole() {
    return this.role;
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }
  
  public void setLname(String lname) {
    this.lname = lname;
  }

  public void setRole(String role) {
    this.role = role;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Customer))
      return false;
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) && Objects.equals(this.fname, customer.fname)
        && Objects.equals(this.role, costumer.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.fname, this.lname, this.role, this.address, this. phoneNumber);
  }

  @Override
  public String toString() {
    return "Customer{" + "id=" + this.id + ", fname='" + this.fname + '\'' + ", role='" + this.role + '\'' + '}';
  }
}