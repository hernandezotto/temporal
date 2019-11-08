/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoras;

/**
 *
 * @author otogu
 */
public class Calcular {
    int suma, resta, multiplicacion,division; 
    
    public void sumar(int numeroA, int numeroB){
        suma= numeroA+numeroB;
    }
    public void restar(int numeroA, int numeroB){
        resta= numeroA-numeroB;
    }
    public void multiplicar(int numeroA, int numeroB){
        multiplicacion= numeroA*numeroB;
    }
    public void dividir(int numeroA, int numeroB){
        division= numeroA/numeroB;
    }
    
    
    public void resultado(int numeroa,int numerob){
      System.out.println( "Calculadora con métodos globlales"); 
      System.out.println("el resultodo de la suma "+numeroa+" + "+numerob+" = " + suma);  
      System.out.println("el resultodo de resta "+numeroa+" - "+numerob+" = "+ resta);   
      System.out.println("el resultodo de multiplicación "+numeroa+" X "+numerob+" = "+ multiplicacion);   
      System.out.println("el resultodo de division "+numeroa+" / "+numerob+" = " + division+"\n \n");   
    }
    
}
