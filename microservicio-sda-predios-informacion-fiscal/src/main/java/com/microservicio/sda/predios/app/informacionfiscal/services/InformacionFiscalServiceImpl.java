package com.microservicio.sda.predios.app.informacionfiscal.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicio.sda.predios.app.informacionfiscal.models.entity.InformacionFiscal;
import com.microservicio.sda.predios.app.informacionfiscal.models.repository.InformacionFiscalRepository;

import microservicio.proyecto.commons.services.CommonServiceImpl;

@Service
public class InformacionFiscalServiceImpl extends CommonServiceImpl<InformacionFiscal, InformacionFiscalRepository>
		implements InformacionFiscalService {

	@Override
	@Transactional(readOnly = true)
	public List<InformacionFiscal> findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(String term) {
		return repository.findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(term);
	}

}
