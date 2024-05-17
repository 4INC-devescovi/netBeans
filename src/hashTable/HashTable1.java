package adt.hashTable;

import java.util.Arrays;

/**
 * https://www.youtube.com/watch?v=KyUTuwz_b7Q
 * @author utente
 */
public class HashTable1 {
    //private final Object[] ELEMENTS = new Object[11];
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
    
    public static void main(String[] args) throws Exception {
        HashTable1 h = new HashTable1();
        
        System.out.println(h.toString());
        
        PersonaHT p1 = new PersonaHT("Santo", "29/02/2008");
        PersonaHT p2 = new PersonaHT("Giovanni", "28/02/2007");
        PersonaHT p3 = new PersonaHT("Mario", "19/08/1975");
        PersonaHT p4 = new PersonaHT("Marip", "20/09/1980");
        
        h.addElement(p1);        
        h.addElement(p2);        
        h.addElement(p3);
        System.out.println(h.toString()); 
        
        h.addElement(p4);
        System.out.println(h.toString());       
        
        PersonaHT p5 = new PersonaHT("Giovanni", "12/12/1212");
        System.out.println(h.findElement(p5));        
        
        //----------------------------------------------------------------------
        final Object[] FINAL_ARRAY = {1,2,3};
        
        System.out.println(Arrays.toString(FINAL_ARRAY));
        
        Object[] normalArray = {4,5,6};
        
        System.out.println(Arrays.toString(normalArray));
        
        //FINAL_ARRAY = normalArray;
        //FINAL_ARRAY = null;
        
        normalArray = FINAL_ARRAY;
        
        System.out.println(Arrays.toString(normalArray));
        //----------------------------------------------------------------------
    }
}
