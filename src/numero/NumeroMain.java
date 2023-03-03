package numero;
public class NumeroMain {
    public static void main(String[]args){
        Numero n = new Numero(4);
        
        
        System.out.println(n.somma(3));
        System.out.println(n.compareInt(9));
        System.out.println(n.pariDispari());
        System.out.println(n.isNegativo());
        System.out.println(n.moltiplicazionePerSomma(3));
        System.out.println(n.tabellina());
        System.out.println(n.sequenzaFibonacci());
        System.out.println(n.fattoriale());
        
        Numero n2 = n.fattoriale();
        System.out.println(n2.getValore());
        System.out.println(n.binario());
        
        System.out.println(n.esadecimale());
        
        System.out.println(n.baseX(2));
        
        System.out.println(n.sommaBinario("110"));
    }
}
