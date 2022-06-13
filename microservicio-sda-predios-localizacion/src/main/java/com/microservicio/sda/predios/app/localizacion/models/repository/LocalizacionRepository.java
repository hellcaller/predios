package com.microservicio.sda.predios.app.localizacion.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.microservicio.sda.predios.app.localizacion.models.entity.Localizacion;

public interface LocalizacionRepository extends PagingAndSortingRepository<Localizacion, Long> {

	@Query("select loc from Localizacion loc where loc.tipo_suelo like %?1% or loc.upl like %?1% or loc.localidad like %?1%")
	public List<Localizacion> findByTipoSueloOrUPLOrLocalidad(String term);

}
