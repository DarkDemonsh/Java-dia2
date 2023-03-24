
package actividad2;

import java.util.Scanner;

public class Actividad2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe tu nombre");
        
         String nombre = leer.next();
         
         System.out.println("Escribe tu apellido");
        
         String apellido = leer.next();
        
        System.out.println("tu nombre es : " + nombre + " " + apellido );
        
    }
    
}
