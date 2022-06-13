package com.microservicio.sda.predios.app.propiedad.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "propiedad")
public class Propiedad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String predio_matriz_remanente;
	private String matricula_inmobiliaria;
	private String cod_catastral;
	private String chip2;
	private String ved_catastral;
	private String propant;
	private String tipoiden;
	private Long numiden;
	private Long telcontacto;
	private String correo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPredio_matriz_remanente() {
		return predio_matriz_remanente;
	}

	public void setPredio_matriz_remanente(String predio_matriz_remanente) {
		this.predio_matriz_remanente = predio_matriz_remanente;
	}

	public String getMatricula_inmobiliaria() {
		return matricula_inmobiliaria;
	}

	public void setMatricula_inmobiliaria(String matricula_inmobiliaria) {
		this.matricula_inmobiliaria = matricula_inmobiliaria;
	}

	public String getCod_catastral() {
		return cod_catastral;
	}

	public void setCod_catastral(String cod_catastral) {
		this.cod_catastral = cod_catastral;
	}

	public String getChip2() {
		return chip2;
	}

	public void setChip2(String chip2) {
		this.chip2 = chip2;
	}

	public String getVed_catastral() {
		return ved_catastral;
	}

	public void setVed_catastral(String ved_catastral) {
		this.ved_catastral = ved_catastral;
	}

	public String getPropant() {
		return propant;
	}

	public void setPropant(String propant) {
		this.propant = propant;
	}

	public String getTipoiden() {
		return tipoiden;
	}

	public void setTipoiden(String tipoiden) {
		this.tipoiden = tipoiden;
	}

	public Long getNumiden() {
		return numiden;
	}

	public void setNumiden(Long numiden) {
		this.numiden = numiden;
	}

	public Long getTelcontacto() {
		return telcontacto;
	}

	public void setTelcontacto(Long telcontacto) {
		this.telcontacto = telcontacto;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Propiedad)) {
			return false;
		}
		Propiedad propiedad = (Propiedad) obj;
		return this.id != null && this.id.equals(propiedad.getId());
	}

}
