package com.deeplal.studentapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	public Student() {
		super();
	}

	public Student(long id, String firstName, String lastName, String yearOfAdmission, String address, int standard) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfAdmission = yearOfAdmission;
		this.address = address;
		this.standard = standard;
	}

	@Id
	private long id;
	private String firstName;
	private String lastName;
	private String yearOfAdmission;
	private String address;
	private int standard;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getYearOfAdmission() {
		return yearOfAdmission;
	}

	public void setYearOfAdmission(String yearOfAdmission) {
		this.yearOfAdmission = yearOfAdmission;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", yearOfAdmission="
				+ yearOfAdmission + ", address=" + address + ", standard=" + standard + "]";
	}
}
