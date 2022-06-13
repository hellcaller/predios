package microservicio.sda.predios.adquisicion.services;

import microservicio.proyecto.commons.services.CommonService;
import microservicio.sda.predios.adquisicion.models.entity.Adquisicion;



public interface adquisicionService extends CommonService<Adquisicion> {
	public Iterable<Adquisicion> findAllById(Iterable<Long> ids);
}
