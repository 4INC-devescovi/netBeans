package frase.es;
public class Parola {
    private String testo;
    
    public Parola(String testo){
        setTesto(testo);
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }
    
    public String stampa(){
        return getTesto();
    }
    
    public int nCaratteri(){
        return testo.length();
    }
}
