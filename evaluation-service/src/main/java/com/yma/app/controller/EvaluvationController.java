package com.yma.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yma.app.model.Payment;
import com.yma.app.repo.PaymentRepository;

/**
 * @author Yoshan
 */

@RestController
public class EvaluvationController {
	
	@Autowired
	protected PaymentRepository paymentRepository;

	@GetMapping("/evaluation")
	public Payment getOtherPodsDetail(){
		return new Payment(new Long(10001), "Evaluation");
	}
}
