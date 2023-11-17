package supermercato;
import prodotto.ProdottoVecchio;
public class Azienda {
    private String nomeGruppo;
    private String sedeLegale;
    private Supermercato[] supermercati;

    public Azienda(String nomeGruppo, String sedeLegale, Supermercato[] supermercati) {
        this.nomeGruppo = nomeGruppo;
        this.sedeLegale = sedeLegale;
        this.supermercati = copia(supermercati);
    }
    
    private Supermercato[] copia(Supermercato[] arrayCopia){
        Supermercato[] temp = new Supermercato[arrayCopia.length];
        for(int i = 0; i < arrayCopia.length; i++)
            temp[i] = new Supermercato(arrayCopia[i]);
        return temp;
    }
    
    public void addProd(ProdottoVecchio pAdd, int indice){
        supermercati[indice].addProd(pAdd);
    }
}
