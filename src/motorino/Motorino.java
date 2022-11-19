package motorino;

public class Motorino {
    
    private String colore;
    private int velocita;
    private String marca;
    private String modello;
    private boolean antifurto;

    public Motorino(String c, int vel, String m, String mo, boolean a) {
        colore = c;
        velocita = vel;
        marca = m;
        modello = mo;
        antifurto = a;
    }
    
    
    public String getColore() {
        return colore;
    }
    public void setColore(String c) {
        colore = c;
    }
    
    
    public double getVelocita() {
        return velocita;
    }
    public void setVelocita(int v) {
        velocita = v;
    }
    
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String m) {
        marca = m;
    }
    
    
    public String getModello() {
        return modello;
    }
    public void setModello(String mo) {
        modello = mo;
    }
    
    
    public boolean getAntifurto() {
        return antifurto;
    }
    public void setantifurto(boolean a) {
        antifurto = a;
    }
    

    public void accelera(int v) {
        velocita += v;
    }

    public void decelera(int v) {
        velocita -= v;
    }

    public void frena() {
        velocita = 0;
    }

    public void inserisciAntifurto() {
        antifurto = true;
    }

    public String stampa() {
        String testo;
	testo = "colore " + colore +
                " velocità " + velocita + 
                " marca " + marca + 
                " modello " + modello + 
                " antifurto " + antifurto;
        return testo;
    }
}

