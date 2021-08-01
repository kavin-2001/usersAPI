package com.example.restservicecors;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class More {

	 public More(String address_line1, String address_line2, String address_line3, String phone) {
		super();
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.address_line3 = address_line3;
		this.phone = phone;
	}
	private String address_line1;
	 private String address_line2;
	 private String address_line3;
	 private String phone;
	public String getAddress_line1() {
		return address_line1;
	}
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}
	public String getAddress_line2() {
		return address_line2;
	}
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}
	public String getAddress_line3() {
		return address_line3;
	}
	public void setAddress_line3(String address_line3) {
		this.address_line3 = address_line3;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
