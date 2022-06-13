package com.microservicio.sda.predios.app.propiedad.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.sda.predios.app.propiedad.models.entity.Propiedad;
import com.microservicio.sda.predios.app.propiedad.services.PropiedadService;

import microservicio.proyecto.commons.controller.CommonController;

@RestController
public class PropiedadController extends CommonController<Propiedad, PropiedadService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Propiedad propiedad, @PathVariable Long id) {
		Optional<Propiedad> optional = service.findById(id);
		if (optional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		Propiedad propiedadDB = optional.get();
		propiedadDB.setPredio_matriz_remanente(propiedad.getPredio_matriz_remanente());
		propiedadDB.setMatricula_inmobiliaria(propiedad.getMatricula_inmobiliaria());
		propiedadDB.setCod_catastral(propiedad.getCod_catastral());
		propiedadDB.setChip2(propiedad.getChip2());
		propiedadDB.setVed_catastral(propiedad.getVed_catastral());
		propiedadDB.setPropant(propiedad.getPropant());
		propiedadDB.setTipoiden(propiedad.getTipoiden());
		propiedadDB.setNumiden(propiedad.getNumiden());
		propiedadDB.setTelcontacto(propiedad.getTelcontacto());
		propiedadDB.setCorreo(propiedad.getCorreo());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(propiedadDB));
	}

	@GetMapping("/filtrar/{term}")
	public ResponseEntity<?> filtrar(@PathVariable String term) {
		return ResponseEntity.ok(service.findByPredioMatrizRemanenteOrMatriculaInmobiliariaOrCodigoCatastral(term));
	}

}
