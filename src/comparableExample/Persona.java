package comparableExample;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rikid indicare quali metodi vengono usati sia in fase di compilazione che in fase di esecuzionele
 */
public class Persona implements Comparable<Persona>{
    private String cognome;
    private String nome;
    
    public Persona(String nome, String cognome){
        this.cognome = cognome;
        this.nome = nome;
    }

    @Override
    public int compareTo(Persona o) {
        if(cognome.compareTo(o.cognome))
        return cognome.compareTo(o.cognome);
    }

    @Override
    public String toString() {
        return "Persona{" + "cognome=" + cognome + ", nome=" + nome + '}';
    }
    
    
    
}
