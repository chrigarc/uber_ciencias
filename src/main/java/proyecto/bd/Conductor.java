package proyecto.bd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "Conductor" )
public class Conductor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7745648183589531519L;
	
	private String numero_economico;
	private String email_conductor;
	private String licencia;
	
	public Conductor() {
		
	}
	
	public String getNumero_economico() {
		return numero_economico;
	}
	
	public void setNumero_economico(String numero_economico) {
		this.numero_economico = numero_economico;
	}
	
	@Id
	public String getEmail_conductor() {
		return email_conductor;
	}
	public void setEmail_conductor(String email_conductor) {
		this.email_conductor = email_conductor;
	}
	public String getLicencia() {
		return licencia;
	}
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	
}
