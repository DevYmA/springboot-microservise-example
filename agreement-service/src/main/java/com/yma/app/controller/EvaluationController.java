/**
 * 
 */
package com.yma.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yma.app.model.Evaluvation;
import com.yma.app.repo.EvaluationRepository;

/**
 * @author Yoshan
 */
@RestController
public class EvaluationController {

	@Autowired
	protected EvaluationRepository evaluationRepo;
	
	@GetMapping("/")
	public Evaluvation getOtherPodsDetail(){
		return evaluationRepo.getEvaluation();
	}
}
