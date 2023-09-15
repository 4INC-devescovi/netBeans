package ticTacToe;
public class TicTacToe {
    private String[] g;
    private char[] simbolo;
    private char[] griglia;
    private int turno;
    private int statoP;
    
    public TicTacToe(String[] g, char[] simbolo){
        this.g = copiaString(g);
        this.simbolo = copiaChar(simbolo);
        turno = 0;
        griglia = new char[9];
        for(int i = 0; i < 9; i++)
            griglia[i] = ' ';
    }
    private String[] copiaString(String[] vIn){
        String[] vOut = new String[vIn.length];
        for(int i = 0; i < vIn.length; i++){
            vOut[i] = vIn[i];
        }
        return vOut;
    }
    private char[] copiaChar(char[] vIn){
        char[] vOut = new char[vIn.length];
        for(int i = 0; i < vIn.length; i++){
            vOut[i] = vIn[i];
        }
        return vOut;
    }

    public int getStatoP() {
        return statoP;
    }
    
            
            
    private int hasVinto(){
        int ris = 2;
        
        if (griglia[0] == simbolo[turno] && griglia[1] == simbolo[turno] && griglia[2] == simbolo[turno] ||
            griglia[0] == simbolo[turno] && griglia[4] == simbolo[turno] && griglia[8] == simbolo[turno] ||
            griglia[5] == simbolo[turno] && griglia[3] == simbolo[turno] && griglia[4] == simbolo[turno] ||
            griglia[2] == simbolo[turno] && griglia[5] == simbolo[turno] && griglia[8] == simbolo[turno] ||
            griglia[8] == simbolo[turno] && griglia[7] == simbolo[turno] && griglia[6] == simbolo[turno] ||
            griglia[7] == simbolo[turno] && griglia[1] == simbolo[turno] && griglia[4] == simbolo[turno] ||
            griglia[6] == simbolo[turno] && griglia[0] == simbolo[turno] && griglia[3] == simbolo[turno] ||
            griglia[6] == simbolo[turno] && griglia[2] == simbolo[turno] && griglia[4] == simbolo[turno]){
            ris = 1;
        }
        else{
            int i = 0;
            while(i < 9 && ris == 2){
                if(griglia[i] == ' ')
                    ris = 0;
            }
        }
        
        return ris;
    }
    
    public String faiMossa(int posizione){
        if(griglia[posizione-1] == ' ' && posizione > 0 && posizione < 10){
            griglia[posizione-1] = simbolo[turno];
        }
        String t;
        statoP = hasVinto();
        switch(statoP){
            case 1:
                t = g[turno] + " ha vinto";
                break;
            case 2:
                t = "Patta";
                break;
            default:
                t = "";
        }
        turno = (turno+1)%2;
        t += "\n"+ stampaGriglia();
        return t;
    }
    
    private String stampaGriglia() {
        String g = "";
        for (int i = 0; i < 9; i += 3) 
            g += griglia[i] + " | " + griglia[i + 1] + " | " + griglia[i + 2] + "\n";
        return g;
    }

    public String stampaLegenda() {
        return "Legenda:\n" + simbolo[0] + " - " + g[0] + "\n" + simbolo[1] + " - " + g[1] + "\n";
    }

    public String inserisciGiocatore() {
        return "Inserisci il nome del giocatore " + (turno + 1) + ": ";
    }
}
