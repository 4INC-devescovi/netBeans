package lampadina; //in quale package si trova la lampadina//

/**
 *
 * @author RICCARDO.DEVESCOVI
 */
public class Lampadina { 
//dichiarare una classe: nome classe principale = nome package//
    
    //attributi//
    private String marca;
    private String colore;
    private int numeroAccensioni;
    private int nAccens;
    private boolean stato;
    
    /**costruttore: non ritorna niente, deve avere lo stesso nome della classe.
     * Ha dentro tutti gli attributi. !!!Ci deve essere sempre!!!*/
    public Lampadina(String marca, String colore, int numeroAccensioni,
                     int nAccens, boolean stato){
        /**
         * "this.marca = marca;" con THIS si intende !!!L'ATTRIBUTO!!!*/
        this.marca = marca;
        this.colore = colore;
        this.numeroAccensioni = numeroAccensioni;
        this.nAccens = nAccens;
        this.stato = stato;
    }
    public String getMarca(){
        //restituisce il valore dell'attributo//
        return marca;
    }
    public void setMarca(String marca){
        //modifica il valore dell'attributo//
        this.marca = marca;
    }
    
}
