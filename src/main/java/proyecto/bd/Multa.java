package proyecto.bd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import java.util.Date;


@Entity
@Table( name = "Multas" )
public class Multa implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1639285354314209139L;

	private int id_multa;
	private String email_conductor;
    private String lugar;
    private int monto;
    private String infraccion;
    private String agente;
    private Date fecha;

    public Multa(){

    }
    
    
    
    public Multa(String email_conductor, String lugar, int monto, String infraccion, String agente) {
		super();
		this.email_conductor = email_conductor;
		this.lugar = lugar;
		this.monto = monto;
		this.infraccion = infraccion;
		this.agente = agente;
		this.fecha = new Date();
	}

	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
    public int getId_multa() {
    	return id_multa;
    }
    
    public String getEmail_conductor() {
        return email_conductor;
    }

    public void setEmail_conductor(String email_conductor) {
        this.email_conductor = email_conductor;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getInfraccion() {
        return infraccion;
    }

    public void setInfraccion(String infraccion) {
        this.infraccion = infraccion;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
