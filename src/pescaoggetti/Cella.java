/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pescaoggetti;


import oggetti.Oggetti;
/**
 * La classe Cella formera' le varie celle all'interno della classe Tabellone
 * @author Riccardo e Danilo
 */
public class Cella {
    private Oggetti contenuto;
    private boolean pescata;
    
    /**
     * Costruttore della classe cella
     * @param cella
     */
    public Cella(Oggetti cella) {
        this.contenuto = cella; 
        pescata = false;
    }
    
    /**
     * Ritorna l'oggetto contenuto nella cella
     * @return oggetto
     */
    public final Oggetti getContenuto() {
        return contenuto;
    }    
    
    /**
     * Si usa questo metodo per segnare che questa cella e' stata pescata
     */
    public void pesca() {
        pescata = true;
    }
    
    /**
     * Ritorna se la cella e' gia' stata pescata
     * @return se e' stata pescata
     */
    public boolean getPescata() {
        return pescata;
    }

    /**
     * toString
     * @return 
     */
    @Override
    public String toString() {
        return "Cella{" + "contenuto=" + contenuto + ", pescata=" + pescata + '}';
    }
}
