/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabacaria;

/**
 *
 * @author investigacion03
 */
public class Cuenta {
    final Integer cuenta;
    Float saldo;
    
    public Cuenta(int cuenta, float saldo) {
        this.cuenta = cuenta;
        this.saldo = saldo;
    }
    
    public Integer getCuenta(){
        return cuenta;
    }
    public Float getSaldo(){
        return saldo;
    }
    public void setSaldo(float Saldo){
         saldo=Saldo;
    }
}
