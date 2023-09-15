/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IstatMatrice;

/**
 *
 * @author rikid
 */
public class IstatMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] costo = {{10.21, 2.59, 6.96, 1.04}, {2.45, 20.69, 1.04, 6.96}};
        String[] nomeBeni = {"Latte", "Carne", "Pane", "Zucchero"};
        String[] nome = {"Trentino Alto-Adige", "Valle d'Aosta"};
        
        Istat reg = new Istat(costo, nomeBeni, nome);
        System.out.println("VitaMax: \n" + reg.vitaMax() + "\n");
        System.out.println("BeneMaxPrezzoRegioni: \n" + reg.beneMaxPrezzoRegioni("Pane") + "\n");
        System.out.println("BeneMaxRegione: " + reg.beneMaxRegione(1));

    }
    
}
