/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

/**
 *
 * @author otogu
 */
public class Figura {
     Float hipotenusa, catetoOpuesto,catetoAyacente;
     
    // 
    public Figura(float Opuesto, float Ayacente, float Hipotenusa){
         catetoOpuesto=Opuesto;
         catetoAyacente=Ayacente;
         hipotenusa=Hipotenusa;
         
    }
    public void consulta() {
        System.out.println("El cateto opuesto de  es "+catetoOpuesto);
        System.out.println("El  cateto ayacente es "+catetoAyacente);
        System.out.println("la hipotenusa del triangulo es: "+hipotenusa);
    }
    
}
