package sottrazioneBinario;
public class SottrazioneBinario {
    private String[] numBin;

    public SottrazioneBinario(String[] numBin) {
        this.numBin = copia(numBin);
    }
    
    private String[] copia(String[] num) {
        String[] numCopia = new String[num.length];
        
        for(int i = 0; i < num.length; i++){
            numCopia[i] = num[i];
        }  
        return numCopia;
    } 

    public String getNumBin() {
        String t = "";
        for(int i = 0; i < numBin.length; i++)
            t += "numBin[" + i + "]: \n" + numBin[i] + "\n";
        return t;
    }
    
    
    public String sottrazione(){
        String[] numBin = copia(this.numBin);                               //copio i valori in un nuovo vettore
        while(numBin[0].length() > numBin[1].length()){
            numBin[1] = "0" + numBin[1];                                        //aggiungo gli 0 davanti al sottraendo se necessario
        }
                                                    
           
        
        String ris = "";
        int riporto = 0;                                                        //indica se bisogna prendere il riporto
        
        boolean rip = false;
        
        for (int i = numBin[0].length() - 1; i >= 0; i--) {
            int num1 = Character.getNumericValue(numBin[0].charAt(i));  //salva il numero in posizione i della prima stringa
            int num2 = Character.getNumericValue(numBin[1].charAt(i));  //salva il numero in posizione i della seconda stringa
            
            int diff = 0;
            
            diff = num1 - num2 - riporto;
            
            if(diff < 0){
                riporto = 1;
                diff += 2;
            }
            else{
                riporto = 0;
            }
            ris = diff + ris;
        }
        return ris;
    }
    
}