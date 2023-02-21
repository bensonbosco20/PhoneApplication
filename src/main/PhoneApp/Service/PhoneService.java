package com.user.benson.PhoneApp.Service;

import java.util.List;

import com.user.benson.PhoneApp.Model.Phone;

public interface PhoneService {

	List<Phone> getAllNumbers();

	List<Integer> getNumbersByCustomer(String name);

	String activateNumber(int number);

	void popilateData();
}
