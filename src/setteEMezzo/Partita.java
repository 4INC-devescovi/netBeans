package setteEMezzo;

public class Partita {
    private MazzoCarta mazzo;
    private Giocatore[] giocatori;
    private Mazziere mazziere;
    private int turno;

    public Partita(String[] nomiGiocatori, String[] desc, int nCarte) {
        mazzo = new MazzoCarta(desc, nCarte);
        giocatori = new Giocatore[nomiGiocatori.length];
        for (int i = 0; i < giocatori.length; i++)
            giocatori[i] = new Giocatore(nomiGiocatori[i]);
        this.mazziere = new Mazziere();
    }

    public double estraiCarta() {
        return mazzo.estraiCarta();
    }

    public double getMano() {
        return giocatori[turno].getMano();
    }

    public void setMano(double valore) {
        giocatori[turno].setMano(valore);
    }

    public double getManoMazziere() {
        return mazziere.getMano();
    }

    public void setManoMazziere(double valore) {
        mazziere.setMano(valore);
    }

    public void gioca() {
        for (int i = 0; i < giocatori.length; i++) {
            giocatori[turno].setMano(estraiCarta());
            setTurno();
        }
        mazziere.setMano(estraiCarta());
        turno = 0;
    }

    public void setTurno() {
        turno++;
        if (turno >= giocatori.length) {
            turno = 0;
        }
    }

    public String getGiocatore() {
        return giocatori[turno].getNome();
    }

    public String risultatoPartita() {
        String t = "";

        if (mazziere.getMano() > 7.5) {
            for (int i = 0; i < giocatori.length; i++) {
                if (giocatori[i].getMano() <= 7.5) {
                    t += "Vince " + giocatori[i].getNome() + " con il punteggio di " + giocatori[i].getMano() + "\n";
                }
            }
        } else {
            for (int i = 0; i < giocatori.length; i++) {
                if (giocatori[i].getMano() <= 7.5 && giocatori[i].getMano() > mazziere.getMano()) {
                    t += "Vince " + giocatori[i].getNome() + " con il punteggio di " + giocatori[i].getMano() + "\n";
                } else if (giocatori[i].getMano() == mazziere.getMano()) {
                    t += giocatori[i].getNome() + " con il punteggio di " + giocatori[i].getMano()
                            + "pareggia con il mazziere\n";
                }
            }

        }
        if (t.isEmpty() && !(mazziere.getMano() > 7.5)) {
            t = "Il mazziere vince con " + mazziere.getMano() + "\n";
        } else if (t.isEmpty()) {
            t = "Nessuno vince\n";
        }

        return t;

    }

    public String decisioneMossa() {
        return mazziere.decisioneMossa();
    }

}
