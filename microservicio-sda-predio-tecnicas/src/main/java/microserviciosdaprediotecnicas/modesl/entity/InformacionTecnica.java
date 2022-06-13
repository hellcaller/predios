package microserviciosdaprediotecnicas.modesl.entity;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;





@Entity
@Table(name = "informacion_tecnica")
public class InformacionTecnica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String areaterreno;
	private String escrituraha;
	private String escrituraam2;
	private String certtradlib;
	private String certtradlibm2;
	private String levantopo;
	private String certcablin;
	private String uaecdm2;
	private String areaaquid;
	private String escrituram2;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAreaterreno() {
		return areaterreno;
	}
	public void setAreaterreno(String areaterreno) {
		this.areaterreno = areaterreno;
	}
	public String getEscrituraha() {
		return escrituraha;
	}
	public void setEscrituraha(String escrituraha) {
		this.escrituraha = escrituraha;
	}
	public String getEscrituraam2() {
		return escrituraam2;
	}
	public void setEscrituraam2(String escrituraam2) {
		this.escrituraam2 = escrituraam2;
	}
	public String getCerttradlib() {
		return certtradlib;
	}
	public void setCerttradlib(String certtradlib) {
		this.certtradlib = certtradlib;
	}
	public String getCerttradlibm2() {
		return certtradlibm2;
	}
	public void setCerttradlibm2(String certtradlibm2) {
		this.certtradlibm2 = certtradlibm2;
	}
	public String getLevantopo() {
		return levantopo;
	}
	public void setLevantopo(String levantopo) {
		this.levantopo = levantopo;
	}
	public String getCertcablin() {
		return certcablin;
	}
	public void setCertcablin(String certcablin) {
		this.certcablin = certcablin;
	}
	public String getUaecdm2() {
		return uaecdm2;
	}
	public void setUaecdm2(String uaecdm2) {
		this.uaecdm2 = uaecdm2;
	}
	public String getAreaaquid() {
		return areaaquid;
	}
	public void setAreaaquid(String areaaquid) {
		this.areaaquid = areaaquid;
	}
	public String getEscrituram2() {
		return escrituram2;
	}
	public void setEscrituram2(String escrituram2) {
		this.escrituram2 = escrituram2;
	}

	@Override
	public String toString() {
		return "InformacionTecnica [id=" + id + ", areaterreno=" + areaterreno + ", escrituraha=" + escrituraha
				+ ", escrituraam2=" + escrituraam2 + ", certtradlib=" + certtradlib + ", certtradlibm2=" + certtradlibm2
				+ ", levantopo=" + levantopo + ", certcablin=" + certcablin + ", uaecdm2=" + uaecdm2 + ", areaaquid="
				+ areaaquid + ", escrituram2=" + escrituram2 + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof InformacionTecnica)) {
			return false;
		}
		InformacionTecnica infoT = (InformacionTecnica) obj;
		return this.id != null && this.id.equals(infoT.getId());
	}
		
		


	
	
}
