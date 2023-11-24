/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

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
        
        Padre p = new Padre();
        Figlio f = new Figlio();
        Padre pf = new Figlio();
        Padre pp = pf;
        
        p.incrementa();
        System.out.println("p " + p.toString());
        System.out.println("pp " + pp.toString());
        
        pp.incrementa();
        System.out.println("p " + p.toString());
        System.out.println("pp " + pp.toString());
        
        f.incrementa();
        System.out.println("f " + f.toString());
        
        pf.incrementa();
        System.out.println("pf " + pf.toString());
        
        Figlio ff = (Figlio)pp;
        System.out.println("ff " + ff.toString());
        
        ff = (Figlio)pp;
        System.out.println("ff " + ff.toString());
        
    }
    
}
