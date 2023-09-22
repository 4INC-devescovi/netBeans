
package setteemezzoGhil;


public class Giocatore {
    
    private String nome;
    private int saldo;
    private int puntata;
    private Carta[] mano;
    private int nCarteMano;
    
    private final int MAX_CARTE = 16;

    
    public Giocatore(String nome, int saldo) {
        this.puntata = 0;
        this.nome = nome;
        this.saldo = saldo;
        this.nCarteMano = 0;
        this.mano = new Carta[MAX_CARTE];
    }
    
    //overloading firma!=, i param cambiano
    //c di copia
    public Giocatore(Giocatore g) {
        this.puntata = 0;
        this.nome = g.getNome();
        this.saldo = g.getSaldo();
        this.nCarteMano = 0;
        this.mano = new Carta[MAX_CARTE];
    }
    
    /**
     * il metodo prende la puntata del giocatore e controlla se il saldo è sufficiente
     * @param puntata 
     */
    public void partecipa(int puntata){
        if(puntata <= saldo && puntata >=0){
            this.puntata = puntata;
            this.saldo -= puntata;
        }
    }
    
    /**
     * aggiunge una carta alla mano e aumenta la dimensione logica
     * @param carta 
     */
    public void aggiungiCarta(Carta carta){
        mano[nCarteMano] = carta;
        nCarteMano++;
    }
    
    public void modificaSaldo(int punt){
        saldo+= punt;
    }
    
    public void cancellaMano(){
        this.mano = new Carta[MAX_CARTE];
        puntata = 0;
        nCarteMano = 0;
    }
    
    public String getNome() {
        return nome; 
    }

    public int getnCarteMano() {
        return nCarteMano;
    }

    public void setnCarteMano(int nCarteMano) {
        this.nCarteMano = nCarteMano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getPuntata() {
        return puntata;
    }

    public void setPuntata(int puntata) {
        this.puntata = puntata;
    }

    public Carta[] getMano() {
        return mano;
    }

    public void setMano(Carta[] mano) {
        this.mano = mano;
    }
    
    
    
}
