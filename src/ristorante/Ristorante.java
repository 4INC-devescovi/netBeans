package ristorante;
public class Ristorante {
    
    private int capienzaTav;
    private int totTav;
    private Tavolo[] tavoli;
    
    public Ristorante(Tavolo[] t){
        /*for(int i = 0; i < t.length; i++){
            tavoli[i] = new Tavolo(t[i]);
        }*/
        this.tavoli = t;
        this.totTav = tavoli.length;
        this.capienzaTav = this.totTav;
    }
    
    private int cercaTav(int numTav){
        int indice = 0;
        while(indice < totTav && tavoli[indice].getNumTav() != numTav)
            indice++;
        return indice;
    }
    
    public boolean siediti(int numTav){
        return tavoli[cercaTav(numTav)].siediti();
    }
    
    public boolean alzati(int numTav){
        return tavoli[cercaTav(numTav)].alzati();
    }
     
    public int totPosti(){
        int ris = 0;
        for(int i = 0; i < totTav; i++)
            ris += tavoli[i].getCapienza();
        return ris;
    }
    
    public int totPersoneSedute(){
        int ris = 0;
        for(int i = 0; i < totTav; i++)
            ris += tavoli[i].getNumPers();
        return ris;
    }
    
    public boolean prenota(int persone){
        boolean ris = false;
        int indice = 0;
        while(indice < totTav && !tavoli[indice].prenota(persone))
            indice++;
        if(indice < totTav)
            ris = true;
        return ris;
    }
    
    public boolean disdici(int numTav){
        return tavoli[cercaTav(numTav)].disdici();
    }
    
    public boolean addTav(Tavolo t){
        boolean ris = false;
        if(totTav<capienzaTav){
            tavoli[totTav] = new Tavolo(t);
            totTav++;
            ris = true;
        }
        return ris;
    }
    
    private void shiftSx(int indice){
        for(int i = indice; i < totTav; i++)
            tavoli[i - 1] = tavoli[i];
    }
    
    public void remTav(int numTav){
        shiftSx(cercaTav(numTav));
    }
}
