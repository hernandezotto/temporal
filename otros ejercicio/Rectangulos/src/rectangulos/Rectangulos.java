/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulos;

import java.util.Scanner;

/**
 *
 * @author otogu
 */
public class Rectangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanf = new Scanner (System.in);
        figura areas[] = new figura [3];
        for(int i = 0;i<areas.length;i++){
            System.out.print("ingrese la  base: ");
            int base = scanf.nextInt();
            System.out.print("ingrese la  altura: ");
            int altura = scanf.nextInt();
            int area=altura*base;
            System.out.println("La area del rectangulo "+area+"\n\n");
            areas[i] = new figura (base, altura,area);
        }
        for(int i = 0;i<areas.length;i++){
            System.out.println("elemento "+(i+1)+"\n");
            areas[i].consulta();
    }
    }
    
}
