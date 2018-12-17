package proyecto.bd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
@Table( name = "Persona" )
public class Persona implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6691194995405356671L;
	private String nombre;
    private String paterno;
    private String materno;
    private int id_direccion;
    private String email;
    private String telefono_celular;
    private String telefono_casa;
    private String rfc;
    
    private Direccion direccion;

    public Persona(){

    }
    
    

    public Persona(String nombre, String paterno, String materno, int id_direccion, String email,
			String telefono_celular, String telefono_casa, String rfc) {
		super();
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.id_direccion = id_direccion;
		this.email = email;
		this.telefono_celular = telefono_celular;
		this.telefono_casa = telefono_casa;
		this.rfc = rfc;
	}


	@OneToOne	
    @JoinColumn(name="id_direccion")
	public Direccion getDireccion() {
		return direccion;
	}



	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}



	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }


    @Id
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono_celular() {
        return telefono_celular;
    }

    public void setTelefono_celular(String telefono_celular) {
        this.telefono_celular = telefono_celular;
    }

    public String getTelefono_casa() {
        return telefono_casa;
    }

    public void setTelefono_casa(String telefono_casa) {
        this.telefono_casa = telefono_casa;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
