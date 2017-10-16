/**
 * 
 */
package com.yma.app.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.yma.app.model.Evaluvation;

/**
 * @author Yoshan
 */
public class EvaluationRepositoryRemote implements EvaluationRepository{

	@Autowired
	protected RestTemplate restTemplate;
	
	protected String evalutionServiceURL;
	
	public EvaluationRepositoryRemote(String evalutionServiceURL) {
		this.evalutionServiceURL = evalutionServiceURL.startsWith("http")?evalutionServiceURL
									:"http://"+evalutionServiceURL;
	}
	
	
	@Override
	public Evaluvation getEvaluation() {			
		return restTemplate.getForObject(evalutionServiceURL+"/evaluation", Evaluvation.class);
	}

}
