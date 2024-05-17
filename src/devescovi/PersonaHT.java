/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devescovi;

/**
 *
 * @author S51VERIFICA09
 */
public class PersonaHT {
    private String nome;
    private String dataDiNascita;

    public PersonaHT(String nome, String dataDiNascita) throws Exception {
        setNome(nome);
        setDataDiNascita(dataDiNascita);
    }

    public final void setNome(String nome) throws Exception {
        nome = nome.trim();
        if(nome.length() < 3)
            throw new Exception("Il nome deve avere almeno tre lettere. ");
        
        if(((Character) nome.charAt(0)).hashCode() < 65 || ((Character) nome.charAt(0)).hashCode() > 90)
            throw new Exception("La prima lettra deve essere maiuscola. ");
        
        for(int i = 1; i < nome.length(); i++)
            if(((Character) nome.charAt(i)).hashCode() < 97 || ((Character) nome.charAt(i)).hashCode() > 122)
                throw new Exception("Deve contenere solo lettere minuscola, tranne la prima che è maiuscola. ");
        
        this.nome = nome;
        
    }

    public final void setDataDiNascita(String dataDiNascita) throws Exception {
        dataDiNascita = dataDiNascita.trim();
        
        if(dataDiNascita.length() < 7 ||dataDiNascita.charAt(2) != '/' || dataDiNascita.charAt(5) != '/')
            throw new Exception("Data inserita non valida (ex: 01/01/2012). ");
        
        this.dataDiNascita = dataDiNascita;
        
    }

    public String getNome() {
        return nome;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    @Override
    public String toString() {
        return nome + " " + dataDiNascita;
    }
    
    
    
    
}
