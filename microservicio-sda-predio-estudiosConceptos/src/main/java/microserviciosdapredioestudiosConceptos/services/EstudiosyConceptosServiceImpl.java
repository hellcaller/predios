package microserviciosdapredioestudiosConceptos.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import microservicio.proyecto.commons.services.CommonServiceImpl;
import microserviciosdapredioestudiosConceptos.model.entity.EstudiosyConceptos;
import microserviciosdapredioestudiosConceptos.repository.estudioyconceptosRepository;


@Service
public class EstudiosyConceptosServiceImpl extends CommonServiceImpl<EstudiosyConceptos, estudioyconceptosRepository> implements
   EstudiosyConceptosService{

	
	@Override
	@Transactional(readOnly = true)
	public Iterable<EstudiosyConceptos> findAll() {
		return repository.findAllByOrderByIdAsc();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<EstudiosyConceptos> findAll(Pageable pageable) {
		return repository.findAllByOrderByIdAsc(pageable);
	}

	@Override
	public Iterable<EstudiosyConceptos> findAllById(Iterable<Long> ids) {
		
		return repository.findAllById(ids);
	}

	@Override
	@Transactional(readOnly = true)
	public List<EstudiosyConceptos> findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(String term) {
		return repository.findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(term);
	}

	
	
}
