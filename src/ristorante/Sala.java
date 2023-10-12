package ristorante;
public class Sala {
    private int numSala;
    private int capienzaTav;
    private int totTav;
    private Tavolo[] tavoli;
    
    
    
    public Sala(Sala s){
        this.numSala = s.numSala;
        this.capienzaTav = s.capienzaTav;
        this.totTav = s.totTav;
        
        tavoli = new Tavolo[s.tavoli.length];
        for(int i = 0; i < s.tavoli.length; i++)
            tavoli[i] = new Tavolo(s.tavoli[i]);
        
    }
    
    public Sala(Tavolo[] t, int numSala){
        this.numSala = numSala;
        this.capienzaTav = t.length;
        this.totTav = capienzaTav;
        
        tavoli = new Tavolo[t.length];
        for(int i = 0; i < tavoli.length; i++)
            tavoli[i] = new Tavolo(t[i]);
        
    }

    public int getNumSala() {
        return numSala;
    }

    public int getCapienzaTav() {
        return capienzaTav;
    }

    public int getTotTav() {
        return totTav;
    }

    public Tavolo getTavolo(int numTav) {
        return tavoli[cercaTav(numTav)];
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
        int indice = 0;
        while(indice < totTav && !tavoli[indice].prenota(persone))
            indice++;
        
        return (indice < totTav);
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
