/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devescovi;

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
        Object[] elem = new Object[ELEMENTS.length];
        LinkedList<PersonaHT> link = new LinkedList();
        for(int i = 0; i < elem.length; i++){
            if(ELEMENTS[i] != null){
                link = (LinkedList)ELEMENTS[i];
                elem[i] = link.clone();
            } else{
                elem[i] = null;
            }
        }
        return elem;
    }
    
    public void addElement(PersonaHT element){
        int pos = findPosition(element)%ELEMENTS.length;
        LinkedList<PersonaHT> list = new LinkedList();
        if(ELEMENTS[pos] == null)
            ELEMENTS[pos] = list;
        else
            list = (LinkedList)ELEMENTS[pos];
        list.add(element);
       
    }
    
    public Integer findElement(PersonaHT element){
        Integer ris = -1;
        int pos = findPosition(element)%ELEMENTS.length;
        LinkedList<PersonaHT> list = new LinkedList();
        if(ELEMENTS[pos] != null)
            list = (LinkedList)ELEMENTS[pos];
            for(int i = 0; i < list.size(); i++)
                if(list.get(i).getNome() == element.getNome())
                    ris = pos;
        return ris;    
    }
    
    private Integer findPosition(PersonaHT element){
        int ris = 0;
        for(int i = 0; i < element.getNome().length(); i++)
            ris += ((Character)element.getNome().charAt(i)).hashCode();
        return ris;
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
