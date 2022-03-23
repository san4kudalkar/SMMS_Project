package com.cg.smms.entities;

import javax.persistence.*;
import java.io.Serializable;

//Below annotation states that, the below class is a table in DB.
@Entity
@Table(name="mall")

public class Mall implements Serializable {
	
	// Defining serial_id
	private static final long serialVersionUID = 1L;
	
	//Defining private instance variable

		// With Id annotation we are indicating that this is a primary key field
	
@Id
@Column(name="id")
private int id;

//Column annotation we are indicating the actual name of column of relational world.
@Column(name="mallName")
private String mallName;

@Column(name="location")
private String location;

@Column(name="categories")
private String categories;

//Mapping
@OneToOne(cascade = CascadeType.ALL)
private MallAdmin mallAdmin;

//GETTER & SETTER

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public MallAdmin getMallAdmin() {
	return mallAdmin;
}
public void setMallAdmin(MallAdmin mallAdmin) {
	this.mallAdmin = mallAdmin;
}
public String getMallName() {
	return mallName;
}
public void setMallName(String mallName) {
	this.mallName = mallName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getCategories() {
	return categories;
}
public void setCategories(String categories) {
	this.categories = categories;
}


}
