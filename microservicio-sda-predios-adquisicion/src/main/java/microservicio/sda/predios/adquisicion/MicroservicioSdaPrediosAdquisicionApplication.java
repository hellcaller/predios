package microservicio.sda.predios.adquisicion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({ "com.microservicio.sda.predios.app.informaciongeneral.models.entity",
		"com.microservicio.sda.predios.app.informacionfiscal.models.entity",
			"microservicio.sda.predios.adquisicion.models.entity" })
public class MicroservicioSdaPrediosAdquisicionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioSdaPrediosAdquisicionApplication.class, args);
	}

}
