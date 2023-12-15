/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devescovi;
import data.Data;
/**
 *
 * @author S51VERIFICA24
 */
public class Devescovi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Data d = new Data(1, 1, 2008);
            Studente s = new Studente(2, false, "Rossi", "Mario", d);
            
            Float voto = new Float(7.5);
            s.aggiungiVoto(voto);
            
            Persona p = s;
            
            System.out.println(p.info());
            
            voto = new Float(6.5);
            
            ((Studente)p).aggiungiVoto(voto);
            
        }catch(Exception e){
            
        }
        
        
        
    }
    
}
