package com.microservicio.sda.predios.app.informacioncatastral;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({ "com.microservicio.sda.predios.app.informacioncatastral.models.entity",
		"com.microservicio.sda.predios.app.propiedad.models.entity" })
public class MicroservicioSdaPrediosInformacionCatastralApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioSdaPrediosInformacionCatastralApplication.class, args);
	}

}
