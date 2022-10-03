
package practica14;
//Operadores lógicos 

import javax.swing.JOptionPane;


public class Practica14 {
//Instancia variable de tipo String
    //Tipo - dato  //Nombre - Variable
    String           nombre;
    
    //Crear un constructor 
    public Practica14 (){
        pideNombre();
        mostrarSaludo();
    }
    private void pideNombre (){
        nombre = JOptionPane.showInputDialog(null, "Introduce un nombre: ");
    }
    private void mostrarSaludo (){
                                      //Se concatena con "+" 
        if (nombre==null || nombre.equals("")){
           JOptionPane.showMessageDialog(null, "No se ingreso un nombre" + nombre); 
        }
     else {
            JOptionPane.showInputDialog("Holis"+ nombre);
        }
    }
    
    public static void main(String[] args) {
        new Practica14 ();
    }
    
}
