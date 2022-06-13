package com.microservicio.sda.predios.app.informacioncatastral.models.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.microservicio.sda.predios.app.propiedad.models.entity.Propiedad;

@Entity
@Table(name = "informacion_catastral")
public class InformacionCatastral {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sector_catastral;
	private String codigo_catastral;
	private String direccion_catastral;
	private String chip;
	private String cedula_catastral;
	private String dest_catastral;

	@OneToMany(fetch = FetchType.LAZY)
	private List<Propiedad> propiedad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSector_catastral() {
		return sector_catastral;
	}

	public void setSector_catastral(String sector_catastral) {
		this.sector_catastral = sector_catastral;
	}

	public String getCodigo_catastral() {
		return codigo_catastral;
	}

	public void setCodigo_catastral(String codigo_catastral) {
		this.codigo_catastral = codigo_catastral;
	}

	public String getDireccion_catastral() {
		return direccion_catastral;
	}

	public void setDireccion_catastral(String direccion_catastral) {
		this.direccion_catastral = direccion_catastral;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public String getCedula_catastral() {
		return cedula_catastral;
	}

	public void setCedula_catastral(String cedula_catastral) {
		this.cedula_catastral = cedula_catastral;
	}

	public String getDest_catastral() {
		return dest_catastral;
	}

	public void setDest_catastral(String dest_catastral) {
		this.dest_catastral = dest_catastral;
	}

	public List<Propiedad> getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(List<Propiedad> propiedad) {
		this.propiedad = propiedad;
	}

	public void addPropiedad(Propiedad propiedad) {
		this.propiedad.add(propiedad);
	}

	public void removePropiedad(Propiedad propiedad) {
		this.propiedad.remove(propiedad);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof InformacionCatastral)) {
			return false;
		}
		InformacionCatastral infoC = (InformacionCatastral) obj;
		return this.id != null && this.id.equals(infoC.getId());
	}

}
