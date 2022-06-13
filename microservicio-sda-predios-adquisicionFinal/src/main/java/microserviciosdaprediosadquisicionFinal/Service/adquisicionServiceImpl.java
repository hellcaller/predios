package microserviciosdaprediosadquisicionFinal.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import microservicio.proyecto.commons.services.CommonServiceImpl;
import microserviciosdaprediosadquisicionFinal.Repository.adquisicionRepository;
import microserviciosdaprediosadquisicionFinal.models.entity.Adquisicion;

@Service
public class adquisicionServiceImpl  extends CommonServiceImpl<Adquisicion, adquisicionRepository> implements adquisicionService{

	@Override
	@Transactional(readOnly = true)
	public Iterable<Adquisicion> findAll() {
		return repository.findAllByOrderByIdAsc();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Adquisicion> findAll(Pageable pageable) {
		return repository.findAllByOrderByIdAsc(pageable);
	}

	@Override
	public Iterable<Adquisicion> findAllById(Iterable<Long> ids) {
		
		return repository.findAllById(ids);
	}
	
	
}
