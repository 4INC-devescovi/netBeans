/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pescaOggetti2;

import java.util.Random;

/**
 *
 * @author rikid
 */
enum Tipologia {
    ARROTONDATA,
    A_PUNTA
}



public class Forbici extends Oggetto {
    
    private Tipologia tipoPunta;
    private int togliPunti;
    
    /**
     * Costruttore della classe Forbici
     */
    public Forbici(int aggiungiPunti, int togliPunti) {
        super(aggiungiPunti);
        this.togliPunti = togliPunti;
        Random r = new Random();
        if (r.nextInt(2)+1 == 1) {
            this.tipoPunta = Tipologia.ARROTONDATA; 
        } else {
            this.tipoPunta = Tipologia.A_PUNTA; 
        }   
    }
    
    /**
     * Ritorna la tipologia della punta dell'oggetto Forbice
     * @return la tipologia della punta
     */
    public Tipologia getTipoPunta() {
        return tipoPunta;
    }

    
    /**
     * Ritorna il nome dell'oggetto
     * @return nome dell'oggetto
     */
    @Override
    public String nomeOggetto() {
        return "FORBICE " + tipoPunta;
    }

    /**
     * toString
     * @return 
     */
    @Override
    public String toString() {
        return "Forbici{" + "tipoPunta=" + tipoPunta + '}';
    }
    
    

    
    
}