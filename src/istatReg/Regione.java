package istatReg;
public class Regione {
    private String nome;
    private double pane;
    private double latte;

    public Regione(String nome, double pane, double latte) {
        this.nome = nome;
        this.pane = pane;
        this.latte = latte;
    }
    
    public String stampa(){
        return "Nome: " + nome + "\nPane: " + String.format("%.2f",pane) + "\nLatte: " + String.format("%.2f",latte);
    }
    
    public String getNome() {
        return nome;
    }

    public double getPane() {
        return pane;
    }

    public double getLatte() {
        return latte;
    }
    
    
}
