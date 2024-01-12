/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oggetti;

import java.util.Random;
/**
 * La classe Forbici e' una sottoclasse della classe Oggetti. Questa farà parte
 * degli oggetti presenti nella classe Cella.
 * @author Riccardo e Danilo
 */

enum Tipologia {
    ARROTONDATA,
    A_PUNTA
}



public class Forbici extends Oggetti {
    private Tipologia tipoPunta;
    
    
    /**
     * Costruttore della classe Forbici
     */
    public Forbici() {
        super(1, 5);
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
