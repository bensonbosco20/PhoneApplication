package com.user.benson.PhoneApp.Model;

import java.util.List;

public class Customer {
	private String custName;
	private String location;
	private List<Phone> phoneNumber;

	public Customer(String custName, String location, List<Phone> phoneNumber) {
		this.custName = custName;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Phone> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<Phone> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", location =" + location + ", phoneNumber=" + phoneNumber + "]";
	}
}
