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
public class Livello {
    
    private Parcheggio[] parcheggi;
    private Integer pDisponibili;
    
    public Livello(Parcheggio[] parcheggi, Integer pDisponibili){
        
    }
    
    public void setParcheggi(Parcheggio[] parcheggi) {
        if(parcheggi == null || parcheggi.length < 1)
            throw new Exception("Sciao billone");
    }
}
