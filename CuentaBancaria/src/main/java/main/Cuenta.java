
package main;

public class Cuenta extends Persona {
    
    private final int nroCta;
    private String mora;
    private int saldo;

    public Cuenta() {
        this.nroCta=0;
        this.saldo=0;
        this.mora="";
    }

    public Cuenta(int nroCta) {
        this.nroCta = nroCta;
    }

    public Cuenta(int nroCta, String rut, String nombre, String apellido, String telefono, String documento, int i, int cant,String mora,int saldo) {
        this.nroCta = nroCta;
        this.mora = mora;
        this.saldo = saldo;
    }

    public int getNro() {
        return nroCta;
    }

    public String getTipo() {
        return mora;
    }

    public int getSaldo() {
        return saldo;
    }

    
    public void setTipo(String mora) {
        this.mora = mora;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
}
