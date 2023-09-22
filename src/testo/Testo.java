package testo;
public class Testo {
    private char[] messaggioCriptato;
    private String consonanti;
    private String vocali;
    private String numeri;

    public Testo(String messaggio) {
        this.messaggioCriptato = criptaMessaggio(messaggio);
        consonanti = "bcdfghjklmnpqrstvwyz";
        vocali = "aeiou";
        numeri = "0123456789";
    }

    public String getMessaggio() {
        String t = "";
        for (int i = 0; i < messaggioCriptato.length; i++) {
            t += messaggioCriptato[i];
        }
        return t;
    }

    private char[] criptaMessaggio(String messaggio) {
        char[] messaggioChar = messaggio.toCharArray();
        for (int i = 0; i < messaggio.length(); i++) {
            if (Character.isUpperCase(messaggioChar[i])) {
                messaggioChar[i] = Character.toUpperCase(cripta(messaggioChar[i]));
            } else {
                messaggioChar[i] = cripta(messaggioChar[i]);
            }
        }
        return messaggioChar;
    }

    private char cripta(char c) {

        if (Character.isAlphabetic(c)) {
            c = Character.toLowerCase(c);
            if (vocale(c)) {
                c = criptaVocale(c);
            } else {
                c = criptaConsonante(c);
            }
        } else {
            if (Character.isDigit(c)) {
                c = criptaNumeri(c);
            }
        }
        return c;
    }

    private char criptaConsonante(char c) {
        int cont = 0;
        while (c != consonanti.charAt(cont)) {
            cont++;
        }
        if (cont == 19) {
            c = consonanti.charAt(0);
        } else {
            c = consonanti.charAt(cont + 1);
        }
        return c;
    }

    private char criptaVocale(char c) {
        int cont = 0;
        while (c != vocali.charAt(cont)) {
            cont++;

        }
        if (cont == 4) {
            c = vocali.charAt(0);
        } else {
            c = vocali.charAt(cont + 1);
        }
        return c;
    }

    private char criptaNumeri(char c) {
        int cont = 0;
        while (c != numeri.charAt(cont)) {
            cont++;

        }
        if (cont == 10) {
            c = numeri.charAt(0);
        } else {
            c = numeri.charAt(cont + 1);
        }
        return c;
    }

    private boolean vocale(char c) {
        return (c == 97 || c == 101 || c == 105 || c == 111 || c == 117);

    }

    public static void main(String[] args) {

        String g = "Il cellulare di Elena e' 338-4189961";
        String controllo = "Om dimmamesi fo Imipe i' 449-5290072";
        Testo t = new Testo(g);

        System.out.println(t.getMessaggio());
        System.out.println(controllo.equals(t.getMessaggio()));
    }    
}