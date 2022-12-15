package com.idat.MSCliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfRicardoLeonMsClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfRicardoLeonMsClienteApplication.class, args);
	}

}
