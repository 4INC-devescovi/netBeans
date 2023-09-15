package dataCompleta;

import java.util.GregorianCalendar;

public class DataCompleta {
    private int giorno;
    private int mese;
    private int anno;
    private int[] giorniMesi;
    
    public DataCompleta (int giorno, int mese, int anno) {
        this.anno = anno;
        
        giorniMesi = new int[12];
        for(int i = 0; i < 12; i++){
            switch(i){
                case 1:
                    giorniMesi[i] = 28;
                    if (isBisestile())
                        giorniMesi[i] = 29;
                    break;
                case 3:
                case 5:
                case 8:
                case 10:
                    giorniMesi[i] = 30;
                    break;
                default:
                    giorniMesi[i] = 31;
            }
        }
        
        if (mese > 0 && mese < 13)
            this.mese = mese;
        if (giorno > 0 && giorno <= giorniMesi[mese-1])
            this.giorno = giorno;
        
    }

    public int getGiorno() {
        return giorno;
    }

    public int getMese() {
        return mese;
    }

    public int getAnno() {
        return anno;
    }
    
    
    public boolean isBisestile(){
        return bisestile(anno);
    }
    private boolean bisestile(int anno){
        return (anno%400==0) || ((anno%4==0) && (anno%100!=0));
    }
    
    public String domani() {
        int giorno = this.giorno;
        int mese = this.mese;
        int anno = this.anno;
        
        giorno++;
        if (giorno > giorniMesi[mese-1]){
            giorno=1;
            mese++;
        }
        if (mese > giorniMesi.length){
            mese = 1;
            anno++;
        }
        return formattazione(giorno, mese, anno);
    }
    
    public String ieri() {
        int giorno = this.giorno;
        int mese = this.mese;
        int anno = this.anno;
        
        giorno--;
        if (giorno < 1){
            mese--;
            if (mese == 0)
                anno--;
            if (mese == 0)
                mese = 12;
            giorno = giorniMesi[mese-1];   
        }
        return formattazione(giorno, mese, anno);
    }
    
    public String formattaData() {
        return formattazione(giorno, mese, anno);
    }
    
    private String formattazione(int giorno, int mese, int anno){
        String testo = "";
        testo += String.format("%02d/", giorno);
        testo += String.format("%02d/", mese);
        testo += anno;
        return testo;
    }
    
    
    public String aggiungiGiorni(int g){
        int giorno = this.giorno + g; //aggiungiamo i giorni
        int mese = this.mese; //questo serve per aggiornare il mese
        int anno = this.anno; //questo serve per aggiornare l'anno
        
        while(giorno > giorniMesi[mese-1]){
            
            giorno -= giorniMesi[mese-1];
            mese++;
            if(mese > 12){
                mese = 1;
                anno++; 
                giorniMesi[1] = 28;
                if(bisestile(anno))
                   giorniMesi[1] = 29; 
            }
        }
        return formattazione(giorno, mese, anno);
    }
    public int diffData(DataCompleta data){
//        int gTot = 0;
//        int gIniz = data.getGiorno();
//        int mIniz = data.getMese();
//        int aIniz = data.getAnno();
//        
//        
//        int cont = anno - aIniz;
//        while(anno > aIniz + cont){
//            gTot+=365;
//            if(bisestile(aIniz + cont))
//                gTot++;
//            cont++;
//        }
//        cont = 0;
//        while(mese > mIniz){
//            gTot += giorniMesi[mIniz-1];
//            mIniz++;
//        }
//        gTot += giorno - gIniz;
//        return gTot;

        int giorno = this.giorno;
        int mese = this.mese;
        int anno = this.anno;
        int diff = 0;
          
        diff += Math.abs(giorno+data.getGiorno());

         int contM = mese;

        while(contM < data.getMese()){
              diff += giorniMesi[contM];

        }

        int contA = anno;

        while (contA < data.getAnno()){
            diff+=365;
            if (bisestile(contA))
                diff++;
            contA++;
        }
        while (contA > data.getAnno()){
           diff-=365;
           if (bisestile(contA))
                diff--;
            contA--;
        }




        return Math.abs(diff);
    }
}
