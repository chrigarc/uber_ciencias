package proyecto.bd;

import java.io.Serializable;

public class TipoCliente implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5225278306640780734L;
	private String tipo_ciente;
    private int descuento;

    public TipoCliente(){

    }

    public String getTipo_ciente() {
        return tipo_ciente;
    }

    public void setTipo_ciente(String tipo_ciente) {
        this.tipo_ciente = tipo_ciente;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
