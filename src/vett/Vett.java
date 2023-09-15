package vett;
public class Vett {
    
    private String[] vettString;
    
    public Vett(String[] vettString){
        setVettString(vettString);
    }
    
    public String [] getVettString(){
        return vettString;
    }
    
    public final void setVettString(String[] vettString){
        
        this.vettString = new String[vettString.length];
        
        for(int i = 0; i < vettString.length; i++)
            this.vettString[i] = vettString[i];
        
        this.vettString[0]="9";
    }
    
    public String stampa(){
        String testo= "";
        for (int i=0; i<vettString.length; i++)
            testo+=vettString[i];
        return testo;
    }
    
}
