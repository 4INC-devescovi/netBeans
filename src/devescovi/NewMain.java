/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devescovi;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S51VERIFICA09
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            
            
            HashTable3 h = new HashTable3();
            PersonaHT p = new PersonaHT("Mario", "12/12/2023");
            PersonaHT p2 = new PersonaHT("Mrio", "12/12/2024");
            
            h.addElement(p);
            h.addElement(p2);
            
            System.out.println(h.findElement(p2));
            
            System.out.println(h.toString());
            
            Character c = '0';
            Character c2 = '9';
            System.out.println(c.hashCode());
            System.out.println(c2.hashCode());
            /*LinkedList<PersonaHT>[] arr = new LinkedList[1];
            PersonaHT p = new PersonaHT("Mario", "12/12/2023");
            arr[1].add(p);
            LinkedList<PersonaHT> list2 = new LinkedList((LinkedList)arr[1]);
            list2.add(p);
            PersonaHT p2 = list2.get(0);
            System.out.println(p2.getNome());*/
        } catch (Exception ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
