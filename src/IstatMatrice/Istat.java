/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IstatMatrice;

/**
 *
 * @author rikid
 */
public class Istat {
    private Regione[] regioni;
    
    public Istat(double[][] prezzoBeni, String[] nomiBeni, String[] nomiReg){
        regioni = new Regione[nomiReg.length];
        
        for(int i = 0; i < regioni.length; i++)
            regioni[i] = new Regione(prezzoBeni[i], nomiBeni, nomiReg[i]);
    }
    
    public String stampa(){
        String t = "\n";
        for(int i = 0; i < regioni.length; i++)
            t += regioni[i].stampa() + "\n";
        return t;
    }
    
    public String vitaMax(){
        double vitaMax = 0;
        int indice = 0;
        for(int i = 0; i < regioni.length; i++){
            if(vitaMax < regioni[i].prezzoVita()){
                vitaMax = regioni[i].prezzoVita();
                indice = i;          
            }
        }
        
        return "La regione con il prezzo di vita più alto è " + regioni[indice].getNome()
                + " con un prezzo di " + String.format("%.2f", vitaMax);
        
    }
    
    public String beneMaxPrezzoRegioni(String nomeBene){ //ritorna la regione che ha il prezzo maggiore di un bene
        double beneMax = 0;
        int indice = 0;
        for(int i = 0; i < regioni.length; i++){
            if(beneMax < regioni[i].cercaBeneSpecifico(nomeBene)){
                beneMax = regioni[i].cercaBeneSpecifico(nomeBene);
                indice = i;          
            }
        }
        
        return "La regione con il prezzo di "+ nomeBene + " più alto è "
                + regioni[indice].getNome() + " con un prezzo di " + String.format("%.2f", beneMax);
    }
    
    public String beneMaxRegione(int indice){
        return regioni[indice].maxRegione();
    }   

}
