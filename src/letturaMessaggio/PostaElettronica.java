/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package letturaMessaggio;

/**
 *
 * @author riki and jack
 */
public class PostaElettronica extends LetturaMessaggio{
    
    private String mittente;
    private String oggetto;

    public PostaElettronica(String testo, String mittente, String oggetto) {
        super(testo);
        this.mittente = mittente;
        this.oggetto = oggetto;
    }
    
    @Override
    public String leggiTesto(){
        return "Il mittente è: " + mittente + "\n"
             + "L'oggetto è: " + oggetto + "\n"
             + getTesto();
    }

    @Override
    public String toString() {
        return "PostaElettronica{" + "mittente=" + mittente + ", oggetto=" + oggetto + '}';
    }
}
