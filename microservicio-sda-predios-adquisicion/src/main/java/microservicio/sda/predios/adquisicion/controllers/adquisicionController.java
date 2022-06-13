package microservicio.sda.predios.adquisicion.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import microservicio.proyecto.commons.controller.CommonController;
import microservicio.sda.predios.adquisicion.models.entity.Adquisicion;
import microservicio.sda.predios.adquisicion.services.adquisicionService;



@CrossOrigin("*")
@RestController
public class adquisicionController extends CommonController<Adquisicion, adquisicionService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Adquisicion informacionAdquisicion, @PathVariable Long id) {
		Optional<Adquisicion> optional = service.findById(id);
		if (optional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		Adquisicion informacionAdquisicionDB = optional.get();
		informacionAdquisicionDB.setOferta(informacionAdquisicion.getOferta());
		informacionAdquisicionDB.setFechaoferta(informacionAdquisicion.getFechaoferta());
		informacionAdquisicionDB.setOficionot(informacionAdquisicion.getOficionot());
		informacionAdquisicionDB.setFechanot(informacionAdquisicion.getFechanot());
		informacionAdquisicionDB.setFechaacepoferta(informacionAdquisicion.getFechaacepoferta());
		informacionAdquisicionDB.setFechainscripcionoferta(informacionAdquisicion.getFechainscripcionoferta());
		informacionAdquisicionDB.setFechaoficioinscripcionofer(informacionAdquisicion.getFechaoficioinscripcionofer());
		informacionAdquisicionDB.setOficioinscripcion(informacionAdquisicion.getOficioinscripcion());
		informacionAdquisicionDB.setFechacancelacionoferta(informacionAdquisicion.getFechacancelacionoferta());
		informacionAdquisicionDB.setAnexodoc(informacionAdquisicion.getAnexodoc());
		informacionAdquisicionDB.setObservaciones(informacionAdquisicion.getObservaciones());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(informacionAdquisicionDB));
	}
}
