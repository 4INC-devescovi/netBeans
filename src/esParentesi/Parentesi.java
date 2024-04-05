/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esParentesi;

import java.util.ArrayList;


/**
 *
 * @author rikid
 * 
 * ( = 40
 * ) = 41
 * 
 * [ = 91
 * ] = 93
 * 
 * { = 123
 * } = 125
 * 
 */

public class Parentesi {
    
    private static ArrayList<Character> pila = new ArrayList<>();

    public static void push(Character c) {// aggiungi
        pila.add(c);
    }

    public static Character pop() { //rimuovi
        return pila.remove(pila.size() - 1);
    }

    public static Character peek() { //vedi
        return pila.get(pila.size() - 1);
    }

    public static boolean isEmpty() {
        return pila.isEmpty();
    }
    
    
    public static boolean parentesiBilanciate(String parentesi) {
        boolean ris = true;
        pila.clear();
        // Scorrere l'espressione carattere per carattere
        for (char carattere : parentesi.toCharArray()) {
            if (ris) {
                // Se il carattere è una parentesi aperta, inserirlo nello stack
                if (parentesiAperte(carattere)) {
                    push(carattere);
                } // Se il carattere è una parentesi chiusa
                else if (parentesiChiuse(carattere)) {
                    // Se lo stack è vuoto, significa che c'è una parentesi chiusa senza corrispondente aperta
                    if (pila.isEmpty()) {
                        ris = false;
                    }
                    // Se la parentesi chiusa non corrisponde alla parentesi aperta in cima allo stack, allora le parentesi non sono bilanciate
                    char parentesiAperta = pop();
                    if ((carattere == ')' && parentesiAperta != '(')
                            || (carattere == ']' && parentesiAperta != '[')
                            || (carattere == '}' && parentesiAperta != '{')) {
                        ris = false;
                    }
                }
            }
        }
        // Se lo stack è vuoto alla fine, allora tutte le parentesi sono bilanciate
        
        return ris && pila.isEmpty();
    }

    private static boolean parentesiAperte(Character c) {
        return (c == '(' || c == '[' || c == '{');
    }

    private static boolean parentesiChiuse(Character c) {
        return (c == ')' || c == ']' || c == '}');
    }
}
