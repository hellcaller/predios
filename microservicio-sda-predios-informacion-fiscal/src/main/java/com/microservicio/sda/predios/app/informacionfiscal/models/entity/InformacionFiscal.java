package com.microservicio.sda.predios.app.informacionfiscal.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "informacion_fiscal")
public class InformacionFiscal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String remision_informacion;
	private String remision_emitido;
	private String fecha_remision;
	private String memorando_remision;
	private String observaciones;
	private String notificaciones;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRemision_informacion() {
		return remision_informacion;
	}

	public void setRemision_informacion(String remision_informacion) {
		this.remision_informacion = remision_informacion;
	}

	public String getRemision_emitido() {
		return remision_emitido;
	}

	public void setRemision_emitido(String remision_emitido) {
		this.remision_emitido = remision_emitido;
	}

	public String getFecha_remision() {
		return fecha_remision;
	}

	public void setFecha_remision(String fecha_remision) {
		this.fecha_remision = fecha_remision;
	}

	public String getMemorando_remision() {
		return memorando_remision;
	}

	public void setMemorando_remision(String memorando_remision) {
		this.memorando_remision = memorando_remision;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(String notificaciones) {
		this.notificaciones = notificaciones;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof InformacionFiscal)) {
			return false;
		}
		InformacionFiscal infoF = (InformacionFiscal) obj;
		return this.id != null && this.id.equals(infoF.getId());
	}

}
