package microserviciosdapredioestudiosConceptos.model.entity;

import java.sql.Timestamp;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "estudiosyconceptos")
public class EstudiosyConceptos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String estudiotitulos;
	private String elaboradopor;
	private Timestamp fecharealizacion;
	private String limitacion;
	private String descripcion;
	private String versiondoc;
	private String anexos;
	private String r1;
	private String r2;
	public String getR1() {
		return r1;
	}

	public void setR1(String r1) {
		this.r1 = r1;
	}

	public String getR2() {
		return r2;
	}

	public void setR2(String r2) {
		this.r2 = r2;
	}

	public String getR3() {
		return r3;
	}

	public void setR3(String r3) {
		this.r3 = r3;
	}

	private String r3;
	
	

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstudiotitulos() {
		return estudiotitulos;
	}

	public void setEstudiotitulos(String estudiotitulos) {
		this.estudiotitulos = estudiotitulos;
	}

	public String getElaboradopor() {
		return elaboradopor;
	}

	public void setElaboradopor(String elaboradopor) {
		this.elaboradopor = elaboradopor;
	}

	public Timestamp getFecharealizacion() {
		return fecharealizacion;
	}

	public void setFecharealizacion(Timestamp fecharealizacion) {
		this.fecharealizacion = fecharealizacion;
	}

	public String getLimitacion() {
		return limitacion;
	}

	public void setLimitacion(String limitacion) {
		this.limitacion = limitacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getVersiondoc() {
		return versiondoc;
	}

	public void setVersiondoc(String versiondoc) {
		this.versiondoc = versiondoc;
	}

	public String getAnexos() {
		return anexos;
	}

	public void setAnexos(String anexos) {
		this.anexos = anexos;
	}
	
	
	

	@Override
	public String toString() {
		return "EstudiosyConceptos [id=" + id + ", estudiotitulos=" + estudiotitulos + ", elaboradopor=" + elaboradopor
				+ ", fecharealizacion=" + fecharealizacion + ", limitacion=" + limitacion + ", descripcion="
				+ descripcion + ", versiondoc=" + versiondoc + ", anexos=" + anexos + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EstudiosyConceptos)) {
			return false;
		}
		EstudiosyConceptos infoC = (EstudiosyConceptos) obj;
		return this.id != null && this.id.equals(infoC.getId());
	}
	

	

}
