package setteEMezzo;

public class Giocatore {
    private String nome;
    private double mano;

    public Giocatore(String nome) {
        this.nome = nome;
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
}
