/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author rikid
 */
public class Figlio extends Padre{
    
    private String ff;
    
    public Figlio(){
        super();
        this.ff = "figlio";
    }

    public String getFf() {
        return ff;
    }

    @Override
    public String toString() {
        return "Figlio{" + "ff=" + ff + "}" +
                super.toString();
    }
    
    @Override
    public void incrementa(){
        ff = "Ho modificato il metodo del padre";
    }
    
    
    
    
}
