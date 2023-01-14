/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abbonamentoMensile;

public class AbbonamentoTest {
    public static void main(String[] args) {
        AbbonamentoMensile ab = new AbbonamentoMensile("Dicembre");
        //maschio
        System.out.println(ab.calcolaCosto("Franco Alberto", 2, true));
        System.out.println(ab.calcolaCosto("Franco Alberto", 20, true));
        System.out.println(ab.calcolaCosto("Franco Alberto", 69, true));
        System.out.println(ab.calcolaCosto("Franco Alberto", 277, true));
        //femmina
        System.out.println(ab.calcolaCosto("Franca Alberta", 14, false));
        System.out.println(ab.calcolaCosto("Franca Alberta", 25, false));
        System.out.println(ab.calcolaCosto("Franca Alberta", 45, false));
        System.out.println(ab.calcolaCosto("Franca Alberta", 6969, false));
    }
}
