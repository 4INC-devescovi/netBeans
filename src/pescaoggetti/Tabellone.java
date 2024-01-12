/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pescaoggetti;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import oggetti.*;

/**
 *
 * @author Riccardo e Danilo
 */
public class Tabellone {

    private List<List<Cella>> tabella;
    private Integer n; //numero di righe
    private Integer m; //numero di colonne
    private int numeroOggetti;
    private List<String> mosseEseguite;
    
    /**
     * Costruttore della classe Tabellone
     * @param righe quante righe avra' la tabella, deve essere maggiore o
     * uguale a 5
     * @param colonne quante colonne avra' la tabella, deve essere maggiore o
     * uguale a 5
     * @throws Exception se i parametri sono null o minori di 5
     */
    public Tabellone(Integer righe, Integer colonne) throws Exception {
        if (righe == null || colonne == null) {
            throw new Exception("I parametri non possono essere null");
        }
        if (righe < 5 || colonne < 5) {
            throw new Exception("Impossibile creare la tabella, misure troppo piccole");
        }
        n = righe;
        m = colonne;
        tabella = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Cella> riga = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                riga.add(null);
            }
            tabella.add(riga);
        }
        
        try {
            popolaTabellone();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        initCelleNull();
        mosseEseguite = new ArrayList<>();
    }
    
    /**
     * Riempie gli spazi vuoti della tabella con delle celle impostate a null
     */
    public void initCelleNull() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tabella.get(i).get(j) == null) {
                    tabella.get(i).set(j, new Cella(null));
                }
            }
        }
    }
    
    /**
     * Ritorna quante colonne ha la tabella
     * @return 
     */
    public Integer getM() {
        return m;
    }

    /**
     * Ritorna quante righe ha la tabella
     * @return 
     */
    public Integer getN() {
        return n;
    }

    /**
     * Ritorna il numero di oggetti totali presenti nella tabella
     * @return 
     */
    public int getNumeroOggetti() {
        return numeroOggetti;
    }
    
    /**
     * Ritorna una cella, localizzata tramite i parametri all'interno della
     * tabella
     * @param n riga
     * @param m colonna
     * @return ritorna la cella localizzata
     * @throws Exception se la riga o la colonna non esistono
     */
    public Cella getCella(int n, int m) throws Exception{
        if (n < 0 || m < 0){
            throw new Exception();
        }
        if (n > this.n || m > this.m){
            throw new Exception();
        }
        return tabella.get(n).get(m);
    }
    
    /**
     * Questo metodo memorizza la mossa appena eseguita
     * @param n riga
     * @param m colonna
     */
    public void validaMossa(int n, int m) {
        String t = "";
        if (tabella.get(n).get(m).getContenuto() == null) {
            t = "riga: " + n + ", colonna: " + m + ", oggetto pescato: Cella Vuota";
        } else {
            t = "riga: " + n + ", colonna: " + m + ", oggetto pescato: " + tabella.get(n).get(m).getContenuto().nomeOggetto();
        }
        mosseEseguite.add(t);
    }
    
    private void popolaTabellone() throws Exception {
        try {
            int numeroTotaleCelle = n * m;

            int numeroForbici = (int) (numeroTotaleCelle * 0.05);  // 5% di forbici
            int numeroGomme = (int) (numeroTotaleCelle * 0.12);    // 12% di gomme
            int numeroMatite = (int) (numeroTotaleCelle * 0.16);   // 16% di matite
            int numeroPenne = (int) (numeroTotaleCelle * 0.07);  // 7% di penne

            numeroOggetti = numeroForbici + numeroGomme + numeroMatite + numeroPenne +2;
            popolaTipoOggetto("forbice", numeroForbici);
            popolaTipoOggetto("gomma", numeroGomme);
            popolaTipoOggetto("matita", numeroMatite);
            popolaTipoOggetto("penna", numeroPenne);
            popolaOggettiSpeciali();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    private void popolaTipoOggetto(String tipo, int quantita) throws Exception {
        try {
            Random random = new Random();
            int riga, colonna;

            for (int i = 0; i < quantita; i++) {
                do {
                    riga = random.nextInt(tabella.size());
                    colonna = random.nextInt(tabella.get(0).size());
                } while (tabella.get(riga).get(colonna) != null);

                Cella c = creaOggetto(tipo);
                tabella.get(riga).set(colonna, c);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    
    private void popolaOggettiSpeciali() throws Exception{
        Oggetti[] o = creaOggettiParticolari();
        
        
        Random random = new Random();
        int riga, colonna;
        for (int i = 0; i < 2; i++) {
            do {
                riga = random.nextInt(tabella.size());
                colonna = random.nextInt(tabella.get(0).size());
            } while (tabella.get(riga).get(colonna) != null);

            Cella c = new Cella(o[i]);
            tabella.get(riga).set(colonna, c);
        }
        
        
    }

    
    private Oggetti[] creaOggettiParticolari() throws Exception{
        Gomme g = new Gomme();
        g.setIsRed(Boolean.TRUE);
        Penne p = new Penne();
        p.setIsStilografica(Boolean.TRUE);
        Oggetti[] o = new Oggetti[2];
        o[0]= g;
        o[1]=p;
        return o;
    }
    
    private Cella creaOggetto(String tipo) throws Exception {
        try {
            switch (tipo) {
                case "forbice":
                    return new Cella(new Forbici());
                case "gomma":
                    return new Cella(new Gomme());
                case "matita":
                    return new Cella(new Matite());
                case "penna":
                    return new Cella(new Penne());
                default:
                    return null;
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    /**
     * Ritorna la tabella convertita in una stringa
     * @return ritorna una stringa contenente la tabella
     */
    public String stampaTabellone() {
        String t = "";
        for (List<Cella> riga : tabella) {
            for (Cella c : riga) {
                if (c != null) {
                    t += c.getContenuto().nomeOggetto()+ "\t";
                } else {
                    t += "Vuoto\t";
                }
            }
            t += "\n";
        }
        return t;
    }
    
    /**
     * Ritorna tutte le mosse fatte, pensato per il terminale
     * @return ritorna una stringa con le mosse fatte
     */
    public String stampaMosse() {
        String t = "";
        for (int i = 0; i < mosseEseguite.size(); i++) {
            t += mosseEseguite.get(i) + "\n";
        }
        return t;
    }
    
    /**
     * Ritorna tutte le mosse fatte, pensato per i JFrame
     * @return ritorna una stringa con le mosse fatte
     */
    public List<String> stampaMosseSchermata() {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < mosseEseguite.size(); i++) {
            temp.add(mosseEseguite.get(i));
        }
        return temp; 
    }

    
}
