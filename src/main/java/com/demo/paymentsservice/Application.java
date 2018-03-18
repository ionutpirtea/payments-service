package com.demo.paymentsservice;

import com.demo.paymentsservice.dao.PaymentResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;


public class Application  {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfig.class, args);
	}

}
