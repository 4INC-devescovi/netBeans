package circonferenza;
import java.lang.Math;
public class Circonferenza {
    private double xA;
    private double yA;
    private double xB;
    private double yB;

    public Circonferenza(double xA, double yA, double xB, double yB) {
        this.xA = xA;
        this.yA = yA;
        this.xB = xB;
        this.yB = yB;
    }
    
    public String stampa(){
        return "Punto A:\nx: " + xA + "\ny: " + yA + "\nPunto B:\nx: " + xB + "\ny: " + yB;
    }
    
    public double getRaggio() {
        return Math.sqrt(Math.pow((xA-xB), 2) + Math.pow((yA - yB), 2));
    }

    public double getPerimetro() {
        return 2*getRaggio()*Math.PI;
    }

    public double getArea() {
        return Math.PI*Math.pow(getRaggio(),2);
    }
    
    
    
    
}
