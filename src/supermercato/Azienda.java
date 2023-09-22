package supermercato;
import prodotto.Prodotto;
public class Azienda {
    private String nomeGruppo;
    private String sedeLegale;
    private Supermercato[] supermercati;

    public Azienda(String nomeGruppo, String sedeLegale, Supermercato[] supermercati) {
        this.nomeGruppo = nomeGruppo;
        this.sedeLegale = sedeLegale;
        this.supermercati = supermercati;
    }
    
    private Supermercato[] copia(Supermercato[] arrayCopia){
        Supermercato[] temp = new Supermercato[arrayCopia.length];
        for(int i = 0; i < arrayCopia.length; i++)
            temp[i] = arrayCopia[i];
        return temp;
    }
    public void addProd(Prodotto pAdd, int indice){
        supermercati[indice].addProd(pAdd);
    }
}
