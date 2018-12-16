package proyecto.bd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "Tipo_Cliente" )
public class TipoCliente implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5225278306640780734L;
	private String tipo_cliente;
    private int descuento;

    public TipoCliente(){

    }

    @Id
    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
