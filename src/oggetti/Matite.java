/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oggetti;

/**
 * La classe Matite e' una sottoclasse della classe Oggetti. Questa farà parte
 * degli oggetti presenti nella classe Cella.
 * @author Riccardo e Danilo
 */
public class Matite extends Oggetti{
    
    /**
     * Costruttore della classe Matite
     */
    public Matite() {
        super(1, 0);
    }
    
    /**
     * Ritorna il nome dell'oggetto
     * @return nome dell'oggetto
     */
    @Override
    public String nomeOggetto() {
        return "MATITA";
    }

    /**
     * toString
     * @return 
     */
    @Override
    public String toString() {
        return "Matite{" + '}';
    }
}
