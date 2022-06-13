package microserviciosdaprediotecnicas.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import microservicio.proyecto.commons.controller.CommonController;
import microserviciosdaprediotecnicas.modesl.entity.InformacionTecnica;
import microserviciosdaprediotecnicas.service.InformacionTecnicaService;


@RestController
public class InformacionTecnicaController extends CommonController<InformacionTecnica, InformacionTecnicaService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody InformacionTecnica informacionTecnica, @PathVariable Long id) {
		Optional<InformacionTecnica> optional = service.findById(id);
		if (optional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		InformacionTecnica informacionTecnicaDB = optional.get();
		informacionTecnicaDB.setAreaterreno(informacionTecnica.getAreaterreno());
		informacionTecnicaDB.setEscrituraha(informacionTecnica.getEscrituraha());
		informacionTecnicaDB.setEscrituram2(informacionTecnica.getEscrituram2());
		informacionTecnicaDB.setCerttradlib(informacionTecnica.getCerttradlib());
		informacionTecnicaDB.setCerttradlibm2(informacionTecnica.getCerttradlibm2());
		informacionTecnicaDB.setLevantopo(informacionTecnica.getLevantopo());
		informacionTecnicaDB.setCertcablin(informacionTecnica.getCertcablin());
		informacionTecnicaDB.setUaecdm2(informacionTecnica.getUaecdm2());
		informacionTecnicaDB.setAreaaquid(informacionTecnica.getAreaaquid());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(informacionTecnicaDB));
	}
	
	@GetMapping("/filtrar/{term}")
	public ResponseEntity<?> filtrar(@PathVariable String term){
		return ResponseEntity.ok(service.findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(term));
	}
	
}
