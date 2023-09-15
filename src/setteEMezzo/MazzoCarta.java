package setteEMezzo;

import java.util.Random;

public class MazzoCarta {
    private Carta[] carte;
    private int dimL;

    public MazzoCarta(String[] desc, int nCarte) {
        carte = new Carta[nCarte * desc.length];
        caricaCarte(desc.length, nCarte, desc);
    }

    private void caricaCarte(int nSemi, int nCarte, String[] desc) {
        boolean[][] controllo = new boolean[nSemi][nCarte];
        Random rand = new Random();
        int seme = 0;
        int carta = 0;
        while (dimL < nCarte * nSemi) {
            carta = 1 + rand.nextInt(nCarte);
            seme = rand.nextInt(nSemi);
            if (!controllo[seme][carta - 1]) {
                controllo[seme][carta - 1] = true;
                carte[dimL] = new Carta(desc[seme], carta);
                dimL++;
            }
        }
    }

    public double estraiCarta() {
        double valore = carte[0].getValore();
        scarta();
        dimL--;
        if (valore >= 8) {
            valore = 0.5;
        }
        return valore;
    }

    private void scarta() {
        for (int i = 0; i < dimL - 1; i++)
            carte[i] = carte[i + 1];
    }
}
