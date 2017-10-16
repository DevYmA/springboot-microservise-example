package com.yma.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.yma.app.repo.EvaluationRepository;
import com.yma.app.repo.EvaluationRepositoryRemote;

@SpringBootApplication
@EnableEurekaClient
public class PaymentServiceApplication {

	public static final String EVALUATION_SERVICE_URL = "http://evaluation-microservice";
	
	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public EvaluationRepository evaluationRepository() {
		return new EvaluationRepositoryRemote(EVALUATION_SERVICE_URL);
	}
}
