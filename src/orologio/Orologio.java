package orologio;
public class Orologio {
    private int ora;
    private int minuti;
    private int secondi;

    public Orologio(int ora, int minuti, int secondi) {
        this.ora = ora;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    public final int getOra() {
        return ora;
    }

    public final int getMinuti() {
        return minuti;
    }

    public final int getSecondi() {
        return secondi;
    }

    public final void setOra(int ora) {
        this.ora = ora;
    }

    public final void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public final void setSecondi(int secondi) {
        this.secondi = secondi;
    }
    
    public void impostaOrologio(int ora, int minuti, int secondi){
        setOra(ora);
        setMinuti(minuti);
        setSecondi(secondi);
    }
    
    public String dammiOrario(){
        return ora + ":" + minuti + ":" + secondi;
    }
    
    public String toString(){
        return "Orologio:"
                + "\nOra: " + ora
                + "\nMinuti: " + minuti
                + "\nSecondi: " + secondi; 
    }
}
