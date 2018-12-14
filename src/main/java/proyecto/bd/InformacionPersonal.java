package proyecto.bd;

import java.io.Serializable;

public class InformacionPersonal implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8108628168067321291L;
	private int id_direccion_origen;
    private int id_direccion_destino;
    private String email_persona;

    public InformacionPersonal(){

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

    public String getEmail_persona() {
        return email_persona;
    }

    public void setEmail_persona(String email_persona) {
        this.email_persona = email_persona;
    }
}
