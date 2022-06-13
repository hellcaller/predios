package com.microservicio.sda.predios.app.propiedad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicioSdaPrediosPropiedadApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioSdaPrediosPropiedadApplication.class, args);
	}

}
