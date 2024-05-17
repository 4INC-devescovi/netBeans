/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devescovi1;

import java.util.LinkedList;

/**
 *
 * @author S51VERIFICA09
 */
public class HashTable3 {
    private static Object[] ELEMENTS;
    
    public HashTable3(){
        ELEMENTS = new Object[11];
            
    }
    
    public Object[] getELEMENTS(){
        return ELEMENTS.clone();
    }
    
    public void addElement(PersonaHT element){
        int pos = findPosition(element);
        LinkedList<PersonaHT> list = new LinkedList();
        if(ELEMENTS[pos] == null)
            ELEMENTS[pos] = list;
        else
            list = (LinkedList)ELEMENTS[pos];
        list.add(element);
       
    }
    
    public Integer findElement(PersonaHT element){
        int pos = findPosition(element);
        
        int trovato = -1;        
                        
        if(ELEMENTS[pos] != null)
            for(Object elemento: ((LinkedList<Object>)ELEMENTS[pos]))
                if(((LinkedList<Object>)ELEMENTS[pos]).contains(element))
                    trovato = pos;
        return trovato;    
    }
    
    private Integer findPosition(PersonaHT element){
        int ris = 0;
        for(int i = 0; i < element.getNome().length(); i++)
            ris += element.getNome().charAt(i);
        return ris%ELEMENTS.length;
    }
    
    @Override
    public String toString(){
        String s = "";
        LinkedList<PersonaHT> list = new LinkedList();
        for(int i = 0; i < ELEMENTS.length; i++)
            if(ELEMENTS[i] != null){
                list = (LinkedList)ELEMENTS[i];
                for(int j = 0; j < list.size(); j++)
                    s += list.get(j).toString() + ", ";
            } else{
                s += "null, ";
            }
        return s.substring(0, (s.length() - 2));
    }
}
