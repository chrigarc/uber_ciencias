package proyecto.bd;

import java.io.Serializable;
import java.util.Date;

public class Modelo implements Serializable  {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4541088148388735177L;
	private int id_modelo;
    private Date anio;
    private String marca;
    private int cilindros;
    private int puertas;
    private String manejo;
    private String consumo;
    private int cantidad_pasejeros;

    public Modelo(){

    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
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

    public int getCantidad_pasejeros() {
        return cantidad_pasejeros;
    }

    public void setCantidad_pasejeros(int cantidad_pasejeros) {
        this.cantidad_pasejeros = cantidad_pasejeros;
    }
}
