package prodotto;
public class ProdottoMain {
    public static void main(String[] args) {

        String codice = "8001097150137";
        ProdottoVecchio p = new ProdottoVecchio(10, 4, 15, 6, "Barretta energetica",  codice);

        System.out.println("Prezzo prodotto + iva: " + p.prezzoIvato());
        System.out.println("Peso lordo: " + p.pesoLordo());
        System.out.println("Il codice è corretto: " + p.controlloCodice());
    }
    
}
