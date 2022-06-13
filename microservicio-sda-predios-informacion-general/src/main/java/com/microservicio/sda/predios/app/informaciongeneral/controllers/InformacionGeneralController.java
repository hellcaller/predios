package com.microservicio.sda.predios.app.informaciongeneral.controllers;

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
import com.microservicio.sda.predios.app.informacionfiscal.models.entity.InformacionFiscal;
import com.microservicio.sda.predios.app.informaciongeneral.models.entity.InformacionGeneral;
import com.microservicio.sda.predios.app.informaciongeneral.services.InformacionGeneralService;
import com.microservicio.sda.predios.app.localizacion.models.entity.Localizacion;

import microservicio.proyecto.commons.controller.CommonController;
import microserviciosdapredioestudiosConceptos.model.entity.EstudiosyConceptos;
import microserviciosdaprediosadquisicionFinal.models.entity.Adquisicion;
import microserviciosdaprediotecnicas.modesl.entity.InformacionTecnica;

@RestController
public class InformacionGeneralController extends CommonController<InformacionGeneral, InformacionGeneralService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody InformacionGeneral informacionGeneral, @PathVariable Long id) {
		Optional<InformacionGeneral> optional = service.findById(id);
		if (optional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		InformacionGeneral informacionGeneralDB = optional.get();
		informacionGeneralDB.setTipo_bien(informacionGeneral.getTipo_bien());
		informacionGeneralDB.setChip(informacionGeneral.getChip());
		informacionGeneralDB.setDestinacion(informacionGeneral.getDestinacion());
		informacionGeneralDB.setTipo_activo(informacionGeneral.getTipo_activo());
		informacionGeneralDB.setEstado(informacionGeneral.getEstado());
		informacionGeneralDB.setAdquisicion(informacionGeneral.getAdquisicion());
		informacionGeneralDB.setForma_adquisicion(informacionGeneral.getForma_adquisicion());
		informacionGeneralDB.setProyecto_sda(informacionGeneral.getProyecto_sda());
		informacionGeneralDB.setConvenio_adquisicion(informacionGeneral.getConvenio_adquisicion());
		informacionGeneralDB.setDeclaratoria_publica(informacionGeneral.getDeclaratoria_publica());
		informacionGeneralDB.setNombre_predio(informacionGeneral.getNombre_predio());
		informacionGeneralDB.setNumero_especifico(informacionGeneral.getNumero_especifico());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(informacionGeneral));
	}

	@PutMapping("/{id}/asignar-informacion-fiscal")
	public ResponseEntity<?> asignarInformacionFiscal(@RequestBody List<InformacionFiscal> informacionFiscal,
			@PathVariable Long id) {
		Optional<InformacionGeneral> optional = this.service.findById(id);
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		InformacionGeneral informacionGeneralDB = optional.get();

		informacionFiscal.forEach(a -> {
			informacionGeneralDB.addInformacion_fiscal(a);
		});

		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(informacionGeneralDB));
	}

	@PutMapping("/{id}/eliminar-informacion-fiscal")
	public ResponseEntity<?> eliminarInformacionFiscal(@RequestBody InformacionFiscal informacionFiscal,
			@PathVariable Long id) {
		Optional<InformacionGeneral> optional = this.service.findById(id);
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		InformacionGeneral informacionGeneralDB = optional.get();
		informacionGeneralDB.removeInformacion_fiscal(informacionFiscal);
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(informacionGeneralDB));
	}

	@GetMapping("/informacion-fiscal/{id}")
	public ResponseEntity<?> buscarPorInformacionFiscalId(@PathVariable Long id) {
		InformacionGeneral informacionGeneral = service.findInformacionGeneralByInformacionFiscalId(id);
		return ResponseEntity.ok(informacionGeneral);
	}

	@PutMapping("/{id}/asignar-localizacion")
	public ResponseEntity<?> asignarLocalizacion(@RequestBody List<Localizacion> localizacion, @PathVariable Long id) {
		Optional<InformacionGeneral> optional = this.service.findById(id);
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		InformacionGeneral informacionGeneralDB = optional.get();

		localizacion.forEach(a -> {
			informacionGeneralDB.addLocalizacionl(a);
		});

		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(informacionGeneralDB));
	}

	@PutMapping("/{id}/eliminar-localizacion")
	public ResponseEntity<?> eliminarLocalizacion(@RequestBody Localizacion localizacion, @PathVariable Long id) {
		Optional<InformacionGeneral> optional = this.service.findById(id);
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		InformacionGeneral informacionGeneralDB = optional.get();
		informacionGeneralDB.removeLocalizacion(localizacion);
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(informacionGeneralDB));
	}

	@GetMapping("/localizacion/{id}")
	public ResponseEntity<?> buscarPorLocalizacionId(@PathVariable Long id) {
		InformacionGeneral informacionGeneral = service.findInformacionGeneralByLocalizacionId(id);
		return ResponseEntity.ok(informacionGeneral);
	}

	@PutMapping("/{id}/asignar-informacion-catastral")
	public ResponseEntity<?> asignarInformacionCatastral(@RequestBody List<InformacionCatastral> informacionCatastral,
			@PathVariable Long id) {
		Optional<InformacionGeneral> optional = this.service.findById(id);
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		InformacionGeneral informacionGeneralDB = optional.get();

		informacionCatastral.forEach(a -> {
			informacionGeneralDB.addInformacion_catastral(a);
		});

		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(informacionGeneralDB));
	}

	@PutMapping("/{id}/eliminar-informacion-catastral")
	public ResponseEntity<?> eliminarInformacionCatastral(@RequestBody InformacionCatastral informacionCatastral,
			@PathVariable Long id) {
		Optional<InformacionGeneral> optional = this.service.findById(id);
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		InformacionGeneral informacionGeneralDB = optional.get();
		informacionGeneralDB.removeInformacion_catastral(informacionCatastral);
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(informacionGeneralDB));
	}

	@GetMapping("/informacion-catastral/{id}")
	public ResponseEntity<?> buscarPorInformacionCatastralId(@PathVariable Long id) {
		InformacionGeneral informacionGeneral = service.findInformacionGeneralByInformacionCatastralId(id);
		return ResponseEntity.ok(informacionGeneral);
	}
	
	@PutMapping("/{id}/asignar-informacion-tecnica")
	public ResponseEntity<?> asignarInformacionTecnica(@RequestBody List<InformacionTecnica> informacionTecnica,
			@PathVariable Long id) {
		Optional<InformacionGeneral> optional = this.service.findById(id);
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		InformacionGeneral informacionGeneralDB = optional.get();

		informacionTecnica.forEach(a -> {
			informacionGeneralDB.addInformacion_tecnica(a);
		});

		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(informacionGeneralDB));
	}
	
	@PutMapping("/{id}/asignar-adquisicion")
	public ResponseEntity<?> asignarAdquisicion(@RequestBody List<Adquisicion> adquisicion,
			@PathVariable Long id) {
		Optional<InformacionGeneral> optional = this.service.findById(id);
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		InformacionGeneral informacionGeneralDB = optional.get();

		adquisicion.forEach(a -> {
			informacionGeneralDB.addAdquisicion_f(a);
		});

		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(informacionGeneralDB));
	}

	@PutMapping("/{id}/asignar-estudios")
	public ResponseEntity<?> asignarEstudios(@RequestBody List<EstudiosyConceptos> estudios,
			@PathVariable Long id) {
		Optional<InformacionGeneral> optional = this.service.findById(id);
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		InformacionGeneral informacionGeneralDB = optional.get();

		estudios.forEach(a -> {
			informacionGeneralDB.addEstudiosyconceptos(a);
		});

		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(informacionGeneralDB));
	}
	
	@GetMapping("/informacion-tecnica/{id}")
	public ResponseEntity<?> buscarPorInformacionTecnicaId(@PathVariable Long id) {
		InformacionGeneral informacionGeneral = service.findInformacionGeneralByTecnicaId(id);
		return ResponseEntity.ok(informacionGeneral);
	}

	
	
	
}
