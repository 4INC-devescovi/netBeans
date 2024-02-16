/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package letturaMessaggio;

/**
 *
 * @author riki and jack
 */
public class Ebook implements LetturaMessaggio{
    
    private String pagine[];
    private String nomeLibro;
    private int totPagine;
    
    public Ebook(String testo, String nomeLIbro, int totPagine){
        this.testo=testo;
        this.nomeLibro = nomeLibro;
        this.totPagine = totPagine;
    }

    public String getTesto() {
        return testo;
    }
    
     
    
    @Override
    public String leggiTesto(){
        return "Il nome del libro è: " + nomeLibro + "\n"
             + "Le pagine totali sono: " + totPagine + "\n"
             + getTesto(); 
    }

    @Override
    public String toString() {
        return "Ebook{" + "nomeLibro=" + nomeLibro + ", totPagine=" + totPagine + super.toString() + '}';
    }
    
    
}
