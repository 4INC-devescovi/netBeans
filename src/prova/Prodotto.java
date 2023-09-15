package prova;
public class Prodotto {
    private double prezzo;
    private double iva;
    private double peso;
    private double tara;
    private String descrizione;
    private String codiceBarre;
    
    public Prodotto (double prezzo, double iva, double peso, double tara, String descrizione, String codiceBarre){
        this.prezzo = prezzo;
        this.iva = iva;
        this.peso = peso;
        this.tara = tara;
        this.descrizione = descrizione;
        this.codiceBarre = codiceBarre;
    }
    
    public double prezzoIvato (){
        return prezzo + (prezzo * (iva/100));
    }
    
    public double pesoLordo(){
        return peso + tara;
    }
    
    public String controlloCodice(){
        String controllo = "";
        int somma = 0;
        int resto = 0;
        
        if (codiceBarre.length() != 13){
            controllo = "il codice a barre non e' uguale a 13";
        }else{
             for (int i = 0; i < 12; i++) {
            int cifra = codiceBarre.charAt(i)-'0';
            if (i % 2 == 0) { 
                somma += cifra * 3;
            } else { 
                somma += cifra;
            }
        }
            resto = somma%10;
            
            if (resto == codiceBarre.charAt(12)-'0'){
                controllo = "il controllo e' avvenuto con successo e l'ultimo numero risulta uguale a: " + resto;
            }else{
                controllo = "il controllo non è andato a buon fine perche' il resto: "+resto+" e' diverso dall'ultima cifra del codice "+ codiceBarre.charAt(12);
            }
        }
        return controllo;
    }

}
