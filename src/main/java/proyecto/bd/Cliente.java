package proyecto.bd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Cliente" )
public class Cliente implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5221291657854268699L;
	private String email_cliente;
    private String tipo_cliente;
    private String lugar_trabajo;

    public Cliente(){

    }

    @Id
    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public String getLugar_trabajo() {
        return lugar_trabajo;
    }

    public void setLugar_trabajo(String lugar_trabajo) {
        this.lugar_trabajo = lugar_trabajo;
    }
}
