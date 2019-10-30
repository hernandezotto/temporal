/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automoviles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author otogu
 */
public class Automoviles {
    List<coches>Coches=new ArrayList();
    public static void main(String[] args) {
        Automoviles listas= new Automoviles();
        listas.Coches = new ArrayList();
        listas.menu();
    }
    public void menu(){
        Scanner scanf = new Scanner(System.in);
        System.out.println(
                "Seleccione una opcion en el menu"+
                "\n1. Ingrese datos de un coche"+
                "\n2. Consultar datos de un coche"+
                "\n3. Modificar el color de un coche"+
                "\n4. Salir");
        
        int opciones= scanf.nextInt();
        switch(opciones){
            case 1:
                ingresarCoche();
            break;
            case 2:
                consultarCoche();
            break;
            case 3:
                modificarColorCoche();
                break;
            case 4:
                System.out.print("Saliendo del menu... !ADIOS¡");
                break;
            default:
                System.out.print("!!Error¡¡ ... Debes seleccionar una opcion que sea valida");
                menu();
                break;
        }
    }
    public void ingresarCoche(){
        Scanner scanf=new Scanner(System.in);
        System.out.print("Ingrese la matricula: ");
        String matriculaDelCoche=scanf.nextLine();
        System.out.print("Ingrese el color: ");
        String colorDelCoche=scanf.nextLine();
        System.out.print("Ingrese la marca: ");
        String marcaDelCoche=scanf.nextLine();
        System.out.print("Ingrese el modelo: ");
        String modeloDelCoche=scanf.nextLine();
        System.out.print("Ingrese los caballos de fuerza: ");
        int fuerzaDelCoche=scanf.nextInt();
        System.out.print("Ingrese la cantidad de puertas: ");
        int CantidadDePuertasDelCoche=scanf.nextInt();
        coches coche=new coches(colorDelCoche,marcaDelCoche,modeloDelCoche,matriculaDelCoche,fuerzaDelCoche,CantidadDePuertasDelCoche);
        Coches.add(coche);
        menu();
    }
    public void consultarCoche(){
        System.out.print(
               "Se ingresados coches y su cantidad de ingreso es de"+Coches.size()+
               "\nLos Siguientes datos son:");
        for(int i=0; i<Coches.size();i++){
            System.out.print("Caracteristicas del coche numero"+ (i+1) + 
               "\nPlaca"+Coches.get(i).getMatricula()+
               "\nColor"+Coches.get(i).getColor()+
               "\nMarca"+Coches.get(i).getMarca()+
               "\nModelo"+Coches.get(i).getModelo()+
               "\nNumero de caballos"+Coches.get(i).getFuerza()+
               "\n\nNumero de caballos"+Coches.get(i).getPuertas()+
               "Coche"+(i+1)+"\n\n");
                }
        menu();
    }
    public void modificarColorCoche(){
        Scanner scanf= new Scanner(System.in);
        System.out.print("Ingrese el numero del coche qu quiere cambiar: ");
        int NumeroDelCoche=scanf.nextInt();
        System.out.println("¿Decea  cambiar el color del color al coche?"+Coches.get(NumeroDelCoche-1).getMatricula()+"\nActualmente tiene color "+Coches.get(NumeroDelCoche-1).getColor()+
                    "\n1.Si"+
                    "\n\n1.No");
        int cambiarColorCoches=scanf.nextInt();
            
        if(cambiarColorCoches ==0){       
            System.out.print("Ingrese el nuevo color: ");
            String NuevoColorCoche=scanf.nextLine();
            Coches.get(NumeroDelCoche).setColor(NuevoColorCoche);
            System.out.print("Cambio el color del coche realizado con exito"+ NuevoColorCoche);
        }
    }
    
}
