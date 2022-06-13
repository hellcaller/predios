package com.microservicio.sda.predios.app.informacioncatastral.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.microservicio.sda.predios.app.informacioncatastral.models.entity.InformacionCatastral;

public interface InformacionCatastralRepository extends PagingAndSortingRepository<InformacionCatastral, Long> {

	@Query("select infc from InformacionCatastral infc join fetch infc.propiedad prop where prop.id=?1")
	public InformacionCatastral findInformacionCatastralByPropiedadId(Long id);

	@Query("select infc from InformacionCatastral infc where infc.sector_catastral like %?1% or infc.codigo_catastral like %?1% or infc.direccion_catastral like %?1%")
	public List<InformacionCatastral> findBySectorCatastralOrCodigoCatastralOrDireccionCatastral(String term);

}
