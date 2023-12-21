/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devescovi;

/**
 *
 * @author rikid
 */
public abstract class ControlloNull {
    
    public static void ifNull(Object obj)throws Exception{
        if(obj == null)
            throw new Exception("L'oggetto non può essere null. ");
    }
}
