/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaGarage;

/**
 *
 * @author RICCARDO.DEVESCOVI
 */
public class Parcheggio {
    
    private String codice;
    private Double tariffa;
    
    public Parcheggio(String codice, Double tariffa) throws Exception{
        
    }

    public void setCodice(String codice) {
        if(codice == null || codice.isEmpty())
            
        this.codice = codice;
    }
    
    
}
