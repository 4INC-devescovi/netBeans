package indirizzoIp;
import java.util.regex.Pattern;
public class IndirizzoIp {
    private NumeroBinario[] ip;
    private NumeroBinario[] sottoMaschera;

    public IndirizzoIp(String ip, String subM) {
        String[] ipArray = ip.split(Pattern.quote("."));  //fa lo split della stringa passata da parametro
        this.ip = new NumeroBinario[ipArray.length];  //imposta la grandezza dell'array
        
        for (int i = 0; i <= this.ip.length - 1; i++) {
            this.ip[i] = new NumeroBinario(binario(ipArray[i]));  //istanzia gli oggetti dell'array
        }

        String[] subMArray = subM.split(Pattern.quote("."));
        this.sottoMaschera = new NumeroBinario[subMArray.length];
        for (int i = 0; i <= this.sottoMaschera.length - 1; i++) {
            this.sottoMaschera[i] = new NumeroBinario(binario(subMArray[i]));
        }

    }    

    private String binario(String valS) {   //solita trasformazione in binario
        int val = Integer.parseInt(valS);
        String t = "";
        if (val == 0) {
            t = "0";
        } else {
            while (val > 0) {
                t = (val % 2) + t;
                val /= 2;

            }

        }
        t = aggiungiZeri(t);

        return t;

    }
    private String aggiungiZeri(String n) {  //solito metodo per aggiungere zeri
        while (n.length() < 8) {
            n = "0" + n;
        }
        return n;
    }

    public String stampa() {
        String t = "";
        for (int i = 0; i <= ip.length - 1; i++) 
            t += "indirizzoIp - ip[" + i + "]: " + ip[i].stampa() + "\n";
        for (int i = 0; i <= sottoMaschera.length - 1; i++)
            t += "indirizzoIp - subM[" + i + "]: " + sottoMaschera[i].stampa() + "\n";
        

        return t;
    }

    public String classe() {  //controlla i primi due bit della prima cella dell'array ip
        String clas = "A";
        if (ip[0].digit(0) == '1') {
            if (ip[0].digit(1) == '1') {
                clas = "C";
            } else {
                clas = "B";
            }
        }
        return clas;
    }
    
    public int prefixLength(){
        int prfxL = 8;  //lo imposta a 8 perché il primo byte è sempre di rete
        for(int i = 1; i < sottoMaschera.length -1; i++){  //va da 1 a 4
            for(int j = 0; j < sottoMaschera[i].getNum().length(); j++){
                if(sottoMaschera[i].digit(j) == '1')
                    prfxL++;
            }
        }
        
        return prfxL;
    }
    
    public String rete(){
        String ris = "" + ip[0].decimale() + ".";
        String rete = "";
        for(int i = 1; i<=sottoMaschera.length-1; i++){
            for(int j = 0; j <= sottoMaschera[i].getNum().length()-1; j++){
                if(sottoMaschera[i].digit(j) == '1' && ip[i].digit(j) == '1'){
                    rete += "1";
                }else{
                    rete += "0";
                }
            }
            ris += decimale(rete);
            if(i < sottoMaschera.length - 1)
                ris += ".";
            rete = "";
        }
        return ris;
    }
    public String broadcast(){
        String ris = "" + ip[0].decimale() + ".";
        String broad = "";
        for(int i = 1; i<=sottoMaschera.length-1; i++){
            for(int j = 0; j <= sottoMaschera[i].getNum().length()-1; j++){
                if(sottoMaschera[i].digit(j) == '1' && ip[i].digit(j) == '0'){
                    broad += "0";
                }else{
                    broad += "1";
                }
            }
            ris += decimale(broad);
            if(i < sottoMaschera.length - 1)
                ris += ".";
            broad = "";
        }
        return ris;
    }
    private int decimale(String num) {
        int val = 0;
        int numDimF = num.length();
        for (int i = 0; i < numDimF; i++) {
            if (num.charAt(numDimF - 1 - i) == '1') {
                val += Math.pow(2, i);
            }
        }
        return val;
    }
}
