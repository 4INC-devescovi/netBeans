/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devescovi1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author S51VERIFICA09
 */
public class PersonaHT {
    private String nome;    
    private String dataDiNascita; 

    public PersonaHT(String nome, String dataDiNascita) throws Exception  {                        
        setNome(nome);
        setDataDiNascita(dataDiNascita);                             
    }
    
    public PersonaHT(PersonaHT persona) {                
        this.nome = persona.nome;        
        this.dataDiNascita = persona.dataDiNascita;
    }        
    
    public String getNome() {
        return this.nome;
    }

    final public void setNome(String nome) throws Exception {
        try {
            if (nome.matches("[A-Z][a-z]{2,}"))
                this.nome = nome;
            else 
                throw new Exception("L'attributo nome non rispetta i criteri richiesti!");            
        } catch (NullPointerException e) {
            throw new Exception("L'attributo nome non può essere nullo!");
        }
    }    

    public String getDataDiNascita() {
        return this.dataDiNascita;
    }
    
    final public void setDataDiNascita(String dataDiNascita) throws Exception {        
        String annoDiNascitaString, meseDiNascitaString, giornoDiNascitaString;
        Integer annoDiNascita, meseDiNascita, giornoDiNascita;

        try {
            giornoDiNascitaString = dataDiNascita.substring(0, 2);
            meseDiNascitaString = dataDiNascita.substring(3, 5);
            annoDiNascitaString = dataDiNascita.substring(6, 10);

            giornoDiNascita = Integer.parseInt(giornoDiNascitaString);
            meseDiNascita = Integer.parseInt(meseDiNascitaString);
            annoDiNascita = Integer.parseInt(annoDiNascitaString);
            
            LocalDate localDate = LocalDate.of(annoDiNascita, meseDiNascita, giornoDiNascita);
            
            LocalDate dataAttuale = LocalDate.now();
                        
            if(!Period.between(localDate, dataAttuale).isNegative()){
            
                this.dataDiNascita = dataDiNascita;               
            }else
                throw new Exception("La data di nascita non può essere maggiore di quella attuale!");            
        } catch (StringIndexOutOfBoundsException | NumberFormatException e) {
            throw new Exception("La data non rispetta il formato GG/MM/AAAA!");
        } catch (NullPointerException e) {
            throw new Exception("L'attributo data non può essere nullo!");
        } catch (Exception e) {
            throw new Exception("Data non valida!");
        }
    }
    
    @Override
    public String toString() {
        return nome + " " + dataDiNascita;
    }  
    
    
    
    
}