/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devescovi;

import java.util.List;

/**
 *
 * @author rikid
 */
public abstract class ControlloNull {
    
    
    
    public static void ifNull(Object obj)throws Exception{
        if(obj == null)
            throw new Exception("L'oggetto non può essere null. ");
    }
    
    public Object[] arrayClone(Object[] obj){
        Object[] objClone = new Object[obj.length];
        
        for(int i = 0; i < obj.length; i++)
            try{
            objClone[i] = clone();
            } catch(Exception e){
                
            }
        return objClone;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Object) super.clone();
    }
}
