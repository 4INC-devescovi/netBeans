/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometriche;

/**
 *
 * @author rikid
 */
public class Triangolo extends FiguraPiana implements PoligonoRegolare{
    
    
    private double lato;
    
    public Triangolo(double lato, String colore){
        super(colore);
        this.lato = lato;
    }
    
    @Override
    public double calcolaPerimetro(){
        return lato*3;
    }
    
    @Override
    public double calcolaArea(){
        return Math.pow(lato, 2)/2;
    }
    
    @Override
    public double calcolaApotema(){
        return lato*numFissoTriangolo;
    }
    
    public double calcolaAltezza(){
        return Math.sqrt(Math.pow(lato, 2)*3/4);
    }
}
