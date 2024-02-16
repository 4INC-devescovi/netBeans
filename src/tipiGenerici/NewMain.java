/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipiGenerici;

/**
 *
 * @author rikid
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p1 = new Persona("nome1", "cognome1");
        Persona p2 = new Persona("nome2", "cognome2");
        Persona[] pArr = {p1, p2};
        
        System.out.println(Stampa.stampaArray(pArr));
    }
    
}
