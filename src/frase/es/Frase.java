package frase.es;

import java.util.regex.Pattern;

public class Frase {
    
    private Parola[] frase;
    private int diml;
    
    public Frase(String testo){
        String[] frase;
        frase = testo.split(Pattern.quote("$"));
        this.frase = copiaFrase(frase);
        diml = this.frase.length;
    }
    
    private Parola[] copiaFrase(String[] p){
        Parola[] fCopia = new Parola[p.length];
        for(int i = 0; i < p.length; i++){
            fCopia[i].setTesto(p[i]);
        }
        return fCopia;
    }
    public String stampa(){
        String t = "";
        for(int i = 0; i < diml; i++)
            t += frase[i].getTesto() + " ";
        return t;
    }
    public int nParole(){
        return diml;
    }
    public int nCaratteri(){
        int nC = 0;
        for(int i = 0; i < diml-1; i++)
            nC += frase[i].nCaratteri();
        return nC;
    }
    public void inserimento(String parola, int indice){
        Parola[] pCopia = new Parola[frase.length+1];
        for(int i = 0; i < frase.length; i++){
            pCopia[i] = frase[i];
        }
        frase = pCopia;
        shiftDx(indice, diml);
        frase[indice].setTesto(parola);
        diml++;
    }
    private void shiftSx(int posP, int posA) {
        for (int i = posP; i < posA; i++)
            frase[i] = frase[i+1];
    }

    public void spostamento(int posA, int posP){
        String parola = frase[posP].getTesto();
        if (posP < posA){     
            shiftSx(posP,posA);
        }
        else {
            shiftDx(posA, posP); 
        }
        frase[posA].setTesto(parola);

    }
    private void shiftDx(int posP, int posA) {
        for (int i = posA; i > posP; i--)
            frase[i] = frase[i-1];
    }

    
}
