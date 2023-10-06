package ristorante;
public class Ristorante {
    
    private int saleOccupate;  //diml
    private int maxSale;
    private Sala[] sale;
    
    public Ristorante(Sala[] sale){
        this.sale = new Sala[sale.length];
        for(int i = 0; i < this.sale.length; i++)
            this.sale[i] = new Sala(sale[i]);
        
        saleOccupate = sale.length;
        maxSale = saleOccupate;
    }
    
    public Ristorante(Tavolo[][] t){
        this.sale = new Sala[t.length];
        for(int i = 0; i < this.sale.length; i++)
            this.sale[i] = new Sala(t[i], i);
                
        saleOccupate = sale.length;
        maxSale = saleOccupate;
    }
    
    private int cercaSala(int numSala){
        int indice = 0;
        while(indice < maxSale && sale[indice].getNumSala() != numSala)
            indice++;
        return indice;
    }
    
    public boolean siediti(int numTav, int numSala){
        return sale[cercaSala(numSala)].siediti(numTav);
    }
    
    public boolean alzati(int numTav, int numSala){
        return sale[cercaSala(numSala)].alzati(numTav);
    }
     
    public int totPostiSala(int numSala){
        return sale[cercaSala(numSala)].totPosti();
    }
    
    public int totPersoneSeduteSala(int numSala){
        return sale[cercaSala(numSala)].totPersoneSedute();
    }
    
    public boolean prenota(int persone, int numSala){
        return sale[cercaSala(numSala)].prenota(persone);
    }
    
    public boolean disdici(int numTav, int numSala){
        return sale[cercaSala(numSala)].disdici(numTav);
    }
    
    public boolean addTav(Tavolo t, int numSala){
        return sale[cercaSala(numSala)].addTav(t);
    }
    
    public void remTav(int numTav, int numSala){
        sale[cercaSala(numSala)].remTav(numTav);
    }
    
    public boolean addSala(Sala s){
        boolean ris = false;
        if(saleOccupate < maxSale){
            sale[saleOccupate] = new Sala(s);
            saleOccupate++;
            ris = true;
        }
        return ris;
    }
    
    private void shiftSx(int indice){
        for(int i = indice; i < saleOccupate; i++)
            sale[i - 1] = sale[i];
    }
    
    public void remSala(int numSala){
        shiftSx(cercaSala(numSala));
    }
    
    public void spostaTav(int numSalaPartenza, int numSalaArrivo, int numTav){
        int indiceSalaP = cercaSala(numSalaPartenza);
        int indiceSalaA = cercaSala(numSalaArrivo);
        if(sale[indiceSalaA].getTotTav() < sale[indiceSalaA].getCapienzaTav()){
            Tavolo t = sale[indiceSalaP].getTavolo(numTav);
            sale[indiceSalaA].addTav(t);
            sale[indiceSalaP].remTav(numTav);
        }
    }
}
