/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esLettura;


/**
 *
 * @author diego
 */
public class Ebook implements LetturaMessaggio{
    
    private String testo;
    private String enomeLibro;
    private int numPagine;
    
    public Ebook(String testo, String enomeLIbro, int numPagine){
        this.testo=testo;
        this.enomeLibro = enomeLibro;
        this.numPagine = numPagine;
    }

    @Override
    public String getTesto() {
        return testo;
    }
    
     
    
    @Override
    public String leggi(){
        return "Il nome del libro è: " + enomeLibro + "\n"
             + "Le pagine totali sono: " + numPagine + "\n"
             + getTesto(); 
    }

    @Override
    public String toString() {
        return "Ebook{" + "nomeLibro=" + enomeLibro + ", totPagine=" + numPagine + super.toString() + '}';
    }
    
    
    
    
}
