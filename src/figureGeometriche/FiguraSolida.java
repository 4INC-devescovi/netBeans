/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author rikid
 */
public abstract class FiguraSolida extends FiguraGeometrica{
    
    public FiguraSolida(String colore){
        super(colore);
    }
    public abstract double calcolaVolume();
    public abstract double calcolaSuperficie();
}
