package microserviciosdaprediotecnicas.service;

import java.util.List;



import microservicio.proyecto.commons.services.CommonService;
import microserviciosdaprediotecnicas.modesl.entity.InformacionTecnica;

public interface InformacionTecnicaService extends CommonService<InformacionTecnica>{

	public Iterable<InformacionTecnica> findAllById(Iterable<Long> ids);

	public List<InformacionTecnica> findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(String term);
}
