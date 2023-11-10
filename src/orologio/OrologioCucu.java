package orologio;
public class OrologioCucu extends Orologio{
    
    private boolean carillonAttivo;
    
    public OrologioCucu(int ora, int minuti, int secondi, boolean carillon) {
        super(ora, minuti, secondi);
        carillonAttivo = carillon;
    }

    public final void setCarillonAttivo(boolean carillonAttivo) {
        this.carillonAttivo = carillonAttivo;
    }
    
    public void impostaCarillon(boolean carillon){
        setCarillonAttivo(carillon);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "OrologioCucu:"
                + "\nCarillonAttivo: " + carillonAttivo
                + "\n"+ super.toString(); 
    }
}
