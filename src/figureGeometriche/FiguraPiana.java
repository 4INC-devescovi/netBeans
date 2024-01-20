/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author rikid
 */
public abstract class FiguraPiana extends FiguraGeometrica{
    
    public FiguraPiana(String colore){
        super(colore);
    }
    public abstract double calcolaPerimetro();
    public abstract double calcolaArea();
}
