
package setteemezzoGhil;

public class Carta {
    
    private String seme;
    private int valore; 

    public Carta(String seme, int valore) {
        this.seme = seme;
        this.valore = valore;
    }

    public String getSeme() {
        return seme;
    }

    public void setSeme(String seme) {
        this.seme = seme;
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    @Override
    public String toString() {
        return "[" + "seme=" + seme + " - valore=" + valore + ']';
    }
    
    
    
}
