package com.ecommerce.ajsanta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AjsantaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AjsantaApplication.class, args);

	}

}
