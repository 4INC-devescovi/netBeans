package adt.hashTable;

import java.util.LinkedList;
import java.util.Arrays;

/**
 * https://www.youtube.com/watch?v=KyUTuwz_b7Q
 * @author utente
 */
public class HashTable3 {
    private final Object[] ELEMENTS;            
        
    public HashTable3() {
        ELEMENTS = new Object[11];
    }

    public Object[] getELEMENTS() {
        return ELEMENTS.clone();
    }
    
    public void addElement(PersonaHT element) {
        int pos = findPosition(element);                
        
        if(ELEMENTS[pos] == null){
            LinkedList<Object> lista = new LinkedList<>();
            
            lista.add(new PersonaHT(element));
            
            ELEMENTS[pos] = lista;            
        } else         
            ((LinkedList<Object>)ELEMENTS[pos]).add(new PersonaHT(element));
    }

    public Integer findElement(PersonaHT element) {        
        int pos = findPosition(element);
        
        int trovato = -1;        
                        
        if(ELEMENTS[pos] != null)
            for(Object elemento: ((LinkedList<Object>)ELEMENTS[pos]))
                if(((PersonaHT)elemento).getNome().equals(element.getNome()))
                    trovato = pos;
            //if(((LinkedList<Object>)ELEMENTS[pos]).contains(element))
            //    trovato = pos;
        
        return trovato;
    }
    
    private Integer findPosition(PersonaHT element){
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
    
    public static void main(String[] args) throws Exception {
        HashTable3 h = new HashTable3();
        System.out.println(h.toString());
                
        PersonaHT p1 = new PersonaHT("Mario", "19/08/1975");
        h.addElement(p1);  
        System.out.println(h.toString());
        
        PersonaHT p2 = new PersonaHT("Mbqio", "20/09/1980");
        h.addElement(p2);  
        System.out.println(h.toString());
        
        PersonaHT p3 = new PersonaHT("Santo", "19/08/1975");
        h.addElement(p3);  
        System.out.println(h.toString());
        
        PersonaHT p4 = new PersonaHT("Sanun", "19/08/1975");
        h.addElement(p4);  
        System.out.println(h.toString());
        
        PersonaHT p5 = new PersonaHT("Sanun", "19/08/1975");
        System.out.println(h.findElement(p2)); 
    }
}
