package numero;

public class Numero {

    private int valore;
    
    
    public Numero(int valore) {
        setValore(valore);
    }

    public final void setValore(int v) {
        if(v>=0){
            valore = v;
        }
    }

    public int getValore() {
        return valore;
    }

    public String somma(int num1) {
        String t = "La somma è: " + (valore + num1);
        return t;
    }

    public String compareInt(int num2) {
        String t = "";
        if (valore > num2) {
            t = valore + " è maggiore di " + num2;
        } else {
            if (valore < num2) {
                t = valore + " è minore di " + num2;
            } else {
                t = "I due valori sono uguali";
            }
        }
        return t;
    }

    public boolean pariDispari() {
        boolean pari = false;
        if (valore % 2 == 0) {
            pari = true;
        }
        return pari;
    }

    public boolean isNegativo() {
        boolean neg = false;
        if (valore < 0) {
            neg = true;
        }
        return neg;
    }

    public String moltiplicazionePerSomma(int molt) {  // molt = moltiplicatore
        int risultato = 0;

        while (molt * valore != risultato) {
            risultato += valore;
        }
        return "Il risultato della moltiplicazione è: " + risultato;
    }

    public String tabellina() {
        int c = 10;
        int somma = 0;
        String testo = "";
        while (c > 0) {
            somma += valore;
            testo += somma + " ";
            c--;
        }
        return testo;
    }
    public String sequenzaFibonacci() {
        String t = "Sequenza di fibonacci: ";
        int cont = valore;
        int n1 = 1;
        int n2 = 0;
        int seq = 0;

        while (cont > 0) {
            seq = n1 + n2;
            n1 = n2;
            n2 = seq;
            t += seq + " ";
            cont--;
        }
        return t;
    }
    public Numero fattoriale(){
        int cont = valore;
        int fatt = 1;
        while(cont > 0){
            fatt*= cont;
            cont--;
        }
       Numero num = new Numero(fatt);
       return num;
    }
    public String binario(){
        int n = valore;
        String t = "";
        while(n > 0){
            t = (n%2) + t;
            n/=2;
        }
        return t;
    }
    
}
