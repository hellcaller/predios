package microserviciosdaprediotecnicas.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;



import microserviciosdaprediotecnicas.modesl.entity.InformacionTecnica;

public interface TecnicaRepository extends PagingAndSortingRepository<InformacionTecnica, Long>{
	
	public Iterable<InformacionTecnica> findAllByOrderByIdAsc();
	
	public Page<InformacionTecnica> findAllByOrderByIdAsc(Pageable pageable);

	@Query("select inff from InformacionTecnica inff where inff.areaterreno like %?1% or inff.escrituraha like %?1% or inff.escrituraam2 like %?1%")
	public List<InformacionTecnica> findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(String term);
}
