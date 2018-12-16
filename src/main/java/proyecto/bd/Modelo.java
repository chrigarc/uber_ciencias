package proyecto.bd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table( name = "Modelo" )
public class Modelo implements Serializable  {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4541088148388735177L;
	private String id_modelo;
    private Date anio;
    private String marca;
    private int cilindros;
    private int puertas;
    private String manejo;
    private String consumo;
    private int cantidad_de_pasajeros;

    public Modelo(){

    }

    @Id
    public String getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(String id_modelo) {
        this.id_modelo = id_modelo;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getManejo() {
        return manejo;
    }

    public void setManejo(String manejo) {
        this.manejo = manejo;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public int getCantidad_de_pasajeros() {
        return cantidad_de_pasajeros;
    }

    public void setCantidad_de_pasajeros(int cantidad_de_pasajeros) {
        this.cantidad_de_pasajeros = cantidad_de_pasajeros;
    }
}
