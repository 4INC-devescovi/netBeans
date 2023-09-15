package vettInt;
public class VettIntMain {
    public static void main(String[] args) {
        
        
        int[] vInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        VettInt v = new VettInt(vInt);
        System.out.println(v.stampa("Vettore iniziale: "));
        
        v.caricamentoRandom(1, 9);
        System.out.println(v.stampa("Caricamento random: "));
                
        System.out.println("Scambio elementi:  " + v.scambioElementi(4, 5) + v.stampa(""));
        
        System.out.println("Modifica elemento: " + v.modificaElemento(3, 10) + v.stampa(""));
        
        System.out.println("Cancella elemento:  " + v.cancellaElemento2(6) + v.stampa(""));
        
        System.out.println("Cerca elemento: " + v.cercaElemento(5));
        
        System.out.println("Somma elementi: " + v.sommaElementi());
        
        int[] vInt2 = {1, 3, 6, 9};
        System.out.println("Somma elementi da vettore: " + v.sommaElementiDaVettore(vInt2));
        
        System.out.println("Aggiungi elemento: " + v.aggiungiElemento(19, 5));
        
        System.out.println("Numero elementi: " + v.numeroElementi());    
        
        System.out.println("Aggiungi elemento: " + v.aggiungiElemento(5, 17) + v.stampa(""));
        int[] v2 = {21, 22, 23, 24, 25, 26};
        v.unisci(v2);
        System.out.println("Unisci: " + v.stampa(""));
        
        
        
    }
}
