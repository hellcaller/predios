package microserviciosdapredioregistro.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import microserviciosdapredioregistro.model.Registro;

public interface RegistroRepository extends PagingAndSortingRepository<Registro,Long> {

}
