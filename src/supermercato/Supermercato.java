package supermercato;
import prodotto.ProdottoVecchio;

public class Supermercato {
    
    private String nome;
    private String indirizzo;
    private ProdottoVecchio[] prodotti;
    private int diml;

    public Supermercato(String nome, String indirizzo, ProdottoVecchio[] prodotti) {
        this.nome = nome;
        this.indirizzo  = indirizzo;
        this.prodotti = copia(prodotti, 0);
        this.diml = prodotti.length;
    }
    
    public Supermercato(Supermercato sup){
        this.nome = sup.nome;
        this.indirizzo = sup.indirizzo;
        this.prodotti = copia(sup.prodotti, 0);
        this.diml = sup.prodotti.length;
    }

    private ProdottoVecchio[] copia(ProdottoVecchio[] prodotti, int lungFisica) {
        ProdottoVecchio[] temp = new ProdottoVecchio[prodotti.length + lungFisica];
        for (int i = 0; i < prodotti.length; i++) {
            temp[i] = new ProdottoVecchio(prodotti[i]);
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
        for (int i = 1; i < diml; i++){
            if (prodotti[prezzoAlto].prezzoIvato() < prodotti[i].prezzoIvato()){
                prezzoAlto = i;
            }
        }
        return prodotti[prezzoAlto].getDescrizione();
    }

    public double valoreMerce() {
        double somma = prodotti[0].getPrezzo();
        for (int i = 1; i < diml; i++) 
            somma += prodotti[i].getPrezzo();
        return somma;
    }

    public String pesoMinore() {
        int pesoMinore = 0;
        for (int i = 1; i < diml; i++){
            if (prodotti[pesoMinore].prezzoIvato() > prodotti[i].prezzoIvato()){
                pesoMinore = i;
            }
        }
        return prodotti[pesoMinore].getDescrizione();
    }

    public String sopraValoreMedio() {
        double valoreMedio = valoreMerce()/diml;
        String prodottiSopraMedia = "";
        for (int i = 0; i < diml; i++) {
            if (prodotti[i].getPrezzo() > valoreMedio) {
                prodottiSopraMedia += prodotti[i].getDescrizione() + "\n";
            }
        }
        return prodottiSopraMedia;
    }
    
    public void addProd(ProdottoVecchio pAdd){
        if(diml == this.prodotti.length)
            prodotti = copia(prodotti, (prodotti.length*20)/100);
        
        ProdottoVecchio pAddCopia = new ProdottoVecchio (pAdd);
        prodotti[diml] = pAddCopia;
        diml++;
    }
    
    public void addProd(double prezzo, double iva, double peso, double tara, String descrizione, String codiceBarre){
        ProdottoVecchio p = new ProdottoVecchio(prezzo, iva, peso, tara, descrizione, codiceBarre);
        addProd(p);
    }
    
    private void shiftSx(ProdottoVecchio[] p, int ind, int diml){
        for(int i = ind; i < diml; i++)
            p[i] = p[i-1];
    }   
    public void remProd(String descr){
        int indice = 0;
        while(!prodotti[indice].getDescrizione().equals(descr))
            indice++;
        shiftSx(prodotti, indice, diml);
        diml--;
    }
}
