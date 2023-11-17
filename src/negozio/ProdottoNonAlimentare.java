/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negozio;

/**
 *
 * @author rikid
 */
public class ProdottoNonAlimentare extends Prodotto{
    
    private boolean contienePlasitca;
    
    public ProdottoNonAlimentare(double prezzo, double iva, double peso, double tara, String descrizione, String codiceBarre, boolean plastica) {
        super(prezzo, iva, peso, tara, descrizione, codiceBarre);
        contienePlasitca = plastica;
    }
    
    @Override
    public String toString(){
        return "ProdottoNonAlimentare:"
                + "\nContiene plastica: " + contienePlasitca
                + "\n" + super.toString();
    }

    public boolean isContienePlasitca() {
        return contienePlasitca;
    }
}
