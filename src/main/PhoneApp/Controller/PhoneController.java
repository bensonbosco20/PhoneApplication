package com.user.benson.PhoneApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.user.benson.PhoneApp.Service.PhoneService;

@Component
@RestController
public class PhoneController {

	@Autowired
	PhoneService phoneService;

	@GetMapping("/getAllNumbers")
	private String getPhoneNumber() {
		return new Gson().toJson(phoneService.getAllNumbers());
	}

	@GetMapping("/getNumByCust")
	private String getNumberByCustomer(@RequestParam String name) {
		return new Gson().toJson(phoneService.getNumbersByCustomer(name));
	}

	@PostMapping("/activateNumber")
	private String activateNumber(@RequestParam int number) {
		return new Gson().toJson(phoneService.activateNumber(number));
	}
}
