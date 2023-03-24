package actividad3;

import java.util.Scanner;

public class Actividad3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("escribe una frase");
        
        String frase = leer.next();
        
        System.out.println("la frase en mayusculas es: " + (frase.toUpperCase()));
        System.out.println("la frase en minusculas es: " + (frase.toLowerCase()));
    }
    
}
