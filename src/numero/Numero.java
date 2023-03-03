package numero;

public class Numero {

    private int valore;

    public Numero(int valore) {
        setValore(valore);
    }

    public final void setValore(int v) {
        if (v >= 0) {
            valore = v;
        }
    }

    public int getValore() {
        return valore;
    }

    public String somma(int num1) {
        String t = "La somma è: " + (valore + num1);
        return t;
    }

    public String compareInt(int num2) {
        String t = "";
        if (valore > num2) {
            t = valore + " è maggiore di " + num2;
        } else {
            if (valore < num2) {
                t = valore + " è minore di " + num2;
            } else {
                t = "I due valori sono uguali";
            }
        }
        return t;
    }

    public boolean pariDispari() {
        boolean pari = false;
        if (valore % 2 == 0) {
            pari = true;
        }
        return pari;
    }

    public boolean isNegativo() {
        boolean neg = false;
        if (valore < 0) {
            neg = true;
        }
        return neg;
    }

    public String moltiplicazionePerSomma(int molt) {  // molt = moltiplicatore
        int risultato = 0;

        while (molt * valore != risultato) {
            risultato += valore;
        }
        return "Il risultato della moltiplicazione è: " + risultato;
    }

    public String tabellina() {
        int c = 10;
        int somma = 0;
        String testo = "";
        while (c > 0) {
            somma += valore;
            testo += somma + " ";
            c--;
        }
        return testo;
    }

    public String sequenzaFibonacci() {
        String t = "Sequenza di fibonacci: ";
        int cont = valore;
        int n1 = 1;
        int n2 = 0;
        int seq = 0;

        while (cont > 0) {
            seq = n1 + n2;
            n1 = n2;
            n2 = seq;
            t += seq + " ";
            cont--;
        }
        return t;
    }

    public Numero fattoriale() {
        int cont = valore;
        int fatt = 1;
        while (cont > 0) {
            fatt *= cont;
            cont--;
        }
        Numero num = new Numero(fatt);
        return num;
    }

    public String binario() {
        int val = valore;
        String t = "";
        if (val == 0) {
            t = "0";
        } else {
            while (val > 0) {
                t = (val % 2) + t;
                val /= 2;
            }
        }

        return t;
    }

    public String esadecimale() {
        String esa = "";
        String bin = binario();
        int inizio = bin.length();
        while (inizio % 4 != 0) {
            bin = "0" + bin;
            inizio = bin.length();
        }
        int fine = bin.length() - 4;
        while (fine >= 0) {
            String conversione = bin.substring(fine, inizio);
            esa = conversioneEsa(conversione) + esa;
            fine -= 4;
            inizio -= 4;
        }
        return esa;
    }

    private String conversioneEsa(String esa) {
        switch (esa) {
            case "0000":
                esa = "0";
                break;
            case "0001":
                esa = "1";
                break;
            case "0010":
                esa = "2";
                break;
            case "0011":
                esa = "3";
                break;
            case "0100":
                esa = "4";
                break;
            case "0101":
                esa = "5";
                break;
            case "0110":
                esa = "6";
                break;
            case "0111":
                esa = "7";
                break;
            case "1000":
                esa = "8";
                break;
            case "1001":
                esa = "9";
                break;
            case "1010":
                esa = "A";
                break;
            case "1011":
                esa = "B";
                break;
            case "1100":
                esa = "C";
                break;
            case "1101":
                esa = "D";
                break;
            case "1110":
                esa = "E";
                break;
            case "1111":
                esa = "F";
                break;
            default:
                esa = "Tua madre fa bocchini";
        }
        return esa;
    }

    public String baseX(int elev) {
        int val = valore;
        String t = "";
        if (elev <= 1) {
            t = "Porcodio, non è possibile trasformare un numero in base 1 e 0, perché non esistono, capra IGNORANTE!!";
        } else {
            if (val == 0) {
                t = "0";
            } else {
                while (val > 0) {
                    int resto = val % elev;
                    String conv = convertitoreX(resto);
                    t = conv + t;
                    val /= elev;
                }
            }
        }

        return valore + " in base " + elev + " è: " + t;
    }

    private String convertitoreX(int conv) {
        String t = " ";
        if (conv >= 10 && conv <= 36) {
            String conver = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            conv -= 10;
            t += conver.charAt(conv);
        } else {
            t += conv;
        }

        return t;
    }

    public String sommaBinario(String op) {

        String t = "";
        int resto = 0;
        int n1 = 0;
        int n2 = 0;

        String val = binario();
        int contVal = val.length() - 1;
        int contOp = op.length() - 1;
        //cont è il contatore che si usa per il while
        int cont = contVal + 1;
        if (contOp > contVal) {
            cont = contOp + 1;
        }
        while (cont > -1) {
            if (contVal > -1 || contOp > -1 || resto == 1) {
                if (contVal >= 0) {
                    if (val.charAt(contVal) == '1') {
                        n1 = 1;
                    }
                }
                if (contOp >= 0) {
                    if (op.charAt(contOp) == '1') {
                        n2 = 1;
                    }
                }

                //sommo per vedere cosa devo aggiungere a t e se c'è il resto
                n1 += n2 + resto;
                switch (n1) {
                    case 1:
                        resto = 0;
                        t = "1" + t;
                        break;
                    case 2:
                        resto = 1;
                        t = "0" + t;
                        break;
                    case 3:
                        resto = 1;
                        t = "1" + t;
                        break;
                    default:
                        resto = 0;
                        t = "0" + t;
                }   
            }
            cont--;
            contVal--;
            contOp--;
            n1 = 0;
            n2 = 0;

        }
        return t;
    }

}
