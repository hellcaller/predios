package com.microservicio.sda.predios.app.localizacion.services;

import java.util.List;

import com.microservicio.sda.predios.app.localizacion.models.entity.Localizacion;

import microservicio.proyecto.commons.services.CommonService;

public interface LocalizacionService extends CommonService<Localizacion> {

	public List<Localizacion> findByTipoSueloOrUPLOrLocalidad(String term);

}
