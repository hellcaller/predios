package com.microservicio.sda.predios.app.informacionfiscal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicioSdaPrediosInformacionFiscalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioSdaPrediosInformacionFiscalApplication.class, args);
	}

}
