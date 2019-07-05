package com.gp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {
@Id@GeneratedValue
private int personId;
@Column
private String personName;
@Column
private String mobile;
@OneToMany(mappedBy="person")
private List<Vehicle> vehicles=new ArrayList<Vehicle>();
/*@OneToOne
private Vehicle vehicle;*/
public Person() {
	super();
}
public Person(int personId, String personName, String mobile) {
	super();
	this.personId = personId;
	this.personName = personName;
	this.mobile = mobile;
}

public int getPersonId() {
	return personId;
}

public void setPersonId(int personId) {
	this.personId = personId;
}

public String getPersonName() {
	return personName;
}

public void setPersonName(String personName) {
	this.personName = personName;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}
/*public Vehicle getVehicle() {
	return vehicle;
}
public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}*/


public List<Vehicle> getVehicles() {
	return vehicles;
}

public void setVehicles(List<Vehicle> vehicles) {
	this.vehicles = vehicles;
}
}