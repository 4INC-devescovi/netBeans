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
    
    public Parcheggio(){
        
    }
    
    public Parcheggio(String codice, Double tariffa) throws Exception{
        setCodice(codice);
        setTariffa(tariffa);
    }
    
    public Parcheggio(Parcheggio parcheggio){
        codice = parcheggio.codice;
        tariffa = parcheggio.tariffa;
    }

    public void setCodice(String codice) throws Exception{
        if(codice == null || codice.isEmpty())
            throw new Exception("Devi inserire un codice. ");
        this.codice = codice;
    }

    public void setTariffa(Double tariffa) throws Exception{
        if(tariffa == null || tariffa < 0)
            throw new Exception("La tariffa deve essere maggiore di 0. ");
        this.tariffa = tariffa;
    }

    public String getCodice() {
        return codice;
    }

    public Double getTariffa() {
        return tariffa;
    }

    
    @Override
    public String toString() {
        return "Parcheggio{" + "codice=" + codice + ", tariffa=" + tariffa + '}';
    }
    
    
    
    
    
    
}
