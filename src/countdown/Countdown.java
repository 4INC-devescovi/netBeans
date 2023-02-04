package countdown;

public class Countdown {

    private int numPartenza;

    public Countdown(int numPartenza) {
        this.numPartenza = numPartenza;
    }
    public int getNumPartenza(){
        return numPartenza;
    }
    public void setNumPartenza(int nP){
        numPartenza = nP;
    }

    public String conta() {       
        String testo = "";
        int cont = numPartenza;
        while(cont>=0){
            testo += decodificatore(cont);
            cont --;
        }    
        return testo;
    }

    
    private String decodificatore(int cont){
        String t = "";
        switch (cont){
            case 0:
                t = "  ***\n"
                  + " ** **\n"
                  + "**   **\n"
                  + "**   **\n"
                  + "**   **\n"
                  + " ** **\n"
                  + "  ***";
                break;
            case 1:
                t = "  ***\n"
                  + " ****\n"
                  + "** **\n"
                  + "   **\n"
                  + "   **\n"
                  + "   **";
                break;
            case 2:
                t = " *****\n"
                  + "**   **\n"
                  + "     **\n"
                  + "    **\n"
                  + "   **\n"
                  + "  **\n"
                  + " **\n"
                  + "*******";
                break;
            case 3:
                t = " *****\n"
                  + "**   **\n"
                  + "     **\n"
                  + "   ***\n"
                  + "     **\n"
                  + "**   **\n"
                  + " *****";
               break;
            case 4:
                t = "    ***\n"
                  + "   ****\n"
                  + "  ** **\n"
                  + " **  **\n"
                  + "********\n"
                  + "     **\n"
                  + "     **";
                break;
            case 5:
                t = "*******\n"
                  + "**\n"
                  + "**\n"
                  + "*******\n"
                  + "     **\n"
                  + "     **\n"
                  + "******";
                break;
            case 6:
                t =" *****\n"
                  + "**   **\n"
                  + "**\n"
                  + "******\n"
                  + "**   **\n"
                  + "**   **\n"
                  + " *****";
                break;
            case 7:
                t = "*******\n"
                  + "     **\n"
                  + "    **\n"
                  + "   **\n"
                  + "  **\n"
                  + " **\n"
                  + "**";
                break;
            case 8:
                t = "  ***\n"
                  + " ** **\n"
                  + "**   **\n"
                  + " ** **\n"
                  + "  ***\n"
                  + " ** **\n"
                  + "**   **\n"
                  + " ** **\n"
                  + "  ***";
                break;
            case 9:
                t = " *****\n"
                  + "**   **\n"
                  + "**   **\n"
                  + " ******\n"
                  + "     **\n"
                  + "     **\n"
                  + " *****";
                break;
            case 10:
                t = "  ***\n"
                  + " ****\n"
                  + "** **\n"
                  + "   **\n"
                  + "   **\n"
                  + "   **"
                  + "\n"
                  + " \n"
                  + "  ***\n"
                  + " ** **\n"
                  + "**   **\n"
                  + "**   **\n"
                  + "**   **\n"
                  + " ** **\n"
                  + "  ***";
                break;
            default:
                t = cont + "";
        }
        t += "\n \n";
        return t;
    }
    public String stampa(){
        return "Il numero di partenza è: " + numPartenza;
    }
}