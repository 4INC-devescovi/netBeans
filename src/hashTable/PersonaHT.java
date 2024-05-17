package adt.hashTable;

import java.time.*;

public class PersonaHT {    
    private String nome;    
    private String dataDiNascita; 

    public PersonaHT(String nome, String dataDiNascita) throws Exception  {                        
        this.setNome(nome);
        this.setDataDiNascita(dataDiNascita);                             
    }
    
    public PersonaHT(PersonaHT persona) {                
        this.nome          = persona.nome;        
        this.dataDiNascita = persona.dataDiNascita;
    }        
    
    public String getNome() {
        return this.nome;
    }

    final public void setNome(String nome) throws Exception {
        /*Boolean valida = false;
        int cont = 0;*/
        
        try {
            /*if (nome.length() >= 3) {
                for (int i = 65; i <= 90; i++)
                    if (nome.charAt(0) == (char)i)
                        valida = true;
            
                for (int i = 1; i < nome.length(); i++)
                    for (int j = 97; j <= 122; j++)
                        if (nome.charAt(i) == (char)j)
                            cont++;                        
            }   
                               
            if (valida && cont == nome.length()-1)
                this.nome = nome;*/
            
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
        String info;

        info = nome + " " + dataDiNascita;

        return info;
    }      
    
    public static void main(String[] args) throws Exception {
        PersonaHT p = new PersonaHT("Nome", "29/02/2024");
        
        System.out.println(p.toString());
    }
}
