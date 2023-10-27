package amministrazione;
public class Condominio {
    
    
    private String nome;
    private String indirizzo;
    private Appartamento[] appartamenti;
    private int appartamentiTot;
    
    
    
    public Condominio(Appartamento[] a, String nome, String indirizzo){
        this.nome = nome;
        this.indirizzo = indirizzo;
        appartamenti = new Appartamento[a.length];
        for(int i = 0; i < a.length; i++)
            appartamenti[i] = new Appartamento(a[i]);
        appartamentiTot = appartamenti.length;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getNome() {
        return nome;
    }
    
    public Condominio(Condominio c){
        this.nome = c.nome;
        this.indirizzo = c.indirizzo;
        this.appartamenti = new Appartamento[c.appartamenti.length];
        for(int i = 0; i < c.appartamenti.length; i++)
            this.appartamenti[i] = new Appartamento(c.appartamenti[i]);
        this.appartamentiTot = c.appartamentiTot;
        
    }
    
    public int getAppartamentiTot(){
        return appartamentiTot;
    }
    
    private int cercaAppartamento(int numApp){
        int indice = 0;
        while(indice < appartamentiTot && appartamenti[indice].getNumAppartamento()!= numApp)
            indice++;
        return indice;
    }
    
    public String maxMillesimi(){ //ritorna l'appartamento con più millesimi
        int indice = 0;
        for(int i = 1; i < appartamentiTot; i++){
            if(appartamenti[indice].getMillesimi() < appartamenti[i].getMillesimi())
                indice = i;
        }
        
        return "\nL'appartamento del condominio " + this.nome + " con piu' millesimi e' " + appartamenti[indice].getNominativo();
            
    }    
        
    public void addAppartamento(Appartamento a){
        if(appartamentiTot < appartamenti.length){
            appartamenti[appartamentiTot] = new Appartamento(a);
            appartamentiTot++;
        }
    }
    
    private void shiftSx(int indice){
        for(int i = indice; i < appartamentiTot; i++)
            appartamenti[i - 1] = appartamenti[i];
    }
    
    public void remApp(int numApp){
        shiftSx(cercaAppartamento(numApp));
    }
    
    public String stampa(){
        String t = "";
        for(int i = 0; i < appartamentiTot; i++)
            t += "condominio[" + i + "]:\n" + appartamenti[i].stampa() + "\n";
        return t;
    }
}