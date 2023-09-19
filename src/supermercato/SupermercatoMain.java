package supermercato;
import prodotto.Prodotto;
public class SupermercatoMain {

    public static void main(String[] args) {
        String[] codici = {"8001097150137", "8001097210084", "7332577849038", "4719072965440"};
        double[] prezzi = {8, 10, 29.99, 300};
        double[] pesi = {4.3, 5.2, 147, 1500};
        double[] tare = {1.1, 0.5, 15, 400};
        String[] descrizioni = {"carte briscola", "carte ramino", "cuffie", "scheda video"};
        double[] iva = {7.4, 4, 5.5, 3};




        Prodotto[] p = new Prodotto[4];

        for (int i = 0; i < 4; i++){
            p[i] = new Prodotto(prezzi[i], iva[i], pesi[i], tare[i], descrizioni[i], codici[i]);
        }

        Supermercato s = new Supermercato("Coop", "Viale IV Novembre 53", p);

        System.out.println(s.prezzoAlto());
        System.out.println(s.pesoMinore());
        System.out.println(s.valoreMerce());
        System.out.println(s.sopraValoreMedio());
        
        String codice = "1234567891235";
        double prezzo = 45;
        double peso = 34;
        double tara = 20;
        String descrizione = "action figure";
        double iva2 = 10.99;
        s.addProd(prezzo, iva2, peso, tara, descrizione, codice);
        codice = "1234567891235";
        prezzo = 5;
        peso = 5;
        tara = 140;
        descrizione = "iphone";
        iva2 = 399;
        Prodotto p1 = new Prodotto(prezzo, iva2, peso, tara, descrizione, codice);
        
    }   
}
