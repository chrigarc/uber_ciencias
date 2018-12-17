package proyecto.bd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;


@Entity
@Table( name = "Conductor" )
public class Conductor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7745648183589531519L;
	
	
	private String email_conductor;
	private String licencia;
    private Persona persona;
    private Vehiculo vehiculo;
	
	public Conductor() {
		
	}
	
	
	@OneToOne	
    @JoinColumn(name="numero_economico")
	public Vehiculo getVehiculo() {
		return vehiculo;
	}



	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}



	@OneToOne	
    @JoinColumn(name="email_conductor")
    public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
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
