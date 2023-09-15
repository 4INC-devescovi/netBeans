/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IstatMatrice;

/**
 *
 * @author rikid
 */
public class Regione {
    private double[] beniP;
    private String[] nomeBeni;
    private String nome;
    
    public Regione(double[] beniP, String[] nomeBeni, String nome){
        this.nome = nome;
        
        this.beniP = new double[beniP.length];
        this.nomeBeni = new String[nomeBeni.length];
        for(int i = 0; i < this.beniP.length; i++){
            this.beniP[i] = beniP[i];
            this.nomeBeni[i] = nomeBeni[i];
        }
        
    }
    
    public String stampa(){
        String t = nome + ":\n";
        for(int i = 0; i < beniP.length; i++)
            t += nomeBeni[i] + ": " + String.format("%.2f",beniP[i]) + "\n";
        return t;
    }
    
    
    public double cercaBeneSpecifico(String nome){
        int indiceBene = 0;
        boolean indiceTrovato = false;
        while(!indiceTrovato){
            if(nome == nomeBeni[indiceBene]){
                indiceTrovato = true;
            }
            else{
                indiceBene++;
            }
        }
        return beniP[indiceBene];
    }
    
    public double prezzoVita(){
        double prezzo = 0;
        for(int i = 0; i < beniP.length; i++)
            prezzo += beniP[i];
        return prezzo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String maxRegione(){
        double maxPrezzo = 0;
        int indice = 0;
        for(int i = 0; i < beniP.length; i++){
            if(maxPrezzo < beniP[i]){
                indice = i;
                maxPrezzo = beniP[i];
            }
        }
        return "\nIl prezzo maggiore della regione " + nome + " è "
                + nomeBeni[indice] + " con un prezzo di " + maxPrezzo + "\n"; 
    }

}
