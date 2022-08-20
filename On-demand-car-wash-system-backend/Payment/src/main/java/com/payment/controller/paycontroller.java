package com.payment.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.payment.model.paymentdetails;
import com.payment.service.payservice;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/gateway")
public class paycontroller {
	
	Logger logger= org.slf4j.LoggerFactory.getLogger(paycontroller.class);
	@Autowired
	public payservice service;
	
	@PostMapping("/pay")
	public paymentdetails pay(@RequestBody paymentdetails payment) {
	//	payment.setTransId(service.getSequenceNumber(paymentdetails.SEQUENCE_NAME));
		return service.pay(payment);
	}

}
