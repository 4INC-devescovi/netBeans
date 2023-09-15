package arrayInt;
public class ArrayIntMain {
    public static void main(String[] args) {
        
        ArrayInt a = new ArrayInt(5);
        int [] b = {1, 2, 3, 4, 5, 6, 7};
        a.addAll(b);
        a.addPos(3, 7);
        System.out.println(a.stampa());
    }
    
}
