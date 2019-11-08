
package cuentabacaria;

public class Cuenta extends Persona{
    private final int nroCta;
    private String mora;
    private int saldo;

    public Cuenta(int nroCta, String mora, int saldo, String nombre, String apellido, int telefono, int documento, int cant) {
        super(nombre, apellido, telefono, documento, cant);
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
