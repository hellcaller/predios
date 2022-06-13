package microserviciosdapredioestudiosConceptos.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import microservicio.proyecto.commons.controller.CommonController;
import microserviciosdapredioestudiosConceptos.model.entity.EstudiosyConceptos;
import microserviciosdapredioestudiosConceptos.services.EstudiosyConceptosService;


@RestController
public class estudiosyconceptosController  extends CommonController<EstudiosyConceptos, EstudiosyConceptosService>{
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody EstudiosyConceptos informacionestycon, @PathVariable Long id) {
		Optional<EstudiosyConceptos> optional = service.findById(id);
		if (optional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		EstudiosyConceptos informacionestyconDB = optional.get();
		informacionestyconDB.setEstudiotitulos(informacionestycon.getEstudiotitulos());
		informacionestyconDB.setElaboradopor(informacionestycon.getElaboradopor());
		informacionestyconDB.setFecharealizacion(informacionestycon.getFecharealizacion());
		informacionestyconDB.setLimitacion(informacionestycon.getLimitacion());
		informacionestyconDB.setDescripcion(informacionestycon.getDescripcion());
		informacionestyconDB.setVersiondoc(informacionestycon.getVersiondoc());
		informacionestyconDB.setAnexos(informacionestycon.getAnexos());		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(informacionestyconDB));
	}
	
	@GetMapping("/filtrar/{term}")
	public ResponseEntity<?> filtrar(@PathVariable String term){
		return ResponseEntity.ok(service.findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(term));
	}

}
