package com.cg.smms.entities;

import javax.persistence.*;
import java.io.Serializable;

//Below annotation states that, the below class is a table in DB.
@Entity
@Table(name="user")
public class User implements Serializable{
	
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

@Column(name="type")
private String type;

@Column(name="password")
private String password;

//Mapping
@OneToOne(cascade = CascadeType.ALL)
private Customer customer_id;

@OneToOne(cascade = CascadeType.ALL)
private MallAdmin malladmin_id;

@OneToOne(cascade = CascadeType.ALL)
private ShopOwner shopowner_id;

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

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Customer getCustomer_id() {
	return customer_id;
}

public void setCustomer_id(Customer customer_id) {
	this.customer_id = customer_id;
}

public MallAdmin getMalladmin_id() {
	return malladmin_id;
}

public void setMalladmin_id(MallAdmin malladmin_id) {
	this.malladmin_id = malladmin_id;
}

public ShopOwner getShopowner_id() {
	return shopowner_id;
}

public void setShopowner_id(ShopOwner shopowner_id) {
	this.shopowner_id = shopowner_id;
}


}
