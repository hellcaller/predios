package microserviciosdaprediojuridica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EntityScan({"microserviciosdaprediojuridica.model","microserviciosdapredioregistro.model"})
public class MicroservicioSdaPredioJuridicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioSdaPredioJuridicaApplication.class, args);
	}

}
