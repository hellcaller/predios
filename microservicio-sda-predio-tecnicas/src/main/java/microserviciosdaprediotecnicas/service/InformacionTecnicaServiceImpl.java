package microserviciosdaprediotecnicas.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import microservicio.proyecto.commons.services.CommonServiceImpl;
import microserviciosdaprediotecnicas.modesl.entity.InformacionTecnica;
import microserviciosdaprediotecnicas.repository.TecnicaRepository;

@Service
public class InformacionTecnicaServiceImpl extends CommonServiceImpl<InformacionTecnica,TecnicaRepository>implements InformacionTecnicaService {

	@Override
	@Transactional(readOnly = true)
	public Iterable<InformacionTecnica> findAll() {
		return repository.findAllByOrderByIdAsc();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<InformacionTecnica> findAll(Pageable pageable) {
		return repository.findAllByOrderByIdAsc(pageable);
	}

	@Override
	public Iterable<InformacionTecnica> findAllById(Iterable<Long> ids) {
		return repository.findAllById(ids);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<InformacionTecnica> findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(String term) {
		return repository.findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(term);
	}

}
