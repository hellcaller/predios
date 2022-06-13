package com.microservicio.sda.predios.app.informacioncatastral.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicio.sda.predios.app.informacioncatastral.models.entity.InformacionCatastral;
import com.microservicio.sda.predios.app.informacioncatastral.models.repository.InformacionCatastralRepository;

import microservicio.proyecto.commons.services.CommonServiceImpl;

@Service
public class InformacionCatastralServiceImpl extends
		CommonServiceImpl<InformacionCatastral, InformacionCatastralRepository> implements InformacionCatastralService {

	@Override
	public InformacionCatastral findInformacionCatastralByPropiedadId(Long id) {
		return repository.findInformacionCatastralByPropiedadId(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<InformacionCatastral> findBySectorCatastralOrCodigoCatastralOrDireccionCatastral(String term) {
		return repository.findBySectorCatastralOrCodigoCatastralOrDireccionCatastral(term);
	}

}
