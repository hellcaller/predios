package microserviciosdapredioestudiosConceptos.services;

import java.util.List;



import microservicio.proyecto.commons.services.CommonService;
import microserviciosdapredioestudiosConceptos.model.entity.EstudiosyConceptos;

public interface EstudiosyConceptosService extends CommonService<EstudiosyConceptos> {
	
	public Iterable<EstudiosyConceptos> findAllById(Iterable<Long> ids);
	
	public List<EstudiosyConceptos> findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(String term);

}

