package com.microservicio.sda.predios.app.informaciongeneral.models.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.microservicio.sda.predios.app.informacioncatastral.models.entity.InformacionCatastral;
import com.microservicio.sda.predios.app.informacionfiscal.models.entity.InformacionFiscal;
import com.microservicio.sda.predios.app.localizacion.models.entity.Localizacion;

import microserviciosdapredioestudiosConceptos.model.entity.EstudiosyConceptos;
import microserviciosdaprediosadquisicionFinal.models.entity.Adquisicion;
import microserviciosdaprediotecnicas.modesl.entity.InformacionTecnica;



@Entity
@Table(name = "informacion_general_predio")
public class InformacionGeneral {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipo_bien;
	private String chip;
	private String destinacion;
	private String tipo_activo;
	private String estado;
	private String adquisicion;
	private String forma_adquisicion;
	private String proyecto_sda;
	private String convenio_adquisicion;
	private String declaratoria_publica;
	private String nombre_predio;
	private String numero_especifico;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Adquisicion> adquisicion_f;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<InformacionTecnica> informacion_tecnica;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<EstudiosyConceptos> estudiosyconceptos;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<InformacionFiscal> informacion_fiscal;

	@OneToMany(fetch = FetchType.LAZY)
	private List<Localizacion> localizacion;

	@OneToMany(fetch = FetchType.LAZY)
	private List<InformacionCatastral> informacion_catastral;

	public InformacionGeneral() {
		this.informacion_fiscal = new ArrayList<>();
		this.localizacion = new ArrayList<>();
		this.informacion_catastral = new ArrayList<>();
		this.estudiosyconceptos = new ArrayList<>();
		this.informacion_tecnica =new ArrayList<>();
		this.adquisicion_f = new ArrayList<>();	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo_bien() {
		return tipo_bien;
	}

	public void setTipo_bien(String tipo_bien) {
		this.tipo_bien = tipo_bien;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public String getDestinacion() {
		return destinacion;
	}

	public void setDestinacion(String destinacion) {
		this.destinacion = destinacion;
	}

	public String getTipo_activo() {
		return tipo_activo;
	}

	public void setTipo_activo(String tipo_activo) {
		this.tipo_activo = tipo_activo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAdquisicion() {
		return adquisicion;
	}

	public void setAdquisicion(String adquisicion) {
		this.adquisicion = adquisicion;
	}

	public String getForma_adquisicion() {
		return forma_adquisicion;
	}

	public void setForma_adquisicion(String forma_adquisicion) {
		this.forma_adquisicion = forma_adquisicion;
	}

	public String getProyecto_sda() {
		return proyecto_sda;
	}

	public void setProyecto_sda(String proyecto_sda) {
		this.proyecto_sda = proyecto_sda;
	}

	public String getConvenio_adquisicion() {
		return convenio_adquisicion;
	}

	public void setConvenio_adquisicion(String convenio_adquisicion) {
		this.convenio_adquisicion = convenio_adquisicion;
	}

	public String getDeclaratoria_publica() {
		return declaratoria_publica;
	}

	public void setDeclaratoria_publica(String declaratoria_publica) {
		this.declaratoria_publica = declaratoria_publica;
	}

	public String getNombre_predio() {
		return nombre_predio;
	}

	public void setNombre_predio(String nombre_predio) {
		this.nombre_predio = nombre_predio;
	}

	public String getNumero_especifico() {
		return numero_especifico;
	}

	public void setNumero_especifico(String numero_especifico) {
		this.numero_especifico = numero_especifico;
	}

	public List<InformacionFiscal> getInformacion_fiscal() {
		return informacion_fiscal;
	}

	public void setInformacion_fiscal(List<InformacionFiscal> informacion_fiscal) {
		this.informacion_fiscal = informacion_fiscal;
	}

	public void addInformacion_fiscal(InformacionFiscal informacion_fiscal) {
		this.informacion_fiscal.add(informacion_fiscal);
	}

	public void removeInformacion_fiscal(InformacionFiscal informacion_fiscal) {
		this.informacion_fiscal.remove(informacion_fiscal);
	}

	public List<Localizacion> getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(List<Localizacion> localizacion) {
		this.localizacion = localizacion;
	}

	public void addLocalizacionl(Localizacion localizacion) {
		this.localizacion.add(localizacion);
	}

	public void removeLocalizacion(Localizacion localizacion) {
		this.localizacion.remove(localizacion);
	}

	public List<InformacionCatastral> getInformacion_catastral() {
		return informacion_catastral;
	}

	public void setInformacion_catastral(List<InformacionCatastral> informacion_catastral) {
		this.informacion_catastral = informacion_catastral;
	}

	public void addInformacion_catastral(InformacionCatastral informacion_catastral) {
		this.informacion_catastral.add(informacion_catastral);
	}

	public void removeInformacion_catastral(InformacionCatastral informacion_catastral) {
		this.informacion_catastral.remove(informacion_catastral);
	}

	public List<EstudiosyConceptos> getEstudiosyconceptos() {
		return estudiosyconceptos;
	}

	public void setEstudiosyconceptos(List<EstudiosyConceptos> estudiosyconceptos) {
		this.estudiosyconceptos = estudiosyconceptos;
	}
	
	public void addEstudiosyconceptos(EstudiosyConceptos estudiosyconceptos) {
		this.estudiosyconceptos.add (estudiosyconceptos);
	}
	public void removeEstudiosyconceptos(EstudiosyConceptos estudiosyconceptos) {
		this.estudiosyconceptos.remove(estudiosyconceptos)	;

	}

	public List<InformacionTecnica> getInformacion_tecnica() {
		return informacion_tecnica;
	}

	public void setInformacion_tecnica(List<InformacionTecnica> informacion_tecnica) {
		this.informacion_tecnica = informacion_tecnica;
	}
	
	public void addInformacion_tecnica(InformacionTecnica informacion_tecnica) {
		this.informacion_tecnica.add(informacion_tecnica);
	}
	
	public void removeInformacion_tecnica(InformacionTecnica informacion_tecnica) {
		this.informacion_tecnica.remove(informacion_tecnica);
	}

	public List<Adquisicion> getAdquisicion_f() {
		return adquisicion_f;
	}

	public void setAdquisicion_f(List<Adquisicion> adquisicion_f) {
		this.adquisicion_f = adquisicion_f;
	}
	
	public void addAdquisicion_f(Adquisicion adquisicion_f) {
		this.adquisicion_f.add(adquisicion_f);
	}
	public void removeAdquisicion_f(Adquisicion adquisicion_f) {
		this.adquisicion_f.remove(adquisicion_f);
	}
	
	

}
