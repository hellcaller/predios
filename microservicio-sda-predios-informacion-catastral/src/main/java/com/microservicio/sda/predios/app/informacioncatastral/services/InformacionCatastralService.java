package com.microservicio.sda.predios.app.informacioncatastral.services;

import java.util.List;

import com.microservicio.sda.predios.app.informacioncatastral.models.entity.InformacionCatastral;

import microservicio.proyecto.commons.services.CommonService;

public interface InformacionCatastralService extends CommonService<InformacionCatastral> {

	public InformacionCatastral findInformacionCatastralByPropiedadId(Long id);
	
	public List<InformacionCatastral> findBySectorCatastralOrCodigoCatastralOrDireccionCatastral(String term);

}
