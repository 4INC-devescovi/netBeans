package dataCompleta;
public class DataCompletaMain {
    public static void main(String[] args) {
        DataCompleta d = new DataCompleta(6, 12, 2021);       
        DataCompleta d2 = new DataCompleta(6, 11, 2020);  
        System.out.println("Giorni di differenza: " + d.diffData(d2));

    }
    
}
