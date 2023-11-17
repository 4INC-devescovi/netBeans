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
        
        Prodotto[] negozio = {new ProdottoAlimentare(15.0, 0, 13, 11, "Kinder brioches", "8001097150137", 11, 12, 2023),
                              new ProdottoAlimentare(100.0, 0, 13, 11, "Yogurt", "8001097150137", ),
                              new ProdottoAlimentare(100, 0, 13, 11, "Mela", "8001097150137", -1),
                              new ProdottoAlimentare(100, 0, 13, 11, "Mozzarella di bufala", "8001097150137", 1),
                              new ProdottoNonAlimentare(15.0, 0, 13, 11, "Computer", "8001097150137", true),
                              new ProdottoNonAlimentare(15.0, 0, 13, 11, "Computer", "8001097150137", false)
                                };
        
    }
    
}
