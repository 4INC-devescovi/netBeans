package supermercato;

import prodotto.Prodotto;

public class Supermercato {
    
    private String nome;
    private String indirizzo;
    private Prodotto[] prodotti;
    private int diml;

    public Supermercato(String nome, String indirizzo, Prodotto[] prodotti) {
        this.nome = nome;
        this.indirizzo  = indirizzo;
        this.prodotti = copia(prodotti, prodotti.length);
        this.diml = prodotti.length;
    }

    private Prodotto[] copia(Prodotto[] prodotti, int lungFisica    ) {
        Prodotto[] temp = new Prodotto[lungFisica];
        for (int i = 0; i < prodotti.length; i++) {
            temp[i] = prodotti[i];
        }
        return temp;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }


    public String prezzoAlto() {
        int prezzoAlto = 0;
        for (int i = 1; i < prodotti.length; i++){
            if (prodotti[prezzoAlto].prezzoIvato() < prodotti[i].prezzoIvato()){
                prezzoAlto = i;
            }
        }
        return prodotti[prezzoAlto].getDescrizione();
    }

    public double valoreMerce() {
        double somma = prodotti[0].getPrezzo();
        for (int i = 1; i < prodotti.length; i++) 
            somma += prodotti[i].getPrezzo();
        return somma;
    }

    public String pesoMinore() {
        int pesoMinore = 0;
        for (int i = 1; i < prodotti.length; i++){
            if (prodotti[pesoMinore].prezzoIvato() > prodotti[i].prezzoIvato()){
                pesoMinore = i;
            }
        }
        return prodotti[pesoMinore].getDescrizione();
    }

    public String sopraValoreMedio() {
        double valoreMedio = valoreMerce()/prodotti.length;
        String prodottiSopraMedia = "";
        for (int i = 0; i < prodotti.length; i++) {
            if (prodotti[i].getPrezzo() > valoreMedio) {
                prodottiSopraMedia += prodotti[i].getDescrizione() + "\n";
            }
        }
        return prodottiSopraMedia;
    }
    
    public void addProd(Prodotto pAdd){
        if(diml == this.prodotti.length)
            prodotti = copia(prodotti, prodotti.length + 10);
        
        prodotti[diml] = pAdd;
        diml++;
    }
    
    public void addProd(double prezzo, double iva, double peso, double tara, String descrizione, String codiceBarre){
        Prodotto p = new Prodotto(prezzo, iva, peso, tara, descrizione, codiceBarre);
        addProd(p);
    }
}
