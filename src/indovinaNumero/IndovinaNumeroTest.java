package indovinaNumero;

public class IndovinaNumeroTest {

    public static void main(String[] args) { 
        /*
        deve esserci scritto per forza public static void main(){}
        */
        IndovinaNumero n1 = new IndovinaNumero(4);
        
        String testoDaStampare;
        
        testoDaStampare = n1.stampa();
        
        System.out.println(testoDaStampare);
    }
    
}
