package com.microservicio.sda.predios.app.informacionfiscal.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.sda.predios.app.informacionfiscal.models.entity.InformacionFiscal;
import com.microservicio.sda.predios.app.informacionfiscal.services.InformacionFiscalService;

import microservicio.proyecto.commons.controller.CommonController;

@RestController
public class InformacionFiscalController extends CommonController<InformacionFiscal, InformacionFiscalService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody InformacionFiscal informacionFiscal, @PathVariable Long id) {
		Optional<InformacionFiscal> optional = service.findById(id);
		if (optional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		InformacionFiscal informacionFiscalDB = optional.get();
		informacionFiscalDB.setRemision_informacion(informacionFiscal.getRemision_informacion());
		informacionFiscalDB.setRemision_emitido(informacionFiscal.getRemision_emitido());
		informacionFiscalDB.setFecha_remision(informacionFiscal.getFecha_remision());
		informacionFiscalDB.setMemorando_remision(informacionFiscal.getMemorando_remision());
		informacionFiscalDB.setObservaciones(informacionFiscal.getObservaciones());
		informacionFiscalDB.setNotificaciones(informacionFiscal.getNotificaciones());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(informacionFiscalDB));
	}

	@GetMapping("/filtrar/{term}")
	public ResponseEntity<?> filtrar(@PathVariable String term){
		return ResponseEntity.ok(service.findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(term));
	}
	
}
