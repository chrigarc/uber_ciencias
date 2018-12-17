package proyecto.bd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
@Table( name = "Vehiculo" )
public class Vehiculo implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2139812100180191558L;
	private String numero_economico;
    private Modelo id_modelo;
    private String estado;
    private Persona propietario;
       
    public Vehiculo(){

    }

	@OneToOne
    @JoinColumn(name="email_propietario")
    public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	@Id
    public String getNumero_economico() {
        return numero_economico;
    }

    public void setNumero_economico(String numero_economico) {
        this.numero_economico = numero_economico;
    }

    @OneToOne    
    @JoinColumn(name="id_modelo")
    public Modelo getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(Modelo id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
