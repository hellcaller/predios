package microserviciosdapredioregistro.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import microservicio.proyecto.commons.controller.CommonController;
import microserviciosdapredioregistro.model.Registro;
import microserviciosdapredioregistro.service.RegistroService;

@RestController
@CrossOrigin("")
public class RegistroController extends CommonController<Registro, RegistroService> {

}
