package com.user.benson.PhoneApp.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.user.benson.PhoneApp.Model.Customer;
import com.user.benson.PhoneApp.Model.Phone;

@Service
public class PhoneServiceImpl implements PhoneService {

	List<Customer> customer = new ArrayList<>();

	public void popilateData() {

		List<Phone> phone1 = new ArrayList<>();
		phone1.add(new Phone(987654, "Active"));
		customer.add(new Customer("Ben", "Adelaide", phone1));

		List<Phone> phone2 = new ArrayList<>();
		phone2.add(new Phone(45678, "Active"));
		phone2.add(new Phone(321564, "Deactive"));
		phone2.add(new Phone(654324, "Deactive"));
		customer.add(new Customer("Sam", "Sydney", phone2));

		List<Phone> phone3 = new ArrayList<>();
		phone3.add(new Phone(76341287, "Active"));
		phone3.add(new Phone(34587632, "Deactive"));
		customer.add(new Customer("Ken", "Perth", phone3));
		System.out.println(customer.toString());
	}

	@Override
	public List<Phone> getAllNumbers() {
		return customer.stream().flatMap(ph -> ph.getPhoneNumber().stream()).collect(Collectors.toList());
	}

	@Override
	public List<Integer> getNumbersByCustomer(String name) {
		List<Integer> numLst = new ArrayList<>();
		try {
			numLst = customer.stream().filter(cus -> cus.getCustName().equals(name))
					.flatMap(cus -> cus.getPhoneNumber().stream()).map(ph -> ph.getPhoneNo())
					.collect(Collectors.toList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return numLst;
	}

	@Override
	public String activateNumber(int number) {
		String returnMsg = "";
		try {
			Phone phone = customer.stream().flatMap(phNo -> phNo.getPhoneNumber().stream())
					.filter(ph -> ph.getPhoneNo() == number).findFirst().orElse(null);

			if (null != phone) {
				if (phone.getStatus().equals("Deactive")) {
					phone.setStatus("Active");
					returnMsg = "Success";
				} else {
					returnMsg = "Number Already Active";
				}
			} else {
				returnMsg = "Number not Found";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnMsg;
	}
}
