package test;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        
        try {
            System.out.print("Inserisci il dividendo: ");
            int dividendo = in.nextInt();
            
            System.out.print("Inserisci il divisore: ");
            int divisore = in.nextInt();
            
            System.out.println("Divisione: " + dividendo/divisore);
            
        } catch (ArithmeticException e) {
            System.err.println("Impossibile dividere per 0");
        }
    }
    
}
