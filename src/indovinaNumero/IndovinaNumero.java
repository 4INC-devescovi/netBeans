package indovinaNumero;

public class IndovinaNumero {

    private int numPensato;

    public IndovinaNumero(int numPensato) {
        this.numPensato = numPensato;
    }

    public int getNumPensato() {
        return numPensato;
    }

    public void setNumPensato(int n) {
        numPensato = n;
    }

    public String pensa() {
        int num = 0;
        String testo = " ";
        
        num = numPensato + 4;
        num = num * 2;
        num = num + 10;
        num = num - 8;
        num = num / 2;
        num = num - numPensato;

        testo = "il numero pensato è " + numPensato + " e il risultato è "
                + num;

        return testo;

    }

    public String stampa() {
        String s = " ";

        s = "numPensato: " + numPensato;

        return s;
    }

}
