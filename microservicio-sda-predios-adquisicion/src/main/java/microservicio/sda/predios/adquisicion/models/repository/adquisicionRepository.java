package microservicio.sda.predios.adquisicion.models.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import microservicio.sda.predios.adquisicion.models.entity.Adquisicion;




public interface adquisicionRepository extends PagingAndSortingRepository<Adquisicion, Long> {

		public Iterable<Adquisicion> findAllByOrderByIdAsc();
	
	public Page<Adquisicion> findAllByOrderByIdAsc(Pageable pageable);
}
