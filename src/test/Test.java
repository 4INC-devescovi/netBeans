/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author rikid
 */
public class Test {
    
    private Double base;
    private String colore;
    private String id;
    
    public Test(Double base, String colore, String id) throws Exception{
        setBase(base);
        setColore(colore);
        setId(id);
    }
    
    public final void setBase(Double base) throws Exception{
        try {
            if(base > 0)
                this.base = base;
            else
                throw new Exception("Il valore deve essere maggiore di 0");
            
        } catch(NullPointerException e){
            throw new NullPointerException("Il valore non puo' essere NULL");
        } catch (Exception e){
            throw new Exception("Errore generico");
        }
    }

    public final void setColore(String colore) throws Exception{
        try {
            if(!colore.isEmpty())
                if(colore.length() >= 3)
                    this.colore = colore;
                else
                    throw new Exception("Il colore deve avere almeno 3 caratteri");   
            else
                throw new Exception("Il colore non puo' essere una stringa vuota");
            
        } catch(NullPointerException e){
            throw new NullPointerException("Il colore non puo' essere NULL");
        }
    }

    public final void setId(String id) throws Exception{
        try {
            if(id.length() == 4){
                if(Character.isLetter(id.charAt(0)) && Character.isLetter(id.charAt(1))){
                    Integer.parseInt(id.substring(2));
                    this.id = id; 
                } else{
                    throw new Exception("I primi due caratteri devono essere lettere");
                }
            }
            else
                throw new Exception("L'id deve essere una stringa formata da 4 caratteri");

        } catch(NullPointerException e){
            throw new NullPointerException("L'id non puo' essere NULL");
        } catch(NumberFormatException e){
            throw new NumberFormatException("L'id deve avere due numeri finali");
        }
    }
    
    

}
