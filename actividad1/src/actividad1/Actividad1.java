package actividad1;

import java.util.Scanner;

public class Actividad1 {
 
    public static void main(String[] args) {
        
        System.out.println("ingrese 2 numeros");
        
        Scanner leer = new Scanner(System.in);
        
        int num = leer.nextInt();
        
        int num1 = leer.nextInt();
    
       System.out.println("los numeros sumados son: " + (num1+num));
       
    }
}
