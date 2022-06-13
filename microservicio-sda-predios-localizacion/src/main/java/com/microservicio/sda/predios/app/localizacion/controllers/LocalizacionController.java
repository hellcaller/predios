package com.microservicio.sda.predios.app.localizacion.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.sda.predios.app.localizacion.models.entity.Localizacion;
import com.microservicio.sda.predios.app.localizacion.services.LocalizacionService;

import microservicio.proyecto.commons.controller.CommonController;

@RestController
public class LocalizacionController extends CommonController<Localizacion, LocalizacionService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Localizacion localizacion, @PathVariable Long id) {
		Optional<Localizacion> optional = service.findById(id);
		if (optional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		Localizacion localizacionDB = optional.get();
		localizacionDB.setTipo_suelo(localizacion.getTipo_suelo());
		localizacionDB.setUpl(localizacion.getUpl());
		localizacionDB.setLocalidad(localizacion.getLocalidad());
		localizacionDB.setUpz_upr(localizacion.getUpz_upr());
		localizacionDB.setNombre(localizacion.getNombre());
		localizacionDB.setComponente_eep(localizacion.getComponente_eep());
		localizacionDB.setCategoria_eep(localizacion.getCategoria_eep());
		localizacionDB.setElemento_eep(localizacion.getElemento_eep());
		localizacionDB.setNombre_eep(localizacion.getNombre_eep());
		localizacionDB.setSector_eep(localizacion.getSector_eep());
		localizacionDB.setSector(localizacion.getSector());
		localizacionDB.setBrebestart(localizacion.getBrebestart());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(localizacionDB));
	}

	@GetMapping("/filtrar/{term}")
	public ResponseEntity<?> filtrar(@PathVariable String term) {
		return ResponseEntity.ok(service.findByTipoSueloOrUPLOrLocalidad(term));
	}

}
