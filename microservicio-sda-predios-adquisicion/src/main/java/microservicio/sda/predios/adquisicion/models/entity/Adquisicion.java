package microservicio.sda.predios.adquisicion.models.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.microservicio.sda.predios.app.informaciongeneral.models.entity.InformacionGeneral;

@Entity
@Table(name = "adquisicion")
public class Adquisicion {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String oferta;
	private Timestamp fechaoferta;	
	private String oficionot;
	private Timestamp fechanot;
	private Timestamp fechaacepoferta;
	private Timestamp fechainscripcionoferta;
	private Timestamp fechaoficioinscripcionofer;
	private String oficioinscripcion;
	private Timestamp fechacancelacionoferta;
	private String anexodoc;
	private String observaciones;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOferta() {
		return oferta;
	}

	public void setOferta(String oferta) {
		this.oferta = oferta;
	}

	public Timestamp getFechaoferta() {
		return fechaoferta;
	}

	public void setFechaoferta(Timestamp fechaoferta) {
		this.fechaoferta = fechaoferta;
	}

	public String getOficionot() {
		return oficionot;
	}

	public void setOficionot(String oficionot) {
		this.oficionot = oficionot;
	}

	public Timestamp getFechanot() {
		return fechanot;
	}

	public void setFechanot(Timestamp fechanot) {
		this.fechanot = fechanot;
	}

	public Timestamp getFechaacepoferta() {
		return fechaacepoferta;
	}

	public void setFechaacepoferta(Timestamp fechaacepoferta) {
		this.fechaacepoferta = fechaacepoferta;
	}

	public Timestamp getFechainscripcionoferta() {
		return fechainscripcionoferta;
	}

	public void setFechainscripcionoferta(Timestamp fechainscripcionoferta) {
		this.fechainscripcionoferta = fechainscripcionoferta;
	}

	public Timestamp getFechaoficioinscripcionofer() {
		return fechaoficioinscripcionofer;
	}

	public void setFechaoficioinscripcionofer(Timestamp fechaoficioinscripcionofer) {
		this.fechaoficioinscripcionofer = fechaoficioinscripcionofer;
	}

	public String getOficioinscripcion() {
		return oficioinscripcion;
	}

	public void setOficioinscripcion(String oficioinscripcion) {
		this.oficioinscripcion = oficioinscripcion;
	}

	public Timestamp getFechacancelacionoferta() {
		return fechacancelacionoferta;
	}

	public void setFechacancelacionoferta(Timestamp fechacancelacionoferta) {
		this.fechacancelacionoferta = fechacancelacionoferta;
	}

	public String getAnexodoc() {
		return anexodoc;
	}

	public void setAnexodoc(String anexodoc) {
		this.anexodoc = anexodoc;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	

	@Override
	public String toString() {
		return "Adquisicion [id=" + id + ", oferta=" + oferta + ", fechaoferta=" + fechaoferta + ", oficionot="
				+ oficionot + ", fechanot=" + fechanot + ", fechaacepoferta=" + fechaacepoferta
				+ ", fechainscripcionoferta=" + fechainscripcionoferta + ", fechaoficioinscripcionofer="
				+ fechaoficioinscripcionofer + ", oficioinscripcion=" + oficioinscripcion + ", fechacancelacionoferta="
				+ fechacancelacionoferta + ", anexodoc=" + anexodoc + ", observaciones=" + observaciones + "]";
	}
	
	
	
	
	
}
