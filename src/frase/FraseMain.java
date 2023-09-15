package frase;
public class FraseMain {
    public static void main(String[] args) {
        String[] pCopia = {"ciao", "mi", "chiamo", "Riccardo"};
        Frase frase = new Frase(pCopia);
        
        System.out.println("Stampa iniziale: " + frase.stampa());
        
        frase.inserimento("helo", 2);
        System.out.println("Inserimento: " + frase.stampa());
        
        frase.cancellazione(2);
        System.out.println("Cancellazione: " + frase.stampa());
        
        frase.spostamento(1, 3);
        System.out.println("Spostamento: " + frase.stampa());
        
        System.out.println("numero parole: " + frase.nParole());
        System.out.println("numero caratteri: " + frase.nCaratteri());
    }
    
}
