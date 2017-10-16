package com.yma.app.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.yma.app.model.Payment;

/**
 * @author Yoshan
 */

public class PaymentRepositoryRemote implements PaymentRepository{

	@Autowired
	protected RestTemplate restTemplate;
	
	protected String paymentServiceURL;
	
	public PaymentRepositoryRemote(String paymentServiceURL) {
		this.paymentServiceURL = paymentServiceURL.startsWith("http") ? paymentServiceURL
				: "http://" + paymentServiceURL;
	}
	
	@Override
	public Payment getPayment() {
		return restTemplate.getForObject(paymentServiceURL+"/payment", Payment.class);
	}

}
