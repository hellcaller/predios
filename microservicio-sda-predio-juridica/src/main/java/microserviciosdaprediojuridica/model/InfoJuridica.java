package microserviciosdaprediojuridica.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import microserviciosdapredioregistro.model.Registro;

@Entity
@Table(name = "info_juridica")
public class InfoJuridica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Column(name = "predio_adquirido")
	private String predioAdquirido;
	
	@Column(name = "matricula_inmobiliaria")
	private String matriculaInmobiliaria;
	
	private String propetiario;
	
	private String identificacion;
	
	
	
	@Column(name = "num_identificacion")
	private Long numIdentificacion;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Registro> registros;
	
	
	

	public InfoJuridica() {
		this.registros = new ArrayList<>();
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}
	
	public void addRegistro(Registro registros) {
		this.registros.add(registros);
	}
	
	public void removeRegistro(Registro registros) {
		this.registros.add(registros);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPredioAdquirido() {
		return predioAdquirido;
	}

	public void setPredioAdquirido(String predioAdquirido) {
		this.predioAdquirido = predioAdquirido;
	}

	public String getMatriculaInmobiliaria() {
		return matriculaInmobiliaria;
	}

	public void setMatriculaInmobiliaria(String matriculaInmobiliaria) {
		this.matriculaInmobiliaria = matriculaInmobiliaria;
	}

	public String getPropetiario() {
		return propetiario;
	}

	public void setPropetiario(String propetiario) {
		this.propetiario = propetiario;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Long getNumIdentificacion() {
		return numIdentificacion;
	}

	public void setNumIdentificacion(Long numIdentificacion) {
		this.numIdentificacion = numIdentificacion;
	}
	
	
	
	
}
