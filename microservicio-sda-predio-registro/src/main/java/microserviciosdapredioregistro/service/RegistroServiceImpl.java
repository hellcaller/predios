package microserviciosdapredioregistro.service;

import org.springframework.stereotype.Service;

import microservicio.proyecto.commons.services.CommonServiceImpl;
import microserviciosdapredioregistro.model.Registro;
import microserviciosdapredioregistro.repository.RegistroRepository;

@Service
public class RegistroServiceImpl extends CommonServiceImpl<Registro,RegistroRepository> implements RegistroService  {

}
