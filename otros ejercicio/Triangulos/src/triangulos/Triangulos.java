/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

import java.util.Scanner;

/**
 *
 * @author otogu
 */
public class Triangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner scanf = new Scanner (System.in);
        Figura hipotenusas[] = new Figura [3];
        for(int i = 0;i<hipotenusas.length;i++){
            System.out.print("ingrese el cateto opuesto: ");
            float opuesto = scanf.nextFloat();
            System.out.print("ingrese el cateto ayacente: ");
            float ayacente = scanf.nextFloat();
            float hipotenusa=(float)Math.sqrt(Math.pow(ayacente,2)+Math.pow(opuesto,2));
            System.out.println("La hipotenusa del triangulo "+hipotenusa+"\n\n");
            hipotenusas[i] = new Figura (opuesto, ayacente,hipotenusa);
        }
        for(int i = 0;i<hipotenusas.length;i++){
            System.out.println("elemento "+(i+1)+"\n");
            hipotenusas[i].consulta();
    }
    }
    
}
