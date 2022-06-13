package com.microservicio.sda.predios.app.localizacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicioSdaPrediosLocalizacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioSdaPrediosLocalizacionApplication.class, args);
	}

}
