package indirizzoIp;
public class NumeroBinario {
    private String num;

    public NumeroBinario(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public String stampa() {
        return "Numero: " + num;
                //decimale();
    }

    public char digit(int pos) {
        char ris = '0';
        if (num.length() > pos) {
            if (num.charAt(pos) == '1') {
                ris = '1';
            }
        }
        return ris;
    }

    public int decimale() {
        int val = 0;
        int numDimF = num.length();
        for (int i = 0; i < numDimF; i++) {
            if (num.charAt(numDimF - 1 - i) == '1') {
                val += Math.pow(2, i);
            }
        }
        return val;
    }

    private String aggiungiZeri(String n) {
        while (num.length() > n.length()) {
            n = "0" + n;
        }
        return n;
    }

    public String sottrazione(String sottr) {
        sottr = aggiungiZeri(sottr);

        String ris = "";
        int riporto = 0;                                                        //indica se bisogna prendere il riporto

        for (int i = num.length() - 1; i >= 0; i--) {
            int num1 = Character.getNumericValue(num.charAt(i));        //salva il numero in posizione i della prima stringa
            int num2 = Character.getNumericValue(sottr.charAt(i));      //salva il numero in posizione i della seconda stringa

            int diff = 0;

            diff = num1 - num2 - riporto;

            if (diff < 0) {
                riporto = 1;
                diff += 2;
            } else {
                riporto = 0;
            }
            ris = diff + ris;
        }
        return ris;
    }

    public String somma(String add) {
        add = aggiungiZeri(add);

        String ris = "";
        int riporto = 0;                                                        //indica se bisogna prendere il riporto

        for (int i = num.length() - 1; i >= 0; i--) {
            int num1 = Character.getNumericValue(num.charAt(i));        //salva il numero in posizione i della prima stringa
            int num2 = Character.getNumericValue(add.charAt(i));

            int somm = 0;

            somm = num1 + num2 + riporto;

            if (somm > 1) {
                riporto = 1;
                somm -= 2;
            } else {
                riporto = 0;
            }

            ris = somm + ris;

        }
        if (riporto == 1) {
            ris = riporto + ris;
        }
        return ris;
    }
    
}
