package proyecto.bd;

import java.io.Serializable;
import java.util.Date;


public class Viaje implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3248876846690354173L;
	private String email_cliente;
    private int id_direccion_origen;
    private int id_direccion_destino;
    private String email_conductor;
    private String hora_salida;
    private int distancia;
    private int cantidad_personas;
    private Date fecha;
    private String hora_llegada;

    public Viaje(){

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

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }
}
