package parola;
public class Lettera {
    
    private char carattere;
    private int punteggio;
    
    public Lettera(char carattere){
        this.carattere = carattere;
        punteggio = calcolaP();
    }
    
    private int calcolaP(){
        int punt;
        if(carattere >= 'A' && carattere <= 'Z') //se il carattere è compreso tra A e Z nella tabella ascii,
                                                 //allora togliamo il carattere antecedente al valore dell'attributo
                                                 //e usiamo il numero ottenuto per assegnarlo come punteggio
                                                 //altrimenti sappiamo che è una minuscola e la trasformiamo in maiuscola
            punt = carattere - '@';
        else
            punt = Character.toUpperCase(carattere) - '@';
        
        /*
        int punt = (carattere >= 'A' && carattere <= 'Z') ? carattere - '@' : Character.toUpperCase(carattere) - '@';
        
        questo è un metodo più compatto per scrivere gli if, ti aiuta soprattutto in questi casi dove devi per forza
        inizializzare una variablie per poi assegnarle un valore in base a delle condizioni
        */
        return punt;
    }

    public char getCarattere() {
        return carattere;
    }

    public int getPunteggio() {
        return punteggio;
    }
    
    public String stampa(){
        return "Lettera:\ncarattere: " + carattere + "\npunteggio: " + punteggio; 
    }
}
