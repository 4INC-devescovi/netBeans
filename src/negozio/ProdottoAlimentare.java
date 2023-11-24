/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negozio;

import java.time.LocalDate;

/**
 *
 * @author rikid
 */
public class ProdottoAlimentare extends Prodotto{
    
    private Data dataScadenza; //quanti giorni mancano alla scadenza
    private int sconto[];
    
    public ProdottoAlimentare(double prezzo, double iva, double peso, double tara, String descrizione, String codiceBarre, int giorno, int mese, int anno) {
        super(prezzo, iva, peso, tara, descrizione, codiceBarre);
        this.dataScadenza = new Data(giorno, mese, anno);
        
        sconto = new int[]{30, 50};
    }
    
    @Override
    public String toString(){
        return "ProdottoNonAlimentare:"
                + "\nData: " + dataScadenza.stampa()
                + "\n" + super.toString();
    }

    public int getGiornoScadenza() {
        return dataScadenza.getGiorno();
    }
    
    public int getMeseScadenza() {
        return dataScadenza.getMese();
    }
    public int getAnnoScadenza() {
        return dataScadenza.getAnno();
    }

    
    public double prezzoScontato() throws Exception{
        LocalDate dataOdierna = LocalDate.now();
        
        Data d = new Data(dataOdierna.getDayOfMonth(), dataOdierna.getMonthValue(),dataOdierna.getYear());
        int scadenza = dataScadenza.diffData(d);
        int sconto = 0;
        if(scadenza > 0){
            if(scadenza < 10){
                sconto = this.sconto[0];
                if(scadenza < 2){
                    sconto = this.sconto[1];
                }
            }
        }else{
            throw new Exception("Il prodotto " + getDescrizione() + " non può essere venduto.");
        }
        
        return prezzoIvato() - getPrezzo()*sconto/100;
    }
    
    
    
}
