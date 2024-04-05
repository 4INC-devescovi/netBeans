/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipiGenerici;

/**
 *
 * @author rikid
 */
public class Operatrice <T>{
    
    private T val1;
    private T val2;
    
    public Operatrice(){
    }
    
    public Operatrice(T val1, T val2) throws Exception{
        setVal1(val1);
        setVal2(val2);
    }

    public void setVal1(T val1) throws Exception {
        if(val1 == null)
            throw new Exception("Non può essere null. ");
        this.val1 = val1;
    }

    public void setVal2(T val2) throws Exception {
        if(val2 == null)
            throw new Exception("Non può essere null. ");
        this.val2 = val2;
    }

    public String getVal1() {
        return val1.toString();
    }

    public String getVal2() {
        return val2.toString();
    }
    
    public T somma() throws Exception{
        
        if(val1 == null || val2 == null){
            throw new Exception("I due valori non possono essere null. ");
        }
        
        if(val1.getClass() != val2.getClass()){
            throw new Exception("I due valori devono avere lo stesso tipo dato. ");
        }
        return switch (val1.getClass().getSimpleName()) {
            case "Integer" -> (T) Integer.valueOf(((Integer)val1).intValue() + ((Integer)val2).intValue());
            case "Double" -> (T) Double.valueOf((Double) val1 + (Double) val2);
            case "String" -> (T) ((String) val1 + (String) val2);
            case "Float" -> (T) ((Float) val1 + (Float) val2);
            default -> throw new Exception("Tipo di dato non gestito.");
        };
    }
    
    
    
}
