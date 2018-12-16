package proyecto.bd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "Vehiculo" )
public class Vehiculo implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2139812100180191558L;
	private String numero_economico;
    private int id_modelo;
    private String estado;
    private String email_propietario;
    
    public Vehiculo(){

    }

    @Id
    public String getNumero_economico() {
        return numero_economico;
    }

    public void setNumero_economico(String numero_economico) {
        this.numero_economico = numero_economico;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail_propietario() {
        return email_propietario;
    }

    public void setEmail_propietario(String email_propietario) {
        this.email_propietario = email_propietario;
    }
}
