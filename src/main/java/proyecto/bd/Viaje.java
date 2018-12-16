package proyecto.bd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import org.hibernate.annotations.GenericGenerator;

import java.util.Date;


@Entity
@Table( name = "Viajes" )
public class Viaje implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3248876846690354173L;
	
	private int id_viaje;
	private String email_cliente;
    private int id_direccion_origen;
    private int id_direccion_destino;
    private String email_conductor;    
    private int distancia;
    private int cantidad_personas;
    private Date fecha_inicio;
    private Date fecha_fin;

    public Viaje(){

    }
    
    public Viaje(String email_cliente,int id_direccion_origen,int id_direccion_destino,int cantidad_personas) {
    	this.email_cliente=email_cliente;
    	this.id_direccion_origen=id_direccion_origen;
    	this.id_direccion_destino=id_direccion_destino;
    	this. cantidad_personas=cantidad_personas;
    	java.util.Random r = new java.util.Random();
    	this.distancia = r.nextInt(500) + 50;
    	this.email_conductor = "";
    	this.fecha_inicio = new Date();
    	this.fecha_fin = new Date();
    }
    
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
    public int getId_viaje() {
    	return id_viaje;
    }

    public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public void setId_viaje(int id_viaje) {
		this.id_viaje = id_viaje;
	}

	public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public int getId_direccion_origen() {
        return id_direccion_origen;
    }

    public void setId_direccion_origen(int id_direccion_origen) {
        this.id_direccion_origen = id_direccion_origen;
    }

    public int getId_direccion_destino() {
        return id_direccion_destino;
    }

    public void setId_direccion_destino(int id_direccion_destino) {
        this.id_direccion_destino = id_direccion_destino;
    }

    public String getEmail_conductor() {
        return email_conductor;
    }

    public void setEmail_conductor(String email_conductor) {
        this.email_conductor = email_conductor;
    }

        public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getCantidad_personas() {
        return cantidad_personas;
    }

    public void setCantidad_personas(int cantidad_personas) {
        this.cantidad_personas = cantidad_personas;
    }

}
