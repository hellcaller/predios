package microserviciosdaprediosadquisicionFinal.Service;

import microservicio.proyecto.commons.services.CommonService;
import microserviciosdaprediosadquisicionFinal.models.entity.Adquisicion;

public interface adquisicionService extends CommonService<Adquisicion>  
{
	public Iterable<Adquisicion> findAllById(Iterable<Long> ids);
}
