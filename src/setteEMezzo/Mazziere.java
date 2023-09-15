package setteEMezzo;

public class Mazziere {
    private double mano;
    private String nome;

    public Mazziere() {
        this.nome = "Mazziere";
    }

    public void setMano(double valore) {
        mano += valore;
    }

    public double getMano() {
        return mano;
    }

    public String getNome() {
        return nome;
    }

    public String decisioneMossa() {
        String mossa = "";
        if (mano < 6.5) {
            mossa = "carta";
        } else {
            mossa = "stai";
        }
        return mossa;
    }

}
