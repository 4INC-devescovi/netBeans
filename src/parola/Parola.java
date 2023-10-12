package parola;
public class Parola {
    
    private Lettera[] lettere;
    
    public Parola(String p){
        lettere = new Lettera[p.length()];
        for(int i = 0; i < lettere.length; i++)
            lettere[i] = new Lettera(p.charAt(i));
    }
    
    public int punteggioTot(){
        int ris = 0;
        for(int i = 0; i < lettere.length; i++)
            ris += lettere[i].getPunteggio();
        return ris;
    }
    
    public String stampa(){
        String t = "Parola:";
        for(int i = 0; i < lettere.length; i++)
            t += "\n\nparola[" + i + "]:\n" + lettere[i].stampa();
        return t;
    }
}
