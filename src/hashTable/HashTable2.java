package adt.hashTable;

import java.util.Arrays;

/**
 * https://www.youtube.com/watch?v=KyUTuwz_b7Q
 * @author utente
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
    
    public static void main(String[] args) throws Exception {
        HashTable2 h = new HashTable2();
        
        System.out.println(h.toString());
        
        PersonaHT p1 = new PersonaHT("Santo", "29/02/2008");
        PersonaHT p2 = new PersonaHT("Giovanni", "28/02/2007");
        PersonaHT p3 = new PersonaHT("Mario", "19/08/1975");
        
        PersonaHT p4 = new PersonaHT("Mbqio", "20/09/1980");     
        PersonaHT p5 = new PersonaHT("Marhp", "12/12/1212");
        
        System.out.println(h.addElement(p1));        
        System.out.println(h.addElement(p2));        
        System.out.println(h.addElement(p3));
        
        System.out.println(h.addElement(p4));
        System.out.println(h.addElement(p5));             
        
        System.out.println(h.toString());        
        
        PersonaHT p6 = new PersonaHT("Marhp", "12/12/1212");
        System.out.println(h.findElement(p6));                
    }
}
