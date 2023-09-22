
package setteemezzoGhil;

public class Mazziere {
    private String nome;
    private Carta[] mano;
    private int saldoCasino;
    private Mazzo mazzo;

    private int nCarteMano;
    private final int MAX_CARTE = 16;

    
    public Mazziere(String nome) {
        this.mano = new Carta[MAX_CARTE];
        this.mazzo = new Mazzo();
        this.nome = nome;
        this.saldoCasino = 0;
        nCarteMano = 0;
    }

    public Mazzo getMazzo() {
        return mazzo;
    }
    
    public Carta pesca(){
       return mazzo.estraiCarta();
    }
    
    public void pescaMazziere(){
        mano[nCarteMano] = pesca();
        nCarteMano++;
    }
    
    public void cancellaMano(){
        this.mano = new Carta[MAX_CARTE];
        nCarteMano = 0;
    }
    
    public void cancellaMazzo(){
        this.mazzo = new Mazzo();
    }
    
    public void aggiornaSaldo(int vincita){
        this.saldoCasino += vincita;
    }
    
    public String getNome() {
        return nome;
    }

    public Carta[] getMano() {
        return mano;
    }

    public int getSaldoCasino() {
        return saldoCasino;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldoCasino(int saldoCasino) {
        this.saldoCasino = saldoCasino;
    }
    
    public int getnCarteMano() {
        return nCarteMano;
    }

    public void setnCarteMano(int nCarteMano) {
        this.nCarteMano = nCarteMano;
    }
}
