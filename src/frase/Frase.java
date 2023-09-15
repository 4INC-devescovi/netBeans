package frase;
public class Frase {
    private String[] parole;
    private int diml;

    public Frase(String[] parole) {
        this.parole = copiaArr(parole);
        diml = this.parole.length;
    }
    
    private String[] copiaArr(String[] p){
        String[] pCopia = new String[p.length];
        for(int i = 0; i < p.length; i++){
            pCopia[i] = p[i];
        }
        return pCopia;
    }
    
    private boolean controlloIndice (int indice) {
        return indice >=0 && indice < parole.length;
    }
    
    private boolean shiftDx(int pos){
        boolean ris = controlloIndice(pos);
        if (ris) {
            
            for (int i = diml; i > pos; i--)
                parole[i] = parole[i-1];
        }
        return ris;
    }
    private boolean shiftSx(int pos){
        boolean ris = controlloIndice(pos);
        if(ris){
           for (int i = pos; i < diml-1; i++)
               parole[i] = parole[i+1];
        }
        return ris;
    }

    public String[] getParole() {
        return copiaArr(parole);
    }
    public String stampa(){
        String t = "";
        for(int i = 0; i < diml; i++)
            t += parole[i] + " ";
        return t;
    }
    public int nParole(){
        return diml;
    }
    public int nCaratteri(){
        int nC = 0;
        for(int i = 0; i < diml-1; i++)
            nC += parole[i].length();
        return nC;
    }
    public boolean inserimento(String parola, int indice){
        boolean ris = controlloIndice(indice);
        if(ris){
            String[] pCopia = new String[parole.length+1];
            for(int i = 0; i < parole.length; i++){
                pCopia[i] = parole[i];
            }
            parole = pCopia;
            shiftDx(indice);
            parole[indice] = parola;
            diml++;
        }
        return ris;
    }
    public boolean cancellazione(int indice){
        boolean ris = controlloIndice(indice);
        if(indice < parole.length && indice >= 0){
            shiftSx(indice);
            diml--;
        }
        return ris;
    }
    public boolean spostamento(int posA, int posP){
        boolean ris = controlloIndice(posA) && controlloIndice(posP);
        
        if(ris){
            String parola = parole[posA];
            cancellazione(posA);
            inserimento(parola, posP);
            }
        return ris;
        }
        
    }


