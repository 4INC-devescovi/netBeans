package numero;
public class Numero {
    private int valore;
   
   public Numero(int valore){
       this.valore = valore;
   }
   
   public void setValore(int v){
       valore = v;
   }
   public int getValore(){
       return valore;
   }
   
   public String somma(int num1){
       String t = "La somma è: "+(valore + num1);
       return t;
   }
   public String compareInt(int num2){
       String t = "";
       if(valore>num2){
           t = valore + " è maggiore di " + num2;
       }
       else{
           if(valore<num2){
               t = valore + " è minore di " + num2;
           }
           else{
               t = "I due valori sono uguali";
           }
       }
       return t;
   }
   public boolean pariDispari(){
       boolean pari = false;
       if(valore%2 == 0){
           pari = true;
       }
       return pari;
   }
   public boolean isNegativo(){
       boolean neg = false;
       if(valore<0){
           neg = true;
       }
       return neg;
   }
   public String moltiplicazionePerSomma(int molt){  // molt = moltiplicatore
       int risultato = 0;
       
       while(molt*valore != risultato){
           risultato += valore;
       }
       return "Il risultato della moltiplicazione è: " + risultato;
   }
}

