/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author rikid
 */
public class Cerchio extends FiguraPiana{
    private double raggio;
    
    public Cerchio(double raggio, String colore){
        super(colore);
        this.raggio = raggio;
    }
    
    @Override
    public double calcolaPerimetro(){
        return 2*raggio*Math.PI;
    }
    
    @Override
    public double calcolaArea(){
        return raggio*raggio*Math.PI;
    }
    
    public double diametro(){
        return raggio*2;
    }
    
}
