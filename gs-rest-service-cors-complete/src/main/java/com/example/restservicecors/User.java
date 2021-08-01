package com.example.restservicecors;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	
	public User(String name, int age, String dob, String firstName, String lastName, More more) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.firstName = firstName;
		this.lastName = lastName;
		this.more = more;
	}
	private String name;
	private int age;
	private String dob;
	private String firstName;
	private String lastName;
	private More more;
	public String getName() {
		return firstName + " " + lastName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
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
	public More getMore() {
		return more;
	}
	public void setMore(More more) {
		this.more = more;
	}


}
