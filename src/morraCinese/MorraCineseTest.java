package morraCinese;

public class MorraCineseTest{
    
    public static void main(String[] args){
        
        MorraCinese gioco1 = new MorraCinese("PC", "Andrea");
        
        String round1 = gioco1.gioca(2);
        String round2 = gioco1.gioca(1);
        String round3 = gioco1.gioca(1);
        
        System.out.println(round1);
        System.out.println(round2);
        System.out.println(round3);
        
        
        
        String g1 = "Giovanni";
        String g2 = "Giovannino";
        
        MorraCinese gioco2 = new MorraCinese(g1,g2);  
        
        String round4 = gioco2.gioca(2);
        String round5 = gioco2.gioca(2);
        String round6 = gioco2.gioca(2);
        
        gioco2.setG2("Ermenegildo");
        String nomeG2 = gioco2.getG2();
        System.out.println(nomeG2);
        
        System.out.println(round4);
        System.out.println(round5);
        System.out.println(round6);
        
    }
}

