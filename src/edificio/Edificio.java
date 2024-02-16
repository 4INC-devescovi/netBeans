/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edificio;

/**
 *
 * @author rikid
 */
public abstract class Edificio {
    
    private Impianto caldaia;
    private String indirizzo;
    private int numeroCivico;
    private boolean isGarage;

    public Edificio(Impianto caldaia, String indirizzo, int numeroCivico, boolean isGarage) {
        this.caldaia = new Impianto(caldaia);
        this.indirizzo = indirizzo;
        this.numeroCivico = numeroCivico;
        this.isGarage = isGarage;
    }
    
    
}
