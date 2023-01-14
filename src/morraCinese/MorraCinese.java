package morraCinese;
import java.util.Random;

public class MorraCinese {
    private String g1;
    private String g2;
    
    public MorraCinese(String g1, String g2){
        this.g1 = g1;
        this.g2 = g2;
    }
    public String getG1(){
        return g1;
    }
    public void setG1(String nome){
        g1 = nome;
    }
    public String getG2(){
        return g2;
    }
    public void setG2(String nome){
        g2 = nome;
    }
    public String stampa(){
        return "g1: " + g1 + "\ng2: " + g2;
    }

    public String gioca(int m2) {
        
        String testoMano2;
        String t = "";
         
        Random rand = new Random();
        int m1 = rand.nextInt(2) + 1;
        
        switch(m1){
            case 1:
                testoMano2 = "Carta";
                break;
            case 2:
                testoMano2 = "Forbice";
                break;
            default:
                testoMano2 = "Sasso";
        }
        switch(m2){
            case 1:
                testoMano2 = "Carta";
                break;
            case 2:
                testoMano2 = "Forbice";
                break;
            case 3:
                testoMano2 = "Sasso";
                break;
            default:
                t = "giocata non prevista";
           
        }
        
        
        /*if(m2==3 && m1==2){
            t = g2+" vince perché ha giocato carta contro sasso.";
        } else{ //m2!=2 || m1 != 3
            if(m2==1 && m1==3){
                t = g2+" vince perché ha giocato forbici contro carta.";
            }
            else{ //m2!=2 || m1 != 3
                if(m1==2 && m2==1){
                    t = g2+" vince perché ha giocato sasso contro forbici.";
                }
                else{ //m1 != 2 
                    if(m1==3 && m2==2){
                        t = g1+" vince perché ha giocato carta contro sasso.";
                    }
                    else{
                        if(m1==1 && m2==3){
                            t = g1+" vince perché ha giocato forbici contro carta.";
                        }
                        else{
                            t = g1+" vince perché ha giocato sasso contro forbici.";
                        }
                    }
                }
            }
        }*/
        return t;
    }
}


