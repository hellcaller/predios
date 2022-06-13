package microserviciosdapredioregistro.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "registros")
public class Registro {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombres_registros")
	private String nombreRegistro;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date registro;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreRegistro() {
		return nombreRegistro;
	}

	public void setNombreRegistro(String nombreRegistro) {
		this.nombreRegistro = nombreRegistro;
	}

	public Date getRegistro() {
		return registro;
	}

	public void setRegistro(Date registro) {
		this.registro = registro;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)
		{
			return true;
		}
		if(!(obj instanceof Registro))
		{
			return false;
		}
		
		Registro re = (Registro) obj;
		
		return this.id != null && this.id.equals(re.getId());
	}
	
	
	
	

}
