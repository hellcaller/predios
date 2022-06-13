package com.microservicio.sda.predios.app.localizacion.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "localizacion")
public class Localizacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipo_suelo;
	private String upl;
	private String localidad;
	private String upz_upr;
	private String nombre;
	private String componente_eep;
	private String categoria_eep;
	private String elemento_eep;
	private String nombre_eep;
	private String sector_eep;
	private String sector;
	private String brebestart;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo_suelo() {
		return tipo_suelo;
	}

	public void setTipo_suelo(String tipo_suelo) {
		this.tipo_suelo = tipo_suelo;
	}

	public String getUpl() {
		return upl;
	}

	public void setUpl(String upl) {
		this.upl = upl;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getUpz_upr() {
		return upz_upr;
	}

	public void setUpz_upr(String upz_upr) {
		this.upz_upr = upz_upr;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getComponente_eep() {
		return componente_eep;
	}

	public void setComponente_eep(String componente_eep) {
		this.componente_eep = componente_eep;
	}

	public String getCategoria_eep() {
		return categoria_eep;
	}

	public void setCategoria_eep(String categoria_eep) {
		this.categoria_eep = categoria_eep;
	}

	public String getElemento_eep() {
		return elemento_eep;
	}

	public void setElemento_eep(String elemento_eep) {
		this.elemento_eep = elemento_eep;
	}

	public String getNombre_eep() {
		return nombre_eep;
	}

	public void setNombre_eep(String nombre_eep) {
		this.nombre_eep = nombre_eep;
	}

	public String getSector_eep() {
		return sector_eep;
	}

	public void setSector_eep(String sector_eep) {
		this.sector_eep = sector_eep;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getBrebestart() {
		return brebestart;
	}

	public void setBrebestart(String brebestart) {
		this.brebestart = brebestart;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Localizacion)) {
			return false;
		}
		Localizacion localizacion = (Localizacion) obj;
		return this.id != null && this.id.equals(localizacion.getId());
	}

}
