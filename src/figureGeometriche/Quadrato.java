/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author rikid
 */
public class Quadrato extends FiguraPiana implements PoligonoRegolare{
    private double lato;
    
    public Quadrato(double lato, String colore){
        super(colore);
        this.lato = lato;
    }
    
    @Override
    public double calcolaPerimetro(){
        return lato*4;
    }
    
    @Override
    public double calcolaArea(){
        return lato*lato;
    }
    
    @Override
    public double calcolaApotema(){
        return lato*numFissoQuadrato;
    }
    
    public double calcolaDiagonale(){
        return (Math.sqrt(lato*lato*2));
    }
}
