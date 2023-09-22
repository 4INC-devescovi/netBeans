package setteemezzoGhil;

public class Partita {

    private Mazziere mazziere;
    private Giocatore[] giocatori;
    private int dimLGiocatori;
    private final int MAX_GIOCATORI_TAVOLO = 8;

    public Mazziere getMazziere() {
        return mazziere;
    }

    public Partita(Mazziere mazziere, Giocatore[] giocatori) {
        this.mazziere = mazziere;
        this.giocatori = new Giocatore[MAX_GIOCATORI_TAVOLO];
        this.dimLGiocatori = giocatori.length;

        for (int i = 0; i < dimLGiocatori; i++) {
            this.giocatori[i] = (giocatori[i]);
        }
    }

    public String stampaSaldoGiocatori() {
        String testo = "\n";
        for (int i = 0; i < dimLGiocatori; i++) {
            testo += giocatori[i].getNome() + " saldo " + giocatori[i].getSaldo() + "\n";
        }
        return testo;
    }

    public String inizioPartita() {
        mazziere.getMazzo().mescola();
        String testo = "\n";
        for (int i = 0; i < dimLGiocatori; i++) {
            if (controlloGiocatoreInGioco(i)) {
                testo += giocatori[i].getNome() + " hai pescato " + assegnaCarta(i) + "\n";
            }
        }
        mazziere.pescaMazziere();
        return testo + "mazziere: " + mazziere.getMano()[0].toString() + "\n";
    }

    public String assegnaCarta(int iGiocatore) {
        Carta c = mazziere.pesca();
        giocatori[iGiocatore].aggiungiCarta(c);
        return c.toString();

    }

    public boolean controlloGiocatoreInGioco(int iGiocatore) {
        boolean r = false;

        if (giocatori[iGiocatore].getPuntata() > 0) {
            r = true;
        }

        return r;
    }

    public String stampaMano(Carta[] mano, int numCarteMano) {
        String testo = "";
        for (int i = 0; i < numCarteMano; i++) {
            testo += mano[i].toString() + " - ";
        }
        return testo;
    }

    public double calcolaPunteggio(Carta[] mano, int numCarteMano) {
        double punteggio = 0;
        for (int i = 0; i < numCarteMano; i++) {

            if (mano[i].getValore() >= 8) {
                punteggio += 0.5;
            } else {
                punteggio += mano[i].getValore();
            }
        }

        return punteggio;
    }

    public String terminaPartita() {
        int saldoVittoria = 0;
        String resocontoPartita = "RESOCONTO PARTITA:\n";
        double punteggioMazziere = calcolaPunteggio(mazziere.getMano(), mazziere.getnCarteMano());
        for (int i = 0; i < dimLGiocatori; i++) {
            if (giocatori[i].getPuntata() > 0) {
                resocontoPartita += "giocatore: " + giocatori[i].getNome();
                double punteggioGiocatori = calcolaPunteggio(giocatori[i].getMano(), giocatori[i].getnCarteMano());
                if (punteggioGiocatori > 7.5 || (punteggioGiocatori < punteggioMazziere && punteggioMazziere <= 7.5)) {
                    resocontoPartita += " hai perso";
                    saldoVittoria += giocatori[i].getPuntata();
                } else if (punteggioGiocatori == punteggioMazziere) {
                    resocontoPartita += " hai pareggiato";
                    giocatori[i].modificaSaldo(giocatori[i].getPuntata());
                } else {
                    resocontoPartita += " hai vinto";
                    giocatori[i].modificaSaldo(giocatori[i].getPuntata() * 2);
                    saldoVittoria -= giocatori[i].getPuntata();
                }
                giocatori[i].cancellaMano();
                resocontoPartita += "\n";
            }
        }
        mazziere.aggiornaSaldo(saldoVittoria);
        mazziere.cancellaMano();
        mazziere.cancellaMazzo();

        return resocontoPartita;
    }
    
    

    public void confermaPartecipazione(int puntata, int iGiocatore) {
        if (puntata > 0) {
            giocatori[iGiocatore].partecipa(puntata);
        }
    }

    public Giocatore[] getGiocatori() {
        return giocatori;
    }
    
    

}
