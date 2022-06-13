package com.microservicio.sda.predios.app.propiedad.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicio.sda.predios.app.propiedad.models.entity.Propiedad;
import com.microservicio.sda.predios.app.propiedad.models.repository.PropiedadRepository;

import microservicio.proyecto.commons.services.CommonServiceImpl;

@Service
public class PropiedadServiceImpl extends CommonServiceImpl<Propiedad, PropiedadRepository>
		implements PropiedadService {

	@Override
	@Transactional(readOnly = true)
	public List<Propiedad> findByPredioMatrizRemanenteOrMatriculaInmobiliariaOrCodigoCatastral(String term) {
		return repository.findByPredioMatrizRemanenteOrMatriculaInmobiliariaOrCodigoCatastral(term);
	}

}
