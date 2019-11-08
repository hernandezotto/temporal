
package main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Registro {
    
          
    List<Cuenta> cuentas = new ArrayList<>();
    List<Persona> personas = new ArrayList<>();
    

    
    public static void main(String[] args) {
        Registro cuenta= new Registro();
        /*cuenta.cuentas= new ArrayList();
        cuenta.menu(); */
        System.out.print("Ho");
    }
    public void menu(){
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione su Opción:" 
                                                                +"\n1. Crear cliente."
                                                                +"\n2. Crear cuenta."
                                                                +"\n3. Consultar saldo."
                                                                +"\n4. Pagos. "    
                                                                +"\n5. Salir","Bienvenidos Menú Principal",JOptionPane.INFORMATION_MESSAGE));
    switch(op)  
        {
            case 1:
                crearClientes();
                break;
        }
    }
    public void crearClientes(){
        JOptionPane.showMessageDialog(null,"hola");
    }
    
}       
