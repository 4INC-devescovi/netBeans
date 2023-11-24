/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author rikid
 */
public class Padre {
    
    private int pp;
    
    public Padre(){
        pp = 0;
    }

    @Override
    public String toString() {
        return "Padre{" + "pp=" + pp + '}';
    }

    public int getPp() {
        return pp;
    }
    
    public void incrementa(){
        pp++;
    }
    
    
}
