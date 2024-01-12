/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oggetti;

/**
 * La classe Oggetti serve per creare gli oggetti presenti all'interno della
 * classe Cella.
 * @author Riccardo e Danilo
 */
public class Oggetti {
    
    private Integer aggiungiPunti;
    private Integer togliPunti;
    
    /**
     * 
     * @param aggiungiPunti quanti punti da l'oggetto
     * @param togliPunti quanti punti toglie l'oggetto agli avversari
     */
    public Oggetti(Integer aggiungiPunti, Integer togliPunti) {
        this.aggiungiPunti = aggiungiPunti.intValue();
        this.togliPunti = togliPunti.intValue();
    }
    
    /**
     * 
     * @param ogg oggetto della classe
     */
    public Oggetti(Oggetti ogg) {
        this.aggiungiPunti = ogg.aggiungiPunti;
        this.togliPunti = ogg.togliPunti;
               
    }
    
    /**
     * Ritorna i punti che aggiunge l'oggetto
     * @return punti che aggiunge
     */
    public Integer getAggiungiPunti() {
        return aggiungiPunti;
    }
    
    /**
     * Ritorna i punti che togli l'oggetto agli avversari
     * @return punti che toglie
     */
    public final Integer getTogliPunti() {
        return togliPunti;
    }
    
    /**
     * Ritorna il nome dell'oggetto
     * @return nome dell'oggetto
     */
    public String nomeOggetto() {
        return "OGGETTI";
    }
    
    /**
     * toString
     * @return 
     */
    @Override
    public String toString() {
        return "Oggetti{" + "aggiungiPunti=" + aggiungiPunti + ", togliPunti=" + togliPunti + '}';
    }
}
