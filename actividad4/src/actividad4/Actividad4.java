package actividad4;

import java.util.Scanner;

public class Actividad4 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         System.out.println("definir grados centigrados");
         double c = leer.nextInt();
         
         System.out.println("los grados en Fahrenheit son: " + (32+(9*c/5)) + " F°");
    }
    
}
