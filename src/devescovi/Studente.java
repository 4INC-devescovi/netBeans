/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devescovi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rikid
 */
public class Studente extends Persona{
    
    private final String SCUOLA = "I.T.T Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private ArrayList<Float> voti;
    
    public Studente(){
        super();
        voti = new ArrayList<>();
    }
    
    public Studente(Integer classe, Boolean isRipetente, String cognome, String nome, Data dataDiNascita)throws Exception{
        super.setCognome(cognome);
        super.setNome(nome);
        super.setData(dataDiNascita);
        setClasse(classe);
        setIsRipetente(isRipetente);
        voti = new ArrayList<>();
    }
    
    public final void setClasse(Integer classe)throws Exception{
        if(classe != null) {
            if(classe >= 1 && classe <= 5){
                this.classe = classe;
            } else {
                throw new Exception("La classe deve essere compresa tra 1 e 5. ");
            }
        } else {
            throw new Exception("La classe non può essere vuota. ");
        }
    }
    
    public final void setIsRipetente(Boolean isRipetente)throws Exception{
        if(isRipetente != null){
            this.isRipetente = isRipetente;
        } else {
            throw new Exception("Devi specificare se lo studente è ripetente. ");
        }
    }
    
    public Boolean verificaOmonimia(Studente studente)throws Exception{
        Boolean b;
        if(studente != null){
            if(studente.classe == classe){
                b = (studente.getCognome().equals(super.getCognome()) && studente.getNome().equals(super.getNome()));
            } else {
                throw new Exception("Lo studente deve esistere. ");
            }
        } else {
            throw new Exception("Lo studente deve esistere. ");
        }
        return b;
    }
    
    public Boolean promuovi(){
        Boolean b = (classe < 5);
        classe++;
        return b;
    }
    
    public Boolean promuovi(Integer numeroClassi)throws Exception{
        if(numeroClassi == null)
            throw new Exception("La classe deve esistere. ");
        Boolean b = (numeroClassi + classe <= 5);
        classe += numeroClassi;
        return b;
    }
    
    @Override
    public String info()throws Exception{
        if(super.getCognome() == null || super.getNome() == null || super.getDataDiNascita() == null || classe == null || isRipetente == null){
            throw new Exception("Tutti gli attributi devono essere istanziati. ");
        }
        String s = "nessun voto presente";
        if(voti.size() > 0){
            s = "[" + voti.get(0);
            for(int i = 1; i < voti.size(); i++)
                s += ", " + voti.get(i);
            s += "]";
        }
        return "Scuola:          " + SCUOLA + "\n"
             + "Classe:          " + classe + "\n"
             + super.info() + "\n"
             + "Ripetente:       " + (isRipetente ? "si" : "no") + "\n"
             + "Voti:            " + s;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + getNome().hashCode();
        hash = 83 * hash + getCognome().hashCode();
        return hash;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final classe.Studente other = (classe.Studente) obj;
        if (!this.getNome().equals(other.getNome())) {
            return false;
        }
        return this.getCognome().equals(other.getCognome());
    }

    
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); 
    }

    @Override
    protected classe.Studente clone() throws CloneNotSupportedException {
        return (classe.Studente) super.clone();
    } 
    
    public void aggiungiVoto(Float voto)throws Exception{
        if(voto != null){
            if(voto >= 0 && voto <= 10){
               this.voti.add(voto);
            } else {
                throw new Exception("Il voto deve essere compreso tra 0 e 10. ");
            }
        } else {
            throw new Exception("Il voto deve esistere. ");
        }
    }
    
    public void rimuoviUltimoVoto(){
        if(voti.size() > 0)
            voti.remove(voti.size()-1);
    }
    
    public void rimuoviVoto(Integer posizione)throws Exception{
        if(posizione != null){
            if(posizione >= 0 && posizione < voti.size()){
                voti.remove(posizione);
            } else {
                throw new Exception("La posizione non è accettabile perché o minore di 0 o maggiore della lunghezza dell'array. ");
            }
        } else {
            throw new Exception("La posizione deve esistere. ");
        }
    }
    
    public void rimuoviVoto(Float voto)throws Exception{
        if(voto != null){
            if(voto >= 0 && voto <= 10){
                int i = 0;
                while(i < voti.size()){
                    if(voti.get(i) == voto){
                        voti.remove(i);
                        i = voti.size();
                    }
                    i++;
                }
                
            } else {
                throw new Exception("La posizione non è accettabile perché o minore di 0 o maggiore della lunghezza dell'array. ");
            }
        } else {
            throw new Exception("La posizione deve esistere. ");
        }
    }
    
    public Float votoMinore() throws Exception{
        Float voto = 11f;
        if(voti.size() > 0){
            for(int i = 0; i < voti.size(); i++)
                voto = (voto > voti.get(i)) ? voti.get(i) : voto;
        } else{
            throw new Exception("Non è presente nessun voto. ");
        }
        
        return voto;
    }
    
    public Float votoMaggiore() throws Exception{
        Float voto = -1f;
        if(voti.size() > 0){
            for(int i = 0; i < voti.size(); i++)
                voto = (voto < voti.get(i)) ? voti.get(i) : voto;
        } else{
            throw new Exception("Non è presente nessun voto. ");
        }
        
        return voto;
    }
    
    public Float mediaVoti() throws Exception{
        Float votoMedia = 0f;
        if(voti.size() > 0){
            for(int i = 0; i < voti.size(); i++)
                votoMedia += voti.get(i);
        } else {
            throw new Exception("Non è presente nessun voto. ");
        }
        return votoMedia/voti.size();
    }
    
    public void ordinaVotoCrescente() throws Exception{
        if(voti.size() > 0){
            Collections.sort(voti);
        } else {
            throw new Exception("Non è presente nessun voto. ");
        }
    }
    
    public void ordinaVotoDecrescente() throws Exception{
        if(voti.size() > 0){
            Collections.sort(voti, Collections.reverseOrder());
        } else {
            throw new Exception("Non è presente nessun voto. ");
        }
    }
}
