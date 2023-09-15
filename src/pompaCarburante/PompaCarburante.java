package pompaCarburante;
public class PompaCarburante {
    
    private String nomeDistributore;
    private double prezzoCarburante;   //  euro/litri
    private int capacitaCisterna;   //  litri
    private int carburanteVenduto;  //  litri

    public PompaCarburante(String nomeDistributore, double prezzoCarburante, int capacitaCisterna, int carburanteVenduto) {
        this.nomeDistributore = nomeDistributore;
        this.prezzoCarburante = prezzoCarburante;
        this.capacitaCisterna = capacitaCisterna;
        this.carburanteVenduto = carburanteVenduto;
    }
    
    public String stampa(){
        return "PompaCarburante:\nnomeDistributore = " + nomeDistributore
               + "\nprezzoCarburante = " + prezzoCarburante + "\ncapacitaCisterna = "
               + capacitaCisterna + "\ncarburanteVenduto = " + carburanteVenduto;
    }
    
    
    public int riempireCis(){
        return carburanteVenduto;
    }
    
    public int carbRim(){
        return capacitaCisterna - carburanteVenduto;
    }
    
    public double valoreRim(){
        return carbRim()*prezzoCarburante;
    }
    
    public double importoPieno(double capacitaMacch){
        return capacitaMacch*prezzoCarburante;
    }
    
}
