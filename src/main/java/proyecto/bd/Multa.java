package proyecto.bd;

import java.io.Serializable;
import java.util.Date;

public class Multa implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1639285354314209139L;
	private String email_conductor;
    private String lugar;
    private int monto;
    private String infraccion;
    private String agente;
    private Date fecha;

    public Multa(){

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
