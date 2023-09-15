package ticTacToe;
import java.util.Scanner;
public class TicTacToeMain {
    public static void main(String[] args) {
        String[] g = {"Gino", "Pippo"};
        char[] simb = {'X', 'O'};
        
        Scanner scan = new Scanner(System.in);
        
        String s = "s";
        while(s.equals("s")){
            TicTacToe t = new TicTacToe(g, simb);
            while(t.getStatoP() == 0){
                System.out.print("Eseguire la mossa: ");
                int mossa = scan.nextInt();
                System.out.println(t.faiMossa(mossa));
            }
            System.out.println("Continare a giocare? [s/n]");
            scan.nextLine();
            s = scan.nextLine();
        }
        System.out.println("Grazie per aver giocato");
        
        
        
    }
    
}
