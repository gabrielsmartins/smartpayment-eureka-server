package br.com.smartpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SmartPaymentEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartPaymentEurekaServerApplication.class, args);
	}

}
