package proyecto.bd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table( name = "Direccion" )
public class Direccion  implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9055990801964057201L;
	private int id_direccion;
    private String calle;
    private String avenida;
    private int numero;
    private String colonia;
    private int codigo_postal;

    public Direccion(){

    }
    
    

    public Direccion(String calle, String avenida, int numero, String colonia, int codigo_postal) {
		super();
		this.calle = calle;
		this.avenida = avenida;
		this.numero = numero;
		this.colonia = colonia;
		this.codigo_postal = codigo_postal;
	}



	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
}
