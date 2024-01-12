/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pescaoggetti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;




/**
 *
 * @author Riccardo e Danilo
 */
public class PescaOggetti extends JFrame{

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            List<Giocatore> giocatori = new ArrayList<>();
            System.out.println("Inserisci nome giocatore o exit per andare avanti");
            String t = s.nextLine();
            try {
                while (!t.equals("exit")) {
                    giocatori.add(new Giocatore(t));
                    System.out.println("Inserisci nome giocatore o exit per andare avanti");
                    t = s.nextLine();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Inserisci numero righe tabellone ");
            int righe = s.nextInt();
            System.out.println("Inserisci numero colonne tabellone ");
            int colonne = s.nextInt();

            Partita p = new Partita(giocatori, righe, colonne);

            while (!p.isFinish()) {
                System.out.println(p.turno());
                System.out.println("Inserisci riga");
                int riga = s.nextInt();
                System.out.println("Inserisci colonna");
                int colonna = s.nextInt();
                while (!p.cercaCella(riga, colonna)) {
                    System.out.println("Cella non valida");
                    System.out.println("Inserisci riga");
                    riga = s.nextInt();
                    System.out.println("Inserisci colonna");
                    colonna = s.nextInt();
                }
                System.out.println(p.stampaPescata());
                System.out.println(p.stampaPunteggi());
                p.cambiaTurno();
            }
            
            System.out.println(p.stampaMosseEseguite());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

