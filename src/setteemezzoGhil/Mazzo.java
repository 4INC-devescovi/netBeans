
package setteemezzoGhil;

import java.util.Random;

public class Mazzo {
    
    /*
    enum SemiCarta{
         BASTONI,
         DENARI,
         SPADE,
         COPPE
     }
    */
    
    private int numeroCarte;
    private Carta[] mazzo;
    private final String[] SEMI = {"SPADE","BASTONI","DENARI","COPPE"}; //statico
    private final int CARTE_PER_SEME = 10;
    
    public Mazzo() {
        numeroCarte = SEMI.length*CARTE_PER_SEME;
        mazzo = new Carta[numeroCarte];
        for(int s = 0; s < SEMI.length; s++){
            for(int n = 0; n < CARTE_PER_SEME; n++){
                mazzo[s*10+n]= new Carta(SEMI[s], n+1);
            }
        }
    }
    
    public void mescola(){
        Carta c;
        int cambioPosizione;
        for(int i = 0; i < numeroCarte; i++){
            Random r = new Random();
            c = mazzo[i];
            cambioPosizione = r.nextInt(numeroCarte);
            mazzo[i] = mazzo[cambioPosizione];
            mazzo[cambioPosizione]= c;
        }
    }
    
    public Carta estraiCarta(){
        Carta ritorno = null;
        if(numeroCarte >= 1){
            numeroCarte--;
            ritorno = mazzo[numeroCarte];
        }
        return ritorno;
    }
    
    public int getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(int numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public Carta[] getMazzo() {
        return mazzo;
    }

    public void setMazzo(Carta[] mazzo) {
        this.mazzo = mazzo;
    }

    @Override //
    public String toString() {
        String stampa = "";
        for(int i = 0; i < numeroCarte; i++){
            stampa += mazzo[i].toString()+"\n";
        }
        return stampa;
    }
    
    
}
