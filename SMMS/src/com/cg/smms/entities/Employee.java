package com.cg.smms.entities;

import java.time.LocalDate;
import java.io.Serializable;
import javax.persistence.*;


//Below annotation states that, the below class is a table in DB.
@Entity
@Table(name="employee")

public class Employee implements Serializable
{
	
	// Defining serial_id 
	private static final long serialVersionUID = 1L;
	
	//Defining private instance variable

		// With Id annotation we are indicating that this is a primary key field
	
@Id
@Column(name="id")
private int id;

//Column annotation we are indicating the actual name of column of relational world.
@Column(name="name")
private String name;

@Column(name="dob")
private LocalDate dob;

@Column(name="salary")
private float salary;

@Column(name="address")
private String address;

@Column(name="designation")
private String designation;

//Mapping
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="shopId")
private Shop shop;

//GETTER & SETTER

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Shop getShop() {
	return shop;
}
public void setShop(Shop shop) {
	this.shop = shop;
}

}