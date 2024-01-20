/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author rikid
 */
public class Cubo extends FiguraSolida{
    private double lato;
    
    public Cubo(double lato, String colore){
        super(colore);
        this.lato = lato;
    }

    @Override
    public double calcolaSuperficie() {
        return Math.pow(lato,2) * 6;
    }

    @Override
    public double calcolaVolume() {
        return Math.pow(lato, 3);
    }
    
    
}
