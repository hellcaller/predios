package com.microservicio.sda.predios.app.informaciongeneral.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicio.sda.predios.app.informaciongeneral.models.entity.InformacionGeneral;
import com.microservicio.sda.predios.app.informaciongeneral.models.repository.InformacionGeneralRepository;

import microservicio.proyecto.commons.services.CommonServiceImpl;

@Service
public class InformacionGeneralServiceImpl extends CommonServiceImpl<InformacionGeneral, InformacionGeneralRepository>
		implements InformacionGeneralService {

	@Override
	@Transactional(readOnly = true)
	public InformacionGeneral findInformacionGeneralByInformacionFiscalId(Long id) {
		return repository.findInformacionGeneralByInformacionFiscalId(id);
	}

	@Override
	@Transactional(readOnly = true)
	public InformacionGeneral findInformacionGeneralByInformacionCatastralId(Long id) {
		return repository.findInformacionGeneralByInformacionCatastralId(id);
	}

	@Override
	@Transactional(readOnly = true)
	public InformacionGeneral findInformacionGeneralByLocalizacionId(Long id) {
		return repository.findInformacionGeneralByLocalizacionId(id);
	}

	@Override
	@Transactional(readOnly = true)
	public InformacionGeneral findInformacionGeneralByTecnicaId(Long id) {
		return repository.findInformacionGeneralByTecnicaId(id);
	}

}
