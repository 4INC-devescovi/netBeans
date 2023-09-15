package istatReg;
public class Istat {
    private Regione[] regioni;
    
    public Istat(String[] nome, double[] pane, double[] latte){
        regioni = new Regione[nome.length];
        for(int i = 0; i < nome.length; i++)
            regioni[i] = new Regione(nome[i], pane[i], latte[i]);
    }
    
    public String stampa(){
        String t = "";
        for(int i = 0; i < regioni.length; i++)
            t += "Regioni[" + i + "]:\n" + regioni[i].stampa() + "\n\n";
        return t;
    }
    public String maggiore(){
        double posPaneMagg = regioni[0].getPane();
        double posLatteMagg = regioni[0].getLatte();
        String risLatte = "";
        String risPane = "";
        for(int i = 1; i < regioni.length; i++){
            
            String nome = regioni[i].getNome();
            
            if(posLatteMagg < regioni[i].getLatte()){
                posLatteMagg = regioni[i].getLatte();
                risLatte = nome + " - latte: " + String.format("%.2f",posLatteMagg);
            }
            else if(posLatteMagg == regioni[i].getLatte()){
                risLatte += "\n" + nome + " - latte: " + String.format("%.2f",posLatteMagg);
            }
            if(posPaneMagg < regioni[i].getPane()){
                posPaneMagg = regioni[i].getPane();
                risPane = nome + " - latte: " + String.format("%.2f",posPaneMagg);
            }
            else if(posPaneMagg == regioni[i].getPane()){
                risPane += "\n" + nome + " - latte: " + String.format("%.2f",posPaneMagg);
            }
        }
        return risLatte + "\n" + risPane;
    }
}
