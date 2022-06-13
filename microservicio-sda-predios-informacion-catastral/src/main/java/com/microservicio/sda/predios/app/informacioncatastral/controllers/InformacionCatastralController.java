package com.microservicio.sda.predios.app.informacioncatastral.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.sda.predios.app.informacioncatastral.models.entity.InformacionCatastral;
import com.microservicio.sda.predios.app.informacioncatastral.services.InformacionCatastralService;
import com.microservicio.sda.predios.app.propiedad.models.entity.Propiedad;

import microservicio.proyecto.commons.controller.CommonController;

@RestController
public class InformacionCatastralController
		extends CommonController<InformacionCatastral, InformacionCatastralService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody InformacionCatastral informacionCatastral, @PathVariable Long id) {
		Optional<InformacionCatastral> optional = service.findById(id);
		if (optional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		InformacionCatastral informacionCatastralDB = optional.get();
		informacionCatastralDB.setSector_catastral(informacionCatastral.getSector_catastral());
		informacionCatastralDB.setCodigo_catastral(informacionCatastral.getCodigo_catastral());
		informacionCatastralDB.setDireccion_catastral(informacionCatastral.getDireccion_catastral());
		informacionCatastralDB.setChip(informacionCatastral.getChip());
		informacionCatastralDB.setCedula_catastral(informacionCatastral.getCedula_catastral());
		informacionCatastralDB.setDest_catastral(informacionCatastral.getDest_catastral());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(informacionCatastralDB));
	}

	@GetMapping("/filtrar/{term}")
	public ResponseEntity<?> filtrar(@PathVariable String term) {
		return ResponseEntity.ok(service.findBySectorCatastralOrCodigoCatastralOrDireccionCatastral(term));
	}

	@PutMapping("/{id}/asignar-propiedad")
	public ResponseEntity<?> asignarPropiedad(@RequestBody List<Propiedad> propiedad, @PathVariable Long id) {
		Optional<InformacionCatastral> optional = this.service.findById(id);
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		InformacionCatastral informacionCatastralDB = optional.get();

		propiedad.forEach(a -> {
			informacionCatastralDB.addPropiedad(a);
		});

		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(informacionCatastralDB));
	}

	@PutMapping("/{id}/eliminar-propiedad")
	public ResponseEntity<?> eliminarPropiedad(@RequestBody Propiedad propiedad, @PathVariable Long id) {
		Optional<InformacionCatastral> optional = this.service.findById(id);
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		InformacionCatastral informacionCatastralDB = optional.get();
		informacionCatastralDB.removePropiedad(propiedad);
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(informacionCatastralDB));
	}

	@GetMapping("/propiedad/{id}")
	public ResponseEntity<?> buscarPorPropiedadId(@PathVariable Long id) {
		InformacionCatastral informacionCatastral = service.findInformacionCatastralByPropiedadId(id);
		return ResponseEntity.ok(informacionCatastral);
	}

}
