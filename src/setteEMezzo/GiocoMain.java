package setteEMezzo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GiocoMain {

    public static void main(String[] args) {

        String[] risultati;
        String[] desc = { "Coppe", "Bastoni", "Spade", "Denari" };
        String[] nomi;
        String mossa = "";
        String t = "";
        int partite = 1;
        int indice = 0;
        String nomeFile = "C:\\Users\\Danilo\\Desktop\\Esercizi info\\setteEMezzo\\risultati.txt";
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(nomeFile);
        } catch (FileNotFoundException e) {
            System.out.println("Errore nell'apertura del file " + nomeFile);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero giocatori: ");
        int giocatori = Integer.parseInt(scanner.nextLine());
        nomi = new String[giocatori];
        scanner.reset();
        for (int i = 0; i < giocatori; i++) {
            System.out.println("Inserisci nome giocatore " + (i + 1) + " : ");
            scanner.reset();
            t = scanner.nextLine();
            nomi[i] = t;
        }
        System.out.println("Quante partite si vogliono giocare: ");
        partite = Integer.parseInt(scanner.nextLine());
        risultati = new String[partite];
        while (partite > 0) {
            Partita p = new Partita(nomi, desc, 10);
            p.gioca();

            System.out.println("\n\n");
            for (int i = 0; i < nomi.length; i++) {
                System.out.println("Tocca a " + p.getGiocatore() + "\n");
                mossa = "";
                while (!mossa.equals("stai") && p.getMano() < 7.5) {
                    System.out.println("La tua mano attuale è: " + p.getMano());
                    System.out.println(p.getGiocatore() + ", fai una mossa: ");
                    mossa = scanner.nextLine();
                    while (!(mossa.equals("carta") || mossa.equals("stai"))) {
                        System.out.println("Mossa non valida, inserisci carta o stai: ");
                        mossa = scanner.nextLine();
                    }
                    if (mossa.equals("carta")) {
                        p.setMano(p.estraiCarta());
                    }
                }
                if (p.getMano() > 7.5) {
                    System.out.println(
                            "Il giocatore " + p.getGiocatore() + " ha sforato il punteggio con " + p.getMano() + "\n");
                } else {
                    System.out.println(
                            "Il giocatore " + p.getGiocatore() + " termina il turno con " + p.getMano() + "\n");
                }
                p.setTurno();
            }
            System.out.println("Tocca a Mazziere" + "\n");
            String mossaMazziere = "";
            while (!mossaMazziere.equals("stai") && p.getManoMazziere() < 7.5) {
                System.out.println("La tua mano attuale è: " + p.getManoMazziere());
                mossaMazziere = p.decisioneMossa();
                System.out.println("Mossa Mazziere: " + mossaMazziere);
                if (mossaMazziere.equals("carta")) {
                    p.setManoMazziere(p.estraiCarta());
                }
            }
            if (p.getManoMazziere() > 7.5) {
                System.out.println("Il Mazziere ha sforato il punteggio con " + p.getManoMazziere() + "\n");
            } else {
                System.out.println("Il Mazziere termina il turno con " + p.getManoMazziere() + "\n");
            }

            String s = "Risultato: \n" + p.risultatoPartita();
            risultati[indice] = s;
            System.out.println("\n\n" + s);
            System.out.println("Vedi i risultati nel file txt");
            System.out.println("\n\n");

            indice++;
            partite--;
        }

        for (int i = 0; i < risultati.length; i++) {
            outputStream.println(risultati[i]);
        }
        outputStream.close();
        scanner.close();
    }

}
