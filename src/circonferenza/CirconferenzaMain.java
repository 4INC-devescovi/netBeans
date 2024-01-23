package circonferenza;
public class CirconferenzaMain {
    public static void main(String[] args) {
        Circonferenza c = new Circonferenza(1, 0, 0, 0);

        System.out.println("Raggio: " + c.getRaggio());
        System.out.println("Perimetro: " + c. getPerimetro());
        System.out.println("Area: " + c.getArea());
        
        System.out.println(Character.hashCode('1'));
    }
    
}