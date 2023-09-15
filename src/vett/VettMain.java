package vett;

import java.util.Scanner;

public class VettMain {

    public static void main(String[] args) {
        String[] a=new String[10];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            System.out.print("Inserisci un valore " + (i+1) + ": ");
            a[i] = scan.next();
            System.out.println();
        }
        
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]);
        System.out.println();
        
        Vett v=new Vett(a);
        
        System.out.print(v.stampa());
        
        System.out.println();
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]);
    }
    
}
