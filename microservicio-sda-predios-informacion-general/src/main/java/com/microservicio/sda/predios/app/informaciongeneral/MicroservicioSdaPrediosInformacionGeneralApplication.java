package com.microservicio.sda.predios.app.informaciongeneral;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({ "com.microservicio.sda.predios.app.informaciongeneral.models.entity",
		"com.microservicio.sda.predios.app.informacionfiscal.models.entity",
		"com.microservicio.sda.predios.app.localizacion.models.entity",
		"com.microservicio.sda.predios.app.informacioncatastral.models.entity",
		"com.microservicio.sda.predios.app.propiedad.models.entity" ,
		"microserviciosdapredioestudiosConceptos.model.entity",
		"microserviciosdaprediotecnicas.modesl.entity",
		"microserviciosdaprediosadquisicionFinal.models.entity"})
public class MicroservicioSdaPrediosInformacionGeneralApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioSdaPrediosInformacionGeneralApplication.class, args);
	}

}
