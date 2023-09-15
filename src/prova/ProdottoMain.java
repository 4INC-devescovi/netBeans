package prova;
public class ProdottoMain {

    public static void main(String[] args) {
        Prodotto a1 = new Prodotto (100.0, 22.0, 8.0, 2.0, "pasta", "9788897192008");
        
        System.out.println(a1.controlloCodice());
    }    
}
