package orologio;
public class Main {
    public static void main(String[] args) {
        
        OrologioDigitale o = new OrologioDigitale(1,1,1,true);
        System.out.println(o.toString());
        o.impostaOrologio(16, 5, 0);
        System.out.println(o.toString());
        o.setFormatoOra(false);
        System.out.println(o.dammiOrario());
    }
    
}