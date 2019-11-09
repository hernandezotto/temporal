/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Biblioteca {

    List<libro> libros = new  ArrayList();
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.libros= new ArrayList();
        biblioteca.menu();
    }
    public void menu(){
        Scanner scan= new Scanner(System.in);
        System.out.print(
                "Selecciones una opcion"+
                "\n1.) Ingrese los datos de un libro"+
                "\n2.) Añade un libro a su lista"+
                "\n3.) Elimina un libro de lista"+
                "\n4.) consulta la cabtidad de libros"+
                "\n5.) Libros con mayor calificación"+
                "\n6.) Salir del menu\n\n");
        int opciones=scan.nextInt();  
        switch(opciones){
            case 1:
                crearLibro();
                break;
            case 4:
                consultarLibros();
            case 6:
                System.out.print("Saliendo del menu... ¡ADIOS!\n\n");
                break;
            default:
                System.out.println("!Error¡ Seclciones una opcion");
                menu();
                break;
        }
    }
    public void crearLibro(){
        Scanner scan= new Scanner(System.in);
        String Titulo,Autor;
        int Cantidad,Calificacion;
        System.out.println("¿Cual es titulo del libro?");
        Titulo = scan.nextLine();
        System.out.println("¿Quien es autor del libro?");
        Autor = scan.nextLine();
        System.out.println("¿Cuantas  paginas son del libro?");
        Cantidad= Integer.parseInt(scan.nextLine());
        System.out.println("Califique del 1 al 10 el libro");
        Calificacion= Integer.parseInt(scan.nextLine());
        do{
            if(Calificacion<0||Calificacion>10)
            {System.out.println("Calificacion no valida Ingrese se nuevamente");}
        }while(Calificacion>0||Calificacion<10);
        libro Libros = new libro(Titulo, Autor, Cantidad, Calificacion);
        libros.add(Libros);
        menu();
    }
    
    
    public void consultarLibros(){
        System.out.println("El sistema  tiene los siguientes libros"+libros.size()+"\n\n");
        for(int i=0; i<libros.size();i++){
            System.out.print(
                    "Informacion de los libros"+
                    "\nTitulo: "+libros.get(i).getTitulo()+       
                    "\nAutor: "+libros.get(i).getAutor()+       
                    "\nCantidad de paginas: "+libros.get(i).getCanidad()+
                    "\nCalificacion del libro:"+ libros.get(i).getCalificacion()+"\n\n");
        }
        menu();
    }
    
}
