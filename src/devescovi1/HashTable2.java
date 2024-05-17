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
public class HashTable2 {
    private final Object[] ELEMENTS;

    public HashTable2() {
        ELEMENTS = new Object[11];
    }

    public Object[] getELEMENTS() {
        return ELEMENTS.clone();
    }
    
    public void addElementEasy(PersonaHT element) { //solo fino alla fine dell'array se c'è un elemento vuoto altrimenti sovrascrive la posizione trovata
        int pos = findPosition(element);
        
        while(ELEMENTS[pos] != null && pos < ELEMENTS.length-1)
            pos++;
            
        ELEMENTS[pos] = new PersonaHT(element);   
    }
    
    public Integer addElement(PersonaHT element) {
        int pos = findPosition(element);      
        
        if(isFull())
            return -1;
        
        while(ELEMENTS[pos] != null) {
            if(pos == ELEMENTS.length-1)
                pos = 0;
            else
                pos++;
        }            
        
        ELEMENTS[pos] = new PersonaHT(element);
        
        return pos;
    }    
    
    public Integer findElementEasy(PersonaHT element) {
        int pos = findPosition(element);
        
        //ricerca dalla posizione in poi
        int index = pos;        
        while(index <= ELEMENTS.length-1){
            if(ELEMENTS[index] != null && ((PersonaHT)ELEMENTS[index]).getNome().equals(element.getNome()))
                return index;
            else
                index++;
        }    
        
        //ricerca da 0 all'elemento prima della posizione
        index = 0;        
        while(index < pos){
            if(ELEMENTS[index] != null && ((PersonaHT)ELEMENTS[index]).getNome().equals(element.getNome()))
                return index;
            else
                index++;
        }   
        
        return -1;        
    }        
    
    public Integer findElement(PersonaHT element) {
        int pos = findPosition(element);       
                
        int index = pos;
        
        do {
            if(ELEMENTS[pos] != null && ((PersonaHT)ELEMENTS[pos]).getNome().equals(element.getNome()))
                return pos;
            else{
                pos++;
                pos = pos % ELEMENTS.length;
            }
        } while(pos != index);          
        
        return -1;
    }
        
    private Integer findPosition(PersonaHT element){
        int somma = 0;
        
        for(int i=0; i<element.getNome().length(); i++) {
            int index = element.getNome().charAt(i); //viene estratto il carattere della iesima posizione e convertito in intero (ovvero il corrispondente codice ASCII)
            somma += index;            
        }
        
        return somma % ELEMENTS.length;
    }
    
    private Boolean isFull() {     
        Boolean trovato = true;
        
        for (Object elemento : ELEMENTS)
            if (elemento == null) 
                trovato = false;                    
        
        return trovato;
    }    
    
    @Override
    public String toString() {
        return Arrays.toString(ELEMENTS);
    }
}
