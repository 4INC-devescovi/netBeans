package ristorante;
public class RistoranteMain {
    
    public static void main(String[] args) {
        
        int[] capienza = {6,7,4,8,5,9};
        int[] numPers = {2,4,0,5,1,0};
        int[] numTav = {34,21,67,104,69,17};
        boolean[] prenotato = {true, false, false, false, true, true};
        Tavolo[] t = new Tavolo[capienza.length];
        
        for(int i = 0; i < t.length; i++)
            t[i] = new Tavolo(capienza[i], numPers[i], numTav[i], prenotato[i]);
        
        Ristorante r = new Ristorante(t);
        
        System.out.println("Siediti: " + r.siediti(67));
        System.out.println("Alzati: " + r.alzati(21));
        System.out.println("Posti totali: " + r.totPosti());
        System.out.println("Persone sedute totali: " + r.totPersoneSedute());
        System.out.println("Prenota: " + r.prenota(9));
        System.out.println("Disdici: " + r.disdici(104));
        
        Tavolo t1 = new Tavolo(1,1,1,true);
        r.addTav(t1);
        r.remTav(67);
    }
    
}
