package test;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        
        try {
            //System.out.print("Inserisci il dividendo: ");
            int dividendo = 1;//in.nextInt();
            
            //System.out.print("Inserisci il divisore: ");
            int divisore = 1;//in.nextInt();
            
            System.out.println("Divisione: " + dividendo/divisore);
            
            int[] vett = {1, 2, 3};
            for(int i = 0; i < 4; i++)
                System.out.println(vett[i]);
            
        } catch (ArithmeticException e) {
            System.err.println("Impossibile dividere per 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Oltre la lunghezza del vettore");
        } catch (Exception e) {
            System.err.println("Errore");
        } finally {
            System.out.println("Verro' eseguito sempre");
        }
        
        try {
            Test t = new Test(5.0, "rosso", "aa11");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
