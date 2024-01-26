/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparableExample;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author rikid
 */
public class NewMain{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Persona> arr = new ArrayList<>();
        arr.add(new Persona("Gianluca", "Fortarel"));
        arr.add(new Persona("Danilo", "Telch"));
        arr.add(new Persona("Giacomo", "Calo"));
        arr.add(new Persona("Riccardo", "Devescovi"));
        
        int i = 0;
        for (Persona element : arr) {
            i++;
            System.out.println("Cella " + i + ":\n" + element.toString());
        }
        //Collections.sort(arr);
        arr.sort(Comparator.reverseOrder());
        i = 0;
        for (Persona element : arr) {
            i++;
            System.out.println("Cella " + i + ":\n" + element.toString());
        }
    }
    
}
