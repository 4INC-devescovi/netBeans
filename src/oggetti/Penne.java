/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oggetti;

/**
 * La classe Penne e' una sottoclasse della classe Oggetti. Questa farà parte
 * degli oggetti presenti nella classe Cella.
 * @author Riccardo e Danilo
 */
public class Penne extends Oggetti {
    private Boolean isStilografica;
    
    /**
     * Costruttore della classe Penne
     */
    public Penne() {
        super(4, 0);
        isStilografica = false;
    }

    /**
     * Ritorna se la penna e' stilografica 
     * @return se e' stilografica
     */
    public final Boolean getIsStilografica() {
        return isStilografica;
    }
    
    /**
     * Imposta se la penna e' stilografica
     * @param isStilografica
     * @throws Exception se il parametro e' null
     */
    public final void setIsStilografica(Boolean isStilografica) throws Exception{
        if (isStilografica == null)
            throw new Exception("Il parametro non può essere null");
        this.isStilografica = isStilografica;
    }
    
    /**
     * Ritorna il nome dell'oggetto
     * @return nome dell'oggetto
     */
    @Override
    public String nomeOggetto() {
        return "PENNA" + ((isStilografica) ? " STILOGRAFICA" : "");
    }
    
    /**
     * Ritorna i punti che aggiunge la penna
     * @return punti della gomma
     */
    @Override
    public Integer getAggiungiPunti() {
        if (isStilografica)
            return 5;
        else {
          return super.getAggiungiPunti();   
        } 
    }
    
    /**
     * toString
     * @return 
     */
    @Override
    public String toString() {
        return "Penne{" + "isStilografica=" + isStilografica + '}';
    }
}
