package orologio;
public class OrologioDigitale extends Orologio{
    
    private boolean formato24H;
    
    public OrologioDigitale(int ora, int minuti, int secondi, boolean formato24H) {
        super(ora, minuti, secondi);
        setFormatoOra(formato24H);
    }

    public final void setFormatoOra(boolean formato24H) {
        this.formato24H = formato24H;
    }
    
    @Override
    public String dammiOrario() {
        String orario = "";
        if (formato24H) {
            orario = super.dammiOrario();
        } else {
            if (getOra() < 12) {
                orario = super.dammiOrario() + " AM";
            } else {
                int ora = getOra() - 12*(getOra()/13);
                orario = ora + ":" + getMinuti() + ":" + getSecondi() + " PM";
            }
        } 
        return orario;
    }
    
    
    @Override
    public String toString() {
        return "OrologioDigitale\n" +
               "formato ora: " + ((formato24H) ? "24H" : "12H") + "\n" +
               super.toString();
    }
    
 
    
    
}
