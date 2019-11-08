package cuentabacaria;

/**
 *
 * @author investigacion03
 */
public class Persona {
 
    String nombre;
    String apellido;
    final int documento;
    int telefono;
    int cant;
    

    public Persona( String nombre, String apellido, int telefono, int documento, int cant) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.documento = documento;
        this.cant = cant;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public int getDocumento() {
        return documento;
    }

    public int getCant() {
        return cant;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
        }
    

    public void setCant(int cant) {
        this.cant = cant;
    }
}
