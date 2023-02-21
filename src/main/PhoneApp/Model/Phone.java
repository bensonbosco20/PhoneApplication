package com.user.benson.PhoneApp.Model;

public class Phone {

	private int phoneNo;
	private String status;

	public Phone(int phoneNo, String status) {
		this.phoneNo = phoneNo;
		this.status = status;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "phone [phoneNo=" + phoneNo + ", status=" + status + "]";
	}
}
