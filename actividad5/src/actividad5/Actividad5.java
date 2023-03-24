package actividad5;

import java.util.Scanner;

public class Actividad5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("escribe un numero");
        double num = leer.nextInt();
        
        System.out.println("el doble del numero es: " + (num*2));
        System.out.println("el triple del numero es: " + (num*3));
        System.out.println("la raiz del numero es: " + Math.sqrt(num));
    }
    
}
