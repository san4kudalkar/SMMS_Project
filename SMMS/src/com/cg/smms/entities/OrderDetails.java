package com.cg.smms.entities;

import java.time.LocalDate;
import java.io.Serializable;
import javax.persistence.*;

//Below annotation states that, the below class is a table in DB.
@Entity
@Table(name="orderdetails") 


public class OrderDetails implements Serializable 
{

	// Defining serial_id
	private static final long serialVersionUID = 1L;
	
	//Defining private instance variable

			// With Id annotation we are indicating that this is a primary key field
	
@Id	
@Column(name="id")
private int id;

//Column annotation we are indicating the actual name of column of relational world.
@Column(name="dateOfPurchase")
private LocalDate dateOfPurchase;

@Column(name="total")
private float total;

@Column(name="paymentMode")
private String paymentMode;

//Mapping
@ManyToOne(cascade = CascadeType.ALL)
private Customer customer;

//GETTER & SETTER

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public LocalDate getDateOfPurchase() {
	return dateOfPurchase;
}
public void setDateOfPurchase(LocalDate dateOfPurchase) {
	this.dateOfPurchase = dateOfPurchase;
}
public float getTotal() {
	return total;
}
public void setTotal(float total) {
	this.total = total;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer_id(Customer customer) {
	this.customer = customer;
}
public String getPaymentMode() {
	return paymentMode;
}
public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}


}
