/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oggetti;

import java.util.Random;

/**
 * La classe Gomme e' una sottoclasse della classe Oggetti. Questa farà parte
 * degli oggetti presenti nella classe Cella.
 * @author Riccardo e Danilo
 */

enum Durezza {
    MORBIDA,
    MEDIA,
    DURA
}


public class Gomme extends Oggetti{
    private Durezza tipoDurezza;
    private Boolean isRed;

    /**
     * Costruttore della classe Gomme
     */
    public Gomme() {
        super(2, 0);
        Random r = new Random();
        int scelta = r.nextInt(2)+1;
        if (scelta == 1) {
            this.tipoDurezza = Durezza.DURA; 
        } else if (scelta == 2) {
            this.tipoDurezza = Durezza.MEDIA; 
        }  else {
            this.tipoDurezza = Durezza.MORBIDA;
        } 
        
        isRed = false;
    }
    
    /**
     * Ritorna la tipologia di durezza della gomma
     * @return tipologia di durezza
     */
    public final Durezza getTipoDurezza() {
        return tipoDurezza;
    }

    /**
     * Ritorna se la gomma e' rossa
     * @return se e' rossa
     */
    public final Boolean isRed() {
        return isRed;
    }
    
    /**
     * Imposta se la gomma e' rossa
     * @param isRed
     * @throws Exception se il parametro e' null
     */
    public final void setIsRed(Boolean isRed) throws Exception {
        if (isRed == null)
            throw new Exception("Il parametro non può essere null");
        this.isRed = isRed;
    }
    
    /**
     * Ritorna i punti che aggiunge la gomma
     * @return punti della gomma
     */
    @Override
    public Integer getAggiungiPunti() {
        if (isRed)
            return -1;
        else {
          return super.getAggiungiPunti();   
        } 
    }
    
    
    /**
     * Ritorna il nome dell'oggetto
     * @return nome dell'oggetto
     */
    @Override
    public String nomeOggetto() {
        return "GOMMA " + tipoDurezza + ((isRed) ? " ROSSA" : "");
    }

    /**
     * toString
     * @return 
     */
    @Override
    public String toString() {
        return "Gomme{" + "tipoDurezza=" + tipoDurezza + ", isRed=" + isRed + '}';
    }
    
    
    
    
}
