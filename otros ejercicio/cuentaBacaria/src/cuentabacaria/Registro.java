package cuentabacaria;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Registro {
    List<Cuenta> cuentas=new ArrayList();
    List<Persona> personas=new ArrayList();
    public static void main(String[] args) {
       Registro leer = new Registro();
       leer.menu();
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
            case 2:
                   crearCuenta();
                   break;
        }
    }
    public void crearClientes(){
       String nombres = JOptionPane.showInputDialog("Nombres del cliente");
       String apellidos = JOptionPane.showInputDialog("Apellidos del cliente");
       Integer numeroDocumento = Integer.parseInt(JOptionPane.showInputDialog("Nunero de indentidad Cedula del cliente"));
       Integer numeroTelefonico = Integer.parseInt(JOptionPane.showInputDialog("Telefono del cliente"));
       Integer cantdad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad monetario  a ingresar del cliente"));
       Persona Personas=new Persona(nombres,apellidos,numeroTelefonico,numeroDocumento,cantdad);
       personas.add(Personas);
    }
    public void crearCuenta()
    {
        
    }
}