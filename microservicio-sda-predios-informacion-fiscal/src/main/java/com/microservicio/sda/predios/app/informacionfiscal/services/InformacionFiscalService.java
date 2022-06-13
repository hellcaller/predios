package com.microservicio.sda.predios.app.informacionfiscal.services;

import java.util.List;

import com.microservicio.sda.predios.app.informacionfiscal.models.entity.InformacionFiscal;

import microservicio.proyecto.commons.services.CommonService;

public interface InformacionFiscalService extends CommonService<InformacionFiscal> {

	public List<InformacionFiscal> findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(String term);
	
}
