package com.microservicio.sda.predios.app.informaciongeneral.services;

import com.microservicio.sda.predios.app.informaciongeneral.models.entity.InformacionGeneral;

import microservicio.proyecto.commons.services.CommonService;

public interface InformacionGeneralService extends CommonService<InformacionGeneral> {

	public InformacionGeneral findInformacionGeneralByInformacionFiscalId(Long id);

	public InformacionGeneral findInformacionGeneralByInformacionCatastralId(Long id);

	public InformacionGeneral findInformacionGeneralByLocalizacionId(Long id);
	
	public InformacionGeneral findInformacionGeneralByTecnicaId(Long id);

}
