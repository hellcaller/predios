package com.microservicio.sda.predios.app.propiedad.services;

import java.util.List;

import com.microservicio.sda.predios.app.propiedad.models.entity.Propiedad;

import microservicio.proyecto.commons.services.CommonService;

public interface PropiedadService extends CommonService<Propiedad> {

	public List<Propiedad> findByPredioMatrizRemanenteOrMatriculaInmobiliariaOrCodigoCatastral(String term);
	
}
