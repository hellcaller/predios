package com.microservicio.sda.predios.app.localizacion.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservicio.sda.predios.app.localizacion.models.entity.Localizacion;
import com.microservicio.sda.predios.app.localizacion.models.repository.LocalizacionRepository;

import microservicio.proyecto.commons.services.CommonServiceImpl;

@Service
public class LocalizazionServiceImpl extends CommonServiceImpl<Localizacion, LocalizacionRepository>
		implements LocalizacionService {

	@Override
	public List<Localizacion> findByTipoSueloOrUPLOrLocalidad(String term) {
		return repository.findByTipoSueloOrUPLOrLocalidad(term);
	}

}
