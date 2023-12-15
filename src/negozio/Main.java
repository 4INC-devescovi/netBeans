/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negozio;

/**
 *
 * @author rikid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProdottoAlimentare pA1 = new ProdottoAlimentare(15.0, 0, 13, 11, "Kinder brioches", "8001097150137", 11, 12, 2023);
        ProdottoAlimentare pA2 = new ProdottoAlimentare(100.0, 0, 13, 11, "Yogurt", "8001097150137", 26, 11, 2023);
        ProdottoAlimentare pA3 = new ProdottoAlimentare(100, 0, 13, 11, "Mela", "8001097150137", 20, 11, 2023);
        ProdottoAlimentare pA4 = new ProdottoAlimentare(100, 0, 13, 11, "Mozzarella di bufala", "8001097150137", 18, 11, 2023);
        
        ProdottoNonAlimentare pNA1 = new ProdottoNonAlimentare(15.0, 0, 13, 11, "Computer", "8001097150137", true);
        ProdottoNonAlimentare pNA2 = new ProdottoNonAlimentare(15.0, 0, 13, 11, "Computer", "8001097150137", false);
        
        Prodotto[] negozio = {pA1, pA2, pA3, pA4, pNA1, pNA2};
        
        negozio[0].toString();
        
        ((ProdottoAlimentare)negozio[0]).getAnnoScadenza();
        if((ProdottoAlimentare)negozio[1])
        
    }
    
}
