package proyecto.bd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
    
    @Id
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
