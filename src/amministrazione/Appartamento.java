package amministrazione;
public class Appartamento {
    
    private int numAppartamento;
    private String nominativo;
    private int millesimi;

    public Appartamento(int numAppartamento, String nominativo, int millesimi) {
        this.numAppartamento = numAppartamento;
        this.nominativo = nominativo;
        this.millesimi = millesimi;
    }

    public Appartamento(Appartamento a) {
        this.numAppartamento = a.numAppartamento;
        this.nominativo = a.nominativo;
        this.millesimi = a.millesimi;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public int getNumAppartamento() {
        return numAppartamento;
    }

    public String getNominativo() {
        return nominativo;
    }

    public int getMillesimi() {
        return millesimi;
    }
    
    public String stampa(){
        return "Appartamento:\nNumero appartamento: " + numAppartamento +
               "\nNominativo: " + nominativo + "\nMillesimi: " + millesimi + "\n"; 
    }

    
}
