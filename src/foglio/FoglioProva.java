/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foglio;

public class FoglioProva {
    
    public static void main(String[] args) {
        Foglio f = new Foglio(5, 2, "rosso");
        
        double area = f.calcArea();
        System.out.println(area);
        
        double diagonale = f.calcDiagonale();
        System.out.println(diagonale);
        
        f.impostaAltezza(25.0);
        System.out.println(f.getAltezza());
        
        f.impostaBase(25.0);
        System.out.println(f.getBase());
        
        f.impostaColore("viola");
        System.out.println(f.getColore());
        
        System.out.println(f.stampa());
        
    }
        
    
}
