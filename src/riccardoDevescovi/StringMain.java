/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package riccardoDevescovi;

/**
 *
 * @author rikid
 */
public class StringMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s = "ciao";
        
        
        System.out.println(s.concat("ciao"));
        System.out.println(s.indent(1));
        System.out.println(s.replace('a', 'b'));
        System.out.println(s.replaceAll("ci", "mi"));
        System.out.println(s.substring(2));
        System.out.println(s.substring(2, 3));
        System.out.println(s.toUpperCase());
        s = "CIAO";
        System.out.println(s.toLowerCase());
    }
    
}
