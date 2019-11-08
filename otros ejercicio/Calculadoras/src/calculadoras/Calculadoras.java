/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoras;

import javax.swing.JOptionPane;

/**
 *
 * @author otogu
 */
public class Calculadoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numeroA"));
        int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numeroB"));
        
        Calcular op= new Calcular ();
         op.sumar(numeroA, numeroB);
         op.restar(numeroA, numeroB);
         op.multiplicar(numeroA, numeroB);
         op.dividir(numeroA, numeroB);
         
         op.resultado(numeroA,numeroB);
                
        Calcular2 op2= new Calcular2();
        
         int sumar= op2.sumar(numeroA, numeroB);
         int restar= op2.restar(numeroA, numeroB);
         int multiplicar= op2.multiplicar(numeroA, numeroB);
         int dividir= op2.dividir(numeroA, numeroB);
         
         op2.resultado(numeroA,numeroB,sumar,restar,multiplicar,dividir);
    }
    
}
