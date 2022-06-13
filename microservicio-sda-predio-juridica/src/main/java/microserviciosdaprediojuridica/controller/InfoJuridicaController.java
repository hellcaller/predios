package microserviciosdaprediojuridica.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import microservicio.proyecto.commons.controller.CommonController;
import microserviciosdaprediojuridica.model.InfoJuridica;
import microserviciosdaprediojuridica.service.InfoJuridicaService;
import microserviciosdapredioregistro.model.Registro;

@RestController
@CrossOrigin("")
public class InfoJuridicaController extends CommonController<InfoJuridica, InfoJuridicaService> {

	@PutMapping("/{id}/asignar-registro")
	public ResponseEntity<?> asignarLineamientos (@RequestBody List <Registro> registros,@PathVariable Long id)
	{
		Optional<InfoJuridica> o = this.service.findById(id);
		if(!o.isPresent())
		{
			return ResponseEntity.notFound().build();
		}
		InfoJuridica dbJuridica = o.get();
		
		registros.forEach(a -> {
			dbJuridica.addRegistro(a);
		});
			
		
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(dbJuridica));
	}	
	
}
