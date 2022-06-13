package com.microservicio.sda.predios.app.informaciongeneral.models.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.microservicio.sda.predios.app.informaciongeneral.models.entity.InformacionGeneral;

public interface InformacionGeneralRepository extends PagingAndSortingRepository<InformacionGeneral, Long> {

	@Query("select infg from InformacionGeneral infg join fetch infg.informacion_fiscal inff where inff.id=?1")
	public InformacionGeneral findInformacionGeneralByInformacionFiscalId(Long id);

	@Query("select infg from InformacionGeneral infg join fetch infg.informacion_catastral infc where infc.id=?1")
	public InformacionGeneral findInformacionGeneralByInformacionCatastralId(Long id);

	@Query("select infg from InformacionGeneral infg join fetch infg.localizacion loc where loc.id=?1")
	public InformacionGeneral findInformacionGeneralByLocalizacionId(Long id);
	
	@Query("select infg from InformacionGeneral infg join fetch infg.informacion_tecnica loc where loc.id=?1")
	public InformacionGeneral findInformacionGeneralByTecnicaId(Long id);

}
