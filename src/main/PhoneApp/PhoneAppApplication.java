package com.user.benson.PhoneApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.user.benson.PhoneApp.Service.PhoneService;

@SpringBootApplication
public class PhoneAppApplication {

	@Autowired
	PhoneService phoneService;

	public static void main(String[] args) {
		SpringApplication.run(PhoneAppApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void popilateData() {
		phoneService.popilateData();
	}

}
