/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package letturaMessaggio;

/**
 *
 * @author riki and jack
 */
public abstract class LetturaMessaggio {
    
    private String testo;
    
    public LetturaMessaggio(String testo){
        this.testo = testo;
    }
    
    public abstract String leggiTesto();

    @Override
    public String toString() {
        return "LetturaMessaggio{" + "testo=" + testo + '}';
    }

    public String getTesto() {
        return testo;
    }
}
