/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author rikid
 */
public class Sfera extends FiguraSolida{
    private double raggio;
    
    public Sfera(double raggio, String colore){
        super(colore);
        this.raggio = raggio;
    }
    
    @Override
    public double calcolaVolume(){
        return 4/3 * Math.PI * Math.pow(raggio, 3);
    }
    
    @Override
    public double calcolaSuperficie(){
        return 4 * Math.PI * Math.pow(raggio,2);
    }
}
