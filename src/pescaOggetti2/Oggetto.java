/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pescaOggetti2;

/**
 *
 * @author rikid
 */
public abstract class Oggetto {
    
    private int aggiungiPunti;
    
    /**
     * 
     * @param aggiungiPunti quanti punti da l'oggetto
     */
    public Oggetto(int aggiungiPunti) {
        this.aggiungiPunti = aggiungiPunti;
    }
    
    /**
     * 
     * @param ogg oggetto della classe
     */
    public Oggetto(Oggetto ogg) {
        this.aggiungiPunti = ogg.aggiungiPunti;
               
    }
    
    /**
     * Ritorna i punti che aggiunge l'oggetto
     * @return punti che aggiunge
     */
    public int getAggiungiPunti() {
        return aggiungiPunti;
    }
    
    /**
     * Ritorna il nome dell'oggetto
     * @return nome dell'oggetto
     */
    public abstract String nomeOggetto();
    
    /**
     * toString
     * @return 
     */
    @Override
    public String toString() {
        return "Oggetti{" + "aggiungiPunti=" + aggiungiPunti + '}';
    }
}
