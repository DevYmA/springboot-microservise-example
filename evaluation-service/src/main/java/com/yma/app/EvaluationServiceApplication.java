package com.yma.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.yma.app.repo.PaymentRepository;
import com.yma.app.repo.PaymentRepositoryRemote;

/**
 * @author Yoshan
 */

@SpringBootApplication
@EnableEurekaClient
public class EvaluationServiceApplication {

	public static final String PAYMENT_SERVICE_URL = "http://payment-microservice";
	
	public static void main(String[] args) {
		SpringApplication.run(EvaluationServiceApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public PaymentRepository paymentRepository(){
		return new PaymentRepositoryRemote(PAYMENT_SERVICE_URL);
	}
	
	
}
