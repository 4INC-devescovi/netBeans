/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipiGenerici;

/**
 *
 * @author rikid
 */
public class Persona {
    private String nome;
    private String cognome;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Persona{" + "nome=" + nome + ", cognome=" + cognome + '}';
    }
    
    
}
