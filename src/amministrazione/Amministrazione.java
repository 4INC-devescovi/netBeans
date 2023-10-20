package amministrazione;
public class Amministrazione {
    
    private String nomeAmministratore;
    private int condominiTot;
    private Condominio[] condomini;

    public Amministrazione(String nomeAmm) {
        this.nomeAmministratore = nomeAmm;
        condomini = new Condominio[10];
        condominiTot = 0;
    }
    
    private int cercaCondominio(String indirizzo){
        int indice = 0;
        while(indice < condominiTot && indirizzo.equals(condomini[indice].getIndirizzo()))
            indice++;
        return indice;
    }
    
    public void addCondominio(Condominio c){
        if(condominiTot < condomini.length){
            condomini[condominiTot] = new Condominio(c);
            condominiTot++;
        }
    }
    
    private void shiftSx(int indice){
        for(int i = indice; i < condominiTot; i++)
            condomini[i - 1] = condomini[i];
    }
    
    public void remApp(String indirizzo){
        shiftSx(cercaCondominio(indirizzo));
    }
    
    public String condominioMaxAppartamenti(){  //ritorna i dati del condominio con più appartamenti
        int indice = 0;
        for(int i = 1; i < condominiTot; i++){
            if(condomini[indice].getAppartamentiTot() < condomini[i].getAppartamentiTot())
                indice = i;
        }
        return condomini[indice].stampa();
    }
    
    public String nomeMaxMillesimiCondominio(){
        String t = "";
        for(int i = 0; i < condominiTot; i++)
            t += condomini[i].maxMillesimi();
        return t;
    }
    
    public String stampa(){
        String t = "";
        for(int i = 0; i < condominiTot; i++)
            t += "amministrazione[" + i + "]:\n" + condomini[i].stampa() + "\n";
        return t;
    }
    
    
    
    
}
