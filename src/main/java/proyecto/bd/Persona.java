package proyecto.bd;

import java.io.Serializable;

public class Persona implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6691194995405356671L;
	private String nombre;
    private String paterno;
    private String materno;
    private int id_direccion;
    private String email;
    private int telefono_celular;
    private int telefino_casa;
    private String rfc;

    public Persona(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono_celular() {
        return telefono_celular;
    }

    public void setTelefono_celular(int telefono_celular) {
        this.telefono_celular = telefono_celular;
    }

    public int getTelefino_casa() {
        return telefino_casa;
    }

    public void setTelefino_casa(int telefino_casa) {
        this.telefino_casa = telefino_casa;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
