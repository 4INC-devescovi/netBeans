/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devescovi;
/**
 *
 * @author S51VERIFICA24
 */
public class Studente extends Persona{
    
    private final String SCUOLA = "I.T.T Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private Float[] voti;
    
    public Studente(){
        super();
        voti = new Float[0];
    }
    
    public Studente(Integer classe, Boolean isRipetente, String cognome, String nome, Data dataDiNascita)throws Exception{
        super.setCognome(cognome);
        super.setNome(nome);
        super.setData(dataDiNascita);
        setClasse(classe);
        setIsRipetente(isRipetente);
        voti = new Float[0];
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
    
    public void aggiungiVoto(Float voto)throws Exception{
        if(voto != null){
            if(voto >= 0 && voto <= 10){
                Float[] votiCopia = new Float[voti.length + 1];
                for(int i = 0; i < voti.length; i++){
                    votiCopia[i] = voti[i];
                }
                votiCopia[voti.length] = voto;
                voti = votiCopia;
            } else {
                throw new Exception("Il voto deve essere compreso tra 0 e 10. ");
            }
        } else {
            throw new Exception("Il voto deve esistere. ");
        }
    }
    
    public void rimuoviVoto(Integer posizione)throws Exception{
        if(posizione != null){
            if(posizione >= 0 && posizione < voti.length){
                Float[] votiCopia = new Float[voti.length - 1];
                for(int i = 0; i < posizione; i++){
                    votiCopia[i] = voti[i];
                }
                for(int i = posizione++; i < voti.length; i++){
                    votiCopia[i - 1] = voti[i];
                }
                voti = votiCopia;
            } else {
                throw new Exception("La posizione non è accettabile perché o minore di 0 o maggiore della lunghezza dell'array. ");
            }
        } else {
            throw new Exception("La posizione deve esistere. ");
        }
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
        if(voti.length > 0){
            s = "[" + voti[0];
            for(int i = 1; i < voti.length; i++)
                s += ", " + voti[i];
            s += "]";
        }
        return "Scuola:          " + SCUOLA + "\n"
             + "Classe:          " + classe + "\n"
             + super.info() + "\n"
             + "Ripetente:       " + (isRipetente ? "si" : "no") + "\n"
             + "Voti:            " + s;
    }
    
    
}
