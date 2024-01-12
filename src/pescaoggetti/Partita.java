/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pescaoggetti;

import java.util.*;
/**
 *
 * @author Riccardo e Danilo
 */
public class Partita {
    private Tabellone t;
    private List<Giocatore> giocatori;
    private int turno;
    private int oggettiPescati;
    private String messaggioContenutoCella;
    
    /**
     * Costruttore della classe Partita
     * @param giocatori lista contenente i giocatori
     * @param righe quante righe avra' la tabella, deve essere maggiore o
     * uguale a 5
     * @param colonne quante colonne avra' la tabella, deve essere maggiore o
     * uguale a 5
     * @throws Exception se si effetuano evenutali errori durante la copia dei
     * giocatori e la creazione della tabella
     */
    public Partita(List<Giocatore> giocatori, Integer righe, Integer colonne) throws Exception {
        try {
            this.giocatori = copiaGiocatori(giocatori);
            t = new Tabellone(righe, colonne);
            turno = 0;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }    
    }
    
    private List<Giocatore> copiaGiocatori(List<Giocatore> giocatori) {
        ArrayList<Giocatore> temp = new ArrayList<>();
        for (int i = 0; i < giocatori.size(); i++) {
            temp.add(giocatori.get(i));
        }
        return temp;
    }
    
    /**
     * Cambia il turno
     */
    public void cambiaTurno() {
        turno++;
        if (turno >= giocatori.size()) {
            turno = 0;
        }
    }
    
    /**
     * Serve per copiare tutti i nomi dei giocatori in una lista
     * @return ritorna una lista di stringhe con i nomi dei giocatori
     */
    public List<String> getNicknameGiocatori() {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < giocatori.size(); i++) {
            temp.add(giocatori.get(i).getNickname());
        }
        return temp;
    }
    
    
    
    /**
     * Cerca la cella
     * @param n numero della riga
     * @param m numero della colonna
     * @return se la cella esiste ritorna true e effettua l'aumento del
     * punteggio, se non esiste o si effettua un errore ritorna false
     */
    public boolean cercaCella(int n, int m) {
        try {
            if (t.getCella(n, m).getPescata()) {
                return false;
            } else {
                messaggioPescata(t.getCella(n, m));
                setPunti(t.getCella(n, m));
                aggiungiOggettiPescati(t.getCella(n, m));
                t.getCella(n, m).pesca();
                t.validaMossa(n, m);
                return true;
            }
        } catch (Exception e) {
            return false;
        }
            
    }
    
    private void messaggioPescata(Cella c) {
        if (c.getContenuto() == null) 
            this.messaggioContenutoCella = "Cella vuota";
        else {
            this.messaggioContenutoCella = c.getContenuto().nomeOggetto();
        } 
        
    }
    
    private void aggiungiOggettiPescati(Cella c) {
        if (c.getContenuto() != null)
            oggettiPescati++;
    }
    
    private void setPunti(Cella c) {
        if (c.getContenuto() == null)
            return;        
        for (int i = 0; i < giocatori.size(); i++) {
            if (i == turno) {
                giocatori.get(i).aggiungiPunti(c.getContenuto().getAggiungiPunti());
            } else {
                giocatori.get(i).togliPunti(c.getContenuto().getTogliPunti());
            }
            
        }
    }
    
    /**
     * Ritorna l'ultima pescata effettuata
     * @return ritorna una stringa contenente l'ultima pescata
     */
    public String stampaPescata() {
        return this.messaggioContenutoCella;
    }
    
    /**
     * Ritorna i punteggi dei giocatori, pensato per il terminale
     * @return ritorna una stringa con il punteggio dei giocatori
     */
    public String stampaPunteggi() {
        String t = "";
        for (int i = 0; i < giocatori.size(); i++)
            t += giocatori.get(i).getNickname() + " punti: " + giocatori.get(i).getPunteggio() + "\n";
        return t;
    }
    
    /**
     * Ritorna i punteggi dei giocatori, pensato per i JFrame
     * @return ritorna una stringa con il punteggio dei giocatori
     */
    public String stampaPunteggiSchermata() {
        String t = "";
        for (int i = 0; i < giocatori.size(); i++)
            t += giocatori.get(i).getNickname() + " punti: " + giocatori.get(i).getPunteggio() + "<br>";
        return t;
    }
    
    /**
     * Ritorna tutte le mosse fatte, pensato per il terminale
     * @return ritorna una stringa con le mosse fatte
     */
    public String stampaMosseEseguite() {
        return t.stampaMosse();
    }
    
    /**
     * Ritorna tutte le mosse fatte, pensato per i JFrame
     * @return ritorna una stringa con le mosse fatte
     */
    public List<String> stampaMosseEseguiteSchermata() {
        return t.stampaMosseSchermata();
    }
    
    /**
     * Ritorna il giocatore di cui e' il turno
     * @return ritorna una stringa contenente il nome del giocatore
     */
    public String turno() {
        return "Tocca a " + giocatori.get(turno).getNickname();
    }
    
    /**
     * Determina se la partita e' finita tramite gli oggetti pescati
     * @return ritorna true se la partita e' finita, false se non lo e'
     */
    public boolean isFinish() {
        return oggettiPescati == t.getNumeroOggetti();
    }
}
