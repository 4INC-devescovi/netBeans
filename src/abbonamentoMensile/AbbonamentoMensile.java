package abbonamentoMensile;

public class AbbonamentoMensile {

    private String nMese;

    public AbbonamentoMensile(String nMese) {
        this.nMese = nMese;
    }

    public String getNMese() {
        return nMese;
    }

    public void setNMese(String nM) {
        nMese = nM;
    }

    public String stampa() {
        String s;
        s = nMese;
        return s;
    }

    public String calcolaCosto(String nome, int eta, boolean gen) {
        double costo = 0;

        if (gen == true && eta > 10 && eta < 31 || gen == false && eta > 14
                && eta < 31) {
            costo = 10;
        }
        if (gen == true && eta > 30 && eta < 75 || gen == false && eta > 30
                && eta < 70) {
            costo = 18.50;
        }

        return "Nominativo: " + nome + "\n" + "Maschio(T/F): " + gen + "\n"
                + "Età: " + eta + "\n" + nMese + ": Costo abbonamento di "
                + nome + ": " + costo + "\n";
    }
}
