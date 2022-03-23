package com.cg.smms.entities;

//Importing annotation from persistence 
import javax.persistence.*;
import java.util.List;

//Importing this interface to make serial id 
import java.io.Serializable;

//Importing annotation from persistence 
@Entity
@Table(name="customer")

public class Customer implements Serializable {
	
	// Defining serializale_id 
	private static final long serialVersionUID = 1L;
	
	
	//Defining private instance variable

		// With Id annotation we are indicating that this is a primary key field
@Id
@Column(name="id")
private int id;

//Column annotation we are indicating the actual name of column of relational world.
@Column(name="name")
private String name;

@Column(name="phone")
private String phone;

@Column(name="email")
private String email;

//Mapping the relations
@OneToMany(cascade = CascadeType.ALL)
private List<OrderDetails> order;

@OneToMany(cascade = CascadeType.ALL)
private List<User> user;


//GETTER & SETTER

public List<User> getUser() {
	return user;
}
public void setUser(List<User> user) {
	this.user = user;
}
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public List<OrderDetails> getOrder() {
	return order;
}
public void setOrder_id(List<OrderDetails> order) {
	this.order = order;
}



}
