package com.microservicio.sda.predios.app.propiedad.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.microservicio.sda.predios.app.propiedad.models.entity.Propiedad;

public interface PropiedadRepository extends PagingAndSortingRepository<Propiedad, Long> {

	@Query("select prop from Propiedad prop where prop.predio_matriz_remanente like %?1% or prop.matricula_inmobiliaria like %?1% or prop.cod_catastral like %?1%")
	public List<Propiedad> findByPredioMatrizRemanenteOrMatriculaInmobiliariaOrCodigoCatastral(String term);

}
