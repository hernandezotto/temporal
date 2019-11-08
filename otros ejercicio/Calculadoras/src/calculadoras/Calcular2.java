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
public class Calcular2 {
     public int sumar(int numeroA, int numeroB){
        int suma= numeroA+ numeroB;
        return suma;
    }
    public int restar(int numeroA, int numeroB){
        int resta= numeroA- numeroB;
        return resta;
    }
    public int multiplicar(int numeroA, int numeroB){
        int multiplicacion= numeroA* numeroB;
        return multiplicacion;
    }
    public int dividir(int numeroA, int numeroB){
        int division= numeroA/ numeroB;
        return division;
    }


    public void resultado ( int numeroa, int numerob,int resultadoSuma,int resultadoResta, int resultadoMultiplicar, int resultadoDividir ){
        System.out.println("Calculadora con método local");
        System.out.println("el resultado de la suma "+numeroa+" + "+numerob+" = "+resultadoResta);
        System.out.println("el resultado de la resta "+numeroa+" - "+numerob+" = "+resultadoResta);
        System.out.println("el resultado de la Multiplicar "+numeroa+" X "+numerob+" = "+resultadoMultiplicar);
        System.out.println("el resultado de la dividir "+numeroa+" / "+numerob+" = "+resultadoDividir);
    }
}
