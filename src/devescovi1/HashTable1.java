/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devescovi1;

import java.util.Arrays;

/**
 *
 * @author RICCARDO.DEVESCOVI
 */
public class HashTable1 {
    private final Object[] ELEMENTS;
    
    public HashTable1() {
        ELEMENTS = new Object[11];
    }

    public Object[] getELEMENTS() {
        return ELEMENTS.clone();
    }
    
    public void addElement(PersonaHT element) {
        int pos = findPosition(element);
        
        ELEMENTS[pos] = new PersonaHT(element);
    }
    
    public Integer findElement(PersonaHT element) {        
        int pos = findPosition(element);
        
        if(ELEMENTS[pos] != null && ((PersonaHT)ELEMENTS[pos]).getNome().equals(element.getNome()))
            return pos;
        else
            return -1;
    }            
    
    private Integer findPosition(PersonaHT element) {
        int somma = 0;
        
        for(int i=0; i<element.getNome().length(); i++) {
            int index = element.getNome().charAt(i); //viene estratto il carattere della iesima posizione e convertito in intero (ovvero il corrispondente codice ASCII)
            somma += index;            
        }
        
        return somma % ELEMENTS.length;
    }
    
    @Override
    public String toString() {        
        return Arrays.toString(ELEMENTS);
    }
}
