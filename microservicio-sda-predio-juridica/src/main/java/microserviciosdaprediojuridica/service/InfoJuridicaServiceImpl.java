package microserviciosdaprediojuridica.service;

import org.springframework.stereotype.Service;

import microservicio.proyecto.commons.services.CommonServiceImpl;
import microserviciosdaprediojuridica.model.InfoJuridica;
import microserviciosdaprediojuridica.repository.InfoJuridicaRepository;
@Service
public class InfoJuridicaServiceImpl extends CommonServiceImpl<InfoJuridica,InfoJuridicaRepository > implements InfoJuridicaService {

}
