
package main;

public class Persona {
    String rut;
    String nombre;
    String apellido;
    String telefono;
    final int documento;
    int i;
    int cant;
    
   public Persona(){
       rut ="";
       nombre ="";
       apellido ="";
       telefono ="";
       documento =0;
       i =0;
       cant =0;
       
   }

    public Persona(String rut, String nombre, String apellido, String telefono, int documento, int i, int cant) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.documento = documento;
        this.i = i;
        this.cant = cant;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getDocumento() {
        return documento;
    }

    public int getI() {
        return i;
    }

    public int getCant() {
        return cant;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
        }
    
    public void setI(int i) {
        this.i = i;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "cliente{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", documento=" + documento + ", i=" + i + ", cant=" + cant + '}';
    }
   
          
    
    
    
}

