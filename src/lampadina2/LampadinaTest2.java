package lampadina2;

public class LampadinaTest2 {

    public static void main(String[] args) {
        Lampadina2 l1 = new Lampadina2("Phillips", "rosso", 24, 3);
        Lampadina2 l2 = new Lampadina2("Phillips", "giallo", 23, 3);
        Lampadina2 l3 = new Lampadina2("Phillips", "verde", 22, 3);

        int nAcc1 = l1.getNAcc();
        int nAcc2 = l2.getNAcc();
        int nAcc3 = l3.getNAcc();

        if (nAcc1 > nAcc2 && nAcc1 > nAcc3) {
            System.out.println("Lampadina 1");
        } else if (nAcc2 > nAcc3) {
            if (nAcc1 == nAcc2) {
                System.out.println("La lampadina 1 ha lo stesso numero di"
                        + " accensioni della lampadina 2. ");
            } else {
                System.out.println("Lampadina 2");
            }
        } else {
            if (nAcc1 == nAcc2 && nAcc1 == nAcc3) {
                System.out.println("Tutte le lampadine hanno lo stesso numero"
                        + " di accensioni. ");
            } else if (nAcc1 == nAcc3) {
                System.out.println("La lampadina 1 ha lo stesso numero di"
                        + " accensioni della lampadina 3. ");
            } else if (nAcc2 == nAcc3) {
                System.out.println("La lampadina 2 ha lo stesso numero di"
                        + " accensioni della lampadina 3. ");
            } else {
                System.out.println("Lampadina 3");
            }
        }
    }
}
