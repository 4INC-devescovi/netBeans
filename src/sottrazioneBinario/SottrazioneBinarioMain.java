package sottrazioneBinario;
import java.util.Scanner;
public class SottrazioneBinarioMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = new String[2];
        for (int i = 0; i < 2; i++){
            System.out.println("Inserire un numero binario: ");
            s[i] = scan.next();
        }
        
        SottrazioneBinario bin = new SottrazioneBinario(s);
        System.out.println("Il risultato della sottrazione è: " + bin.sottrazione());
    }
    
}
