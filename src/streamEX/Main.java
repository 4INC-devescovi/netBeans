/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamEX;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author rikid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] s = {"rosso", "giallo", "verde", null};
        
        Stream<String> colori = Arrays.stream(s);
        
        colori = colori.filter(ss -> ss != null);
        
        String t = "ciao";
        
        System.out.println("i colori sono " + colori.count());
        
        Stream.of("rosso", "giallo", "blu", null, "verde")
                                   .filter(ss -> ss != null && ss.length() > 4)
                                   .forEach(p -> System.out.println(p + t));
        
        Stream.of("rosso", "giallo", "blu", null, "verde")
                                   .filter(ss -> ss != null && ss.length() > 4)
                                   .parallel()
                                   .forEachOrdered(System.out::println); //forEachOrdered serve per fare le cose in ordine 
        
        
        Prodotto[] prodotti = new Prodotto{{1, "pizza"}, {2, "cocacola"}};
        
        Optional<Prodotto> prodottoPrezzoMax = prodotti.stream()
                .max(Comparator.comparingInt(Prodotto::getPrezzo));
    }
    
}
