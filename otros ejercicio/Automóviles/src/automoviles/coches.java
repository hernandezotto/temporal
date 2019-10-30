/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automoviles;


public class coches {
    String color,marca, modelo;
    Integer caballoDeFuerza, numeroDePuertas;
    final String matricula;
    
    public coches(String Color, String Marca,String Modelo,String Matricula, int Fuerza, int cantidadPuertas ){
        color=Color;
        marca=Marca;
        modelo=Modelo;
        matricula=Matricula;
        caballoDeFuerza=Fuerza;
        numeroDePuertas=cantidadPuertas;
           
    }
    public String getColor(){
        return color;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public Integer getFuerza(){
        return caballoDeFuerza;
    }
    public Integer getPuertas(){
        return numeroDePuertas;
    }
    public String getMatricula(){
        return matricula;
    }
    
    public void setColor(String cambiarColor){
        color= cambiarColor;
    } 
}
