package microserviciosdapredioinfoeconomica.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class InfoEconomica {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="info_economico")
	private Long infoEconomica;
	
	private String avaluoCatastral;
	

	
	

}
