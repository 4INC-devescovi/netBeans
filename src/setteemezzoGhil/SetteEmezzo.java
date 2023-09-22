
package setteemezzoGhil;

import java.util.Scanner;

public class SetteEmezzo {

    
    public static void main(String[] args) {
        
        // creo giocatori e mazziere dandogli un nome e il saldo 
        
        Scanner scan = new Scanner(System.in);
        System.out.print("quanti gioctori partecipano: ");
        int nGiocatori = scan.nextInt();
        Giocatore[] arrayGiocatori = new Giocatore[nGiocatori];
        
        String nome;
        int saldo;
        for(int i = 0; i < nGiocatori; i++){
            scan = new Scanner(System.in); //per pulire il buffer di tastiera
            System.out.print("nome gioctore: ");
            nome = scan.nextLine();
            System.out.print("saldo gioctore: ");
            saldo = scan.nextInt();
            arrayGiocatori[i] = new Giocatore(nome, saldo);
        }
        
        System.out.print("nome mazziere: ");
        scan = new Scanner(System.in);     //per pulire il buffer di tastiera
        nome = scan.nextLine();
        Mazziere mazziere = new Mazziere(nome);
        
        //creo la partita
        Partita p1 = new Partita(mazziere, arrayGiocatori);
        
        while(true){
            
            arrayGiocatori = p1.getGiocatori();     //utile nel caso in cui i giocatori in partita si modifichino
            
            //stampa saldo
            System.out.print(p1.stampaSaldoGiocatori());
            
            //confermo partecipazioni e setto le puntate
            int puntata;
            for(int i = 0; i < arrayGiocatori.length; i++){
                System.out.print(arrayGiocatori[i].getNome()+" setta la tua puntata: ");
                puntata = scan.nextInt();
                p1.confermaPartecipazione(puntata, i);
            }

            // pescaggio carte 1 a tutti, poi scelgono se pescar o meno
            System.out.println(p1.inizioPartita());

            //+ continuo a pescare -smetto di pescare 
            for(int i = 0; i < arrayGiocatori.length; i++){
                if(p1.controlloGiocatoreInGioco(i)){

                    /*System.out.println("Giocatore "+arrayGiocatori[i].getNome()+" vuoi pescare ancora (+/-)? punteggio: " +  p1.calcolaPunteggio(arrayGiocatori[i].getMano(), arrayGiocatori[i].getnCarteMano()));
                    scan = new Scanner(System.in);//per pulire il buffer di tastiera
                    char scelta = scan.nextLine().charAt(0);

                    while(scelta == '+' && p1.calcolaPunteggio(arrayGiocatori[i].getMano(), arrayGiocatori[i].getnCarteMano()) <= 7.5){
                        System.out.println(arrayGiocatori[i].getNome()+ "hai pescato "+ p1.assegnaCarta(i));
                        System.out.println("Giocatore "+arrayGiocatori[i].getNome()+" vuoi pescare ancora (+/-)? punteggio: " + p1.calcolaPunteggio(arrayGiocatori[i].getMano(), arrayGiocatori[i].getnCarteMano()));
                        scelta = scan.nextLine().charAt(0);  
                    }
                    */

                    char scelta = '+';

                    while(scelta == '+' && p1.calcolaPunteggio(arrayGiocatori[i].getMano(), arrayGiocatori[i].getnCarteMano()) <= 7.5){
                        System.out.print("Giocatore "+arrayGiocatori[i].getNome()+" vuoi pescare ancora (+/-)? punteggio: " + p1.calcolaPunteggio(arrayGiocatori[i].getMano(), arrayGiocatori[i].getnCarteMano())+" ");
                        scan = new Scanner(System.in);//per pulire il buffer di tastiera
                        scelta = scan.nextLine().charAt(0);  

                        if(scelta == '+'){
                            System.out.println(arrayGiocatori[i].getNome()+ " hai pescato "+ p1.assegnaCarta(i));
                        }
                    }
                    System.out.println("Giocatore "+arrayGiocatori[i].getNome()+" la tua mano finale con punteggio: " + p1.calcolaPunteggio(arrayGiocatori[i].getMano(), arrayGiocatori[i].getnCarteMano()) + " composta da:"+p1.stampaMano(arrayGiocatori[i].getMano(), arrayGiocatori[i].getnCarteMano()));
                }else{
                    System.out.println("Giocatore "+arrayGiocatori[i].getNome()+" non sei in gioco");
                }
            }

            while(p1.calcolaPunteggio(p1.getMazziere().getMano(), p1.getMazziere().getnCarteMano()) < 6){
                p1.getMazziere().pescaMazziere();
            }
            System.out.println("Mazziere: " +  p1.calcolaPunteggio(mazziere.getMano(), mazziere.getnCarteMano()));


            // termina partita e ricomincia

            System.out.println("\n" + p1.terminaPartita());
        }
        
        
        
        /*
        Mazzo m1 = new Mazzo();
        System.err.println(m1.toString());
        m1.mescola();
        System.err.println(m1.toString());
        System.out.println(m1.estraiCarta().toString());
        System.out.println("------");
        System.out.println(m1.estraiCarta().toString());
        */
        
    }
    
}
