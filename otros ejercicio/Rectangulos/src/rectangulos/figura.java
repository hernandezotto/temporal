/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulos;

/**
 *
 * @author otogu
 */
public class figura {
    Integer area, base,altura;
     
    // 
    public figura(int Base, int Altura, int Area){
         base=Base;
         altura=Altura;
         area=Area;
         
    }
    public void consulta() {
        System.out.println("El base de  es "+base);
        System.out.println("El  altura es "+altura);
        System.out.println("la area del triangulo es: "+area);
    }
}
