package aziendaAgricola;
public class AziendaAgraria {
    private int[] quantitaMele;
    private String[]  giornate;
    
    public AziendaAgraria(int[] quantitaMele, String[] giornate) {
        this.quantitaMele = copiaIntArray(quantitaMele);
	this.giornate = copiaStringArray(giornate);
    }
    
    public int totaleRaccolto(){
        int tot=0;      
        for (int i = 0; i < quantitaMele.length; i++) {
            tot+=quantitaMele[i];
        }
        return tot;
    }
    
    public int mediaRaccolta(){
        return totaleRaccolto()/giornate.length;
    }
    
    public String giorniMaggQuantita(int quantita){
        String s ="Giornata/e in cui si sono superati i " + quantita + " quintali: ";
        for (int i = 0; i < quantitaMele.length; i++) {
            if(quantita<quantitaMele[i]){
                   s+= giornate[i] + " ";
            }
        }
        return s;
    } 
    
    public int raccolteSabato(){
        int indice = 0;
        while(!giornate[indice].equals("sab"))
            indice++;         
        return quantitaMele[indice];
    }
    
    private String[] copiaStringArray(String[] arrayDaCopiare){
        String[] temp = new String[arrayDaCopiare.length];
        for (int i = 0; i < arrayDaCopiare.length; i++){
            temp[i] = arrayDaCopiare[i];
        }
        return temp;
    }
    
    private int[] copiaIntArray(int[] arrayDaCopiare){
        int[] temp = new int[arrayDaCopiare.length];
        for (int i = 0; i < arrayDaCopiare.length; i++){
            temp[i] = arrayDaCopiare[i];
        }
        return temp;
    }
    
    public static void main(String[] args){
        int[] quantitaMele = {10, 20, 30, 40, 50, 60, 70};
        String[] giornate = {"gio", "ven", "sab", "dom", "lun", "mar", "mer"};
        
        AziendaAgraria a = new AziendaAgraria(quantitaMele, giornate);
        
        System.out.println(a.giorniMaggQuantita(30));
        System.out.println(a.mediaRaccolta());
        System.out.println(a.totaleRaccolto());
        System.out.println(a.raccolteSabato());
    }
}




