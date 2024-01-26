/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esLettura;


/**
 *
 * @author diego
 */
public class PostaElettronica implements LetturaMessaggio{
    
    private String testo;
    private String mittente;
    private String oggetto;

    public PostaElettronica(String testo, String mittente, String oggetto) {
        this.testo = testo;
        this.mittente = mittente;
        this.oggetto = oggetto;
    }

    @Override
    public String getTesto() {
        return testo;
    }
    
    @Override
    public String leggi(){
        return "Il mittente è: " + mittente + "\n"
             + "L'oggetto è: " + oggetto + "\n"
             + getTesto();
    }

    @Override
    public String toString() {
        return "PostaElettronica{" + "mittente=" + mittente + ", oggetto=" + oggetto + '}';
    }
}
