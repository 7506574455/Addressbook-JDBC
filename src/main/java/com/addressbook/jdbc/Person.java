package com.addressbook.jdbc;

public class Person {
	//variable declaration
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNo;
	private String email;

	
	public Person(int id, String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNo, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.email = email;
		
	}

	//toString method 
	@Override
	public String toString() {
		String persondetails;
		persondetails = "\nID: " + id + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAddress: "
				+ address + "\nCity: " + city + "\nState: " + state + "\nZip: " + zip + "\nPhone No: "
				+ phoneNo + "\nEmail: " + email + "\nEntry Date: " ;
		return persondetails;
	}
}

