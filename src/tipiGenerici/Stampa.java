/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipiGenerici;

/**
 *
 * @author rikid
 */
public class Stampa{
    
    
    public static <T> String stampa(T dato){
        return dato.toString();
    }
    
    public static <T> String stampaArray(T[] dato){
        String s = "";
        for(T datoCopia: dato){
            s += datoCopia.toString() + "\n";
        }
        return s;
    }
    
    public static <T> String stampaObj(Object dato){
        return dato.toString();
    }
    
    public static <T> String stampaArrayObj(Object[] dato){
        String s = "";
        for(Object datoCopia: dato){
            s += datoCopia.toString() + "\n";
        }
        return s;
    }
    
}
