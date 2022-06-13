package microserviciosdapredioestudiosConceptos.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;



import microserviciosdapredioestudiosConceptos.model.entity.EstudiosyConceptos;



public interface estudioyconceptosRepository extends PagingAndSortingRepository<EstudiosyConceptos, Long> {
	
    public Iterable<EstudiosyConceptos> findAllByOrderByIdAsc();
	
	public Page<EstudiosyConceptos> findAllByOrderByIdAsc(Pageable pageable);
	
	@Query("select inff from EstudiosyConceptos inff where inff.estudiotitulos like %?1% or inff.elaboradopor like %?1% or inff.limitacion like %?1%")
	public List<EstudiosyConceptos> findByRemisionInformacionOrRemisionEmitidoOrFechaRemision(String term);

}
