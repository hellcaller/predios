package microserviciosdapredioregistro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicioSdaPredioRegistroApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioSdaPredioRegistroApplication.class, args);
	}

}
