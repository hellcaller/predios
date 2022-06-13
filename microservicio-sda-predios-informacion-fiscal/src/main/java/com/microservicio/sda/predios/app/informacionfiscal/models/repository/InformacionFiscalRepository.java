package com.microservicio.sda.predios.app.informacionfiscal.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.microservicio.sda.predios.app.informacionfiscal.models.entity.InformacionFiscal;

public interface InformacionFiscalRepository extends PagingAndSortingRepository<InformacionFiscal, Long> {

	@Query("select inff from InformacionFiscal inff where inff.remision_informacion like %?1% or inff.remision_emitido like %?1% or inff.fecha_remision like %?1%")
	public List<InformacionFiscal> findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(String term);
	
}
