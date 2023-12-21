package devescovi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S51VERIFICA24
 */
public class Persona {
    
    private String cognome;
    private String nome;
    private Data dataDiNascita;
    protected static int numeroIstanze;
    
    public Persona(){
        numeroIstanze++;
    }

    public Persona(String cognome, String nome, Data dataDiNascita) throws Exception{
        setCognome(cognome);
        setNome(nome);
        this.dataDiNascita = new Data(dataDiNascita);
    }
    
    public final void setCognome(String cognome)throws Exception{
        controlloNominativi(cognome);
        this.cognome = cognome;
    }
    
    public final void setNome(String nome)throws Exception{
        controlloNominativi(nome);
        this.nome = nome;
    }
    
    public void setData(Integer giorno, Integer mese, Integer anno)throws Exception{
        dataDiNascita = new Data();
        dataDiNascita.setGiorno(giorno);
        dataDiNascita.setMese(mese);
        dataDiNascita.setAnno(anno);
    }
    
    public void setData(Data data)throws Exception{
        dataDiNascita = new Data(data);
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Data getDataDiNascita() {
        return dataDiNascita;
    }
    
    
    
    
    
    public Boolean verificaOmonomia(Persona persona)throws Exception{
        Boolean b;
        if(persona != null){
            b = (cognome.equals(persona.cognome) && nome.equals(persona.nome));
        } else {
            throw new Exception("La persona deve esistere. ");
        }
        return b;
    }
    
    public Long calcolaEta()throws Exception{
        Data dataAttuale = new Data();
        Long i = Data.differenzaInAnni(dataDiNascita, dataAttuale);
        return i;
    }
    
    public String info()throws Exception{
        if(cognome == null || nome == null || dataDiNascita == null){
            throw new Exception("Tutti gli attributi devono essere istanziati. ");
        }
        return "Cognome:         " + cognome + "\n"
             + "Nome:            " + nome + "\n"
             + "Data di nascita: " + dataDiNascita.toString();
    }
    
    private void controlloNominativi(String nominativo)throws Exception{
        if(nominativo != null){
            if(!nominativo.isEmpty()){
                if(Character.isLetter(nominativo.charAt(0)) && Character.isUpperCase(nominativo.charAt(0))){
                    for(int i = 1; i < nominativo.length(); i++){
                        if(!Character.isLetter(nominativo.charAt(i)) && !Character.isLowerCase(nominativo.charAt(i))){
                            throw new Exception("Solo la prima lettera può essere maiuscola e non ci devono essere presenti numeri");
                        }
                    }
                }else{
                    throw new Exception("La prima lettera deve essere maiuscola e non può essere un numero. ");
                }
            }else{
                throw new Exception("Non può essere vuoto. ");
            }
        }else{
            throw new Exception("Non può essere null. ");
        }
    }
}
