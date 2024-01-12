/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devescovi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author RICCARDO.DEVESCOVI
 */
public class Data extends ControlloNull{
    
    
    ////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTI                                                              //
    ////////////////////////////////////////////////////////////////////////////
    
    private String data;
    private Integer giorno;
    private Integer mese;
    private Integer anno;
    
    
    ////////////////////////////////////////////////////////////////////////////
    // COSTRUTTORI                                                            //
    ////////////////////////////////////////////////////////////////////////////
    
    public Data(){  //data attuale
        LocalDate date = LocalDate.now();
        giorno = date.getDayOfMonth();
        mese = date.getMonthValue();
        anno = date.getYear();
        creaData();
    }
    
    public Data(String data) throws Exception{
        setData(data);
    }
    
    public Data(Integer giorno, Integer mese, Integer anno) throws Exception{
        setMese(mese);
        setAnno(anno);
        setGiorno(giorno);
    }
    
    public Data(Data date){
        giorno = date.giorno;
        mese = date.mese;
        anno = date.anno;
        data = date.data;
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    // toString                                                               //
    ////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Data{" + "data=" + data + ", giorno=" + giorno + ", mese=" + mese + ", anno=" + anno + '}';
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    // METODI ATTRIBUTO DATA                                                  //
    ////////////////////////////////////////////////////////////////////////////
    
    public String getData() throws Exception{
        ifNull(data);
        return data;
    }
    
    public final void setData(String data) throws Exception{
        ifNull(data);
        if(data.isBlank()){ //meglio usare String.isBlank() perché controlla
                            //che sia vuota e che non sia formata solo da spazi
            try{
                setMese(Integer.getInteger(data.substring(3, 5)));
                setAnno(Integer.getInteger(data.substring(6)));
                setGiorno(Integer.getInteger(data.substring(0, 2)));
            }catch(Exception e){
                throw new Exception("La stringa non può essere trasformata in una data."
                                  + "Inserire una data con questo modello: 01/01/2000 ");
            }
        }else{
            throw new Exception("La stringa deve essere istanziata. ");
        }
        this.data = data;
    }
    
    private void creaData(){
        data = String.format("%02d", this.giorno) + "/"
             + String.format("%02d", this.mese) + "/"
             + String.format("%02d", this.anno);
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    // METODI ATTRIBUTO GIORNO                                                //
    ////////////////////////////////////////////////////////////////////////////   
    
    public Integer getGiorno() throws Exception{
        ifNull(giorno);
        return giorno;
    }
    
    public final void setGiorno(Integer giorno) throws Exception{
        ifNull(giorno);
        
        Integer[] arrayGiorni = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if(anno%4 == 0)
            arrayGiorni[1]++;
            
        if(giorno.compareTo(arrayGiorni[mese]) <= 0 && giorno.compareTo(0) > 0)
            this.giorno = giorno;
        else
            throw new Exception("Il valore del giorno non è accettabile. ");
        
        creaData(); 
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    // METODI ATTRIBUTO MESE                                                  //
    ////////////////////////////////////////////////////////////////////////////
    
    public Integer getMese() throws Exception{
        ifNull(mese);
        return mese;
    }
    
    public final void setMese(Integer mese) throws Exception{
        ifNull(mese);
        if(mese.compareTo(12) <= 0 && mese.compareTo(0) > 0)
            this.mese = mese;
        else
            throw new Exception("Il valore del mese non è accettabile. ");
        creaData();
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    // METODI ATTRIBUTO ANNO                                                  //
    ////////////////////////////////////////////////////////////////////////////
    
    public Integer getAnno() throws Exception{
        ifNull(anno);
        return anno;
    }

    public final void setAnno(Integer anno) throws Exception {
        if (anno == null) {
            throw new Exception("L'oggetto non può essere null");
        }
        this.anno = anno;
        creaData();
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    // METODI DELLA CLASSE                                                    //
    ////////////////////////////////////////////////////////////////////////////
    
    public String giornoDellaSettimana(){
        Integer m = mese;
        Integer a = anno;
        Integer g = giorno;
        
        if(m < 3){
            m += 12;
            a--;
        }
        
        int k = a % 100;
        int j = a / 100;
        
        int giornoSettimana = (g + ((13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) - (2 * j)) % 7);
        
        if(giornoSettimana < 0)
            giornoSettimana += 7;
        
        String[] giorni = {"Sabato", "Domenica", "Lunedi", "Martedi", "Mercoledi", "Giovedi", "Venerdi"};
        return giorni[giornoSettimana];
    }
    
    public static Long differenzaInGiorni(Data dataAntecedente, Data dataSuccessiva) throws Exception{
        ifNull(dataAntecedente);
        ifNull(dataSuccessiva);
        
        LocalDate dataAnt = LocalDate.of(dataAntecedente.anno, dataAntecedente.mese, dataAntecedente.giorno);
        LocalDate dataSucc = LocalDate.of(dataSuccessiva.anno, dataSuccessiva.mese, dataSuccessiva.giorno);
        return ChronoUnit.DAYS.between(dataAnt, dataSucc);
    }
    
    public static Long differenzaInSettimane(Data dataAntecedente, Data dataSuccessiva) throws Exception{
        ifNull(dataAntecedente);
        ifNull(dataSuccessiva);
        
        LocalDate dataAnt = LocalDate.of(dataAntecedente.anno, dataAntecedente.mese, dataAntecedente.giorno);
        LocalDate dataSucc = LocalDate.of(dataSuccessiva.anno, dataSuccessiva.mese, dataSuccessiva.giorno);
        return ChronoUnit.WEEKS.between(dataAnt, dataSucc);
    }
    
    public static Long differenzaInAnni(Data dataAntecedente, Data dataSuccessiva) throws Exception{
        ifNull(dataAntecedente);
        ifNull(dataSuccessiva);
        
        LocalDate dataAnt = LocalDate.of(dataAntecedente.anno, dataAntecedente.mese, dataAntecedente.giorno);
        LocalDate dataSucc = LocalDate.of(dataSuccessiva.anno, dataSuccessiva.mese, dataSuccessiva.giorno);
        return ChronoUnit.YEARS.between(dataAnt, dataSucc);
    }
    
    public static String differenzaInGiorniMesiAnni(Data dataAntecedente, Data dataSuccessiva) throws Exception{
        ifNull(dataAntecedente);
        ifNull(dataSuccessiva);
        
        LocalDate dataAnt = LocalDate.of(dataAntecedente.anno, dataAntecedente.mese, dataAntecedente.giorno);
        LocalDate dataSucc = LocalDate.of(dataSuccessiva.anno, dataSuccessiva.mese, dataSuccessiva.giorno);
        Period differenza = Period.between(dataAnt, dataSucc);
        return differenza.getDays() + " giorni, " + differenza.getMonths() + " mesi e " + differenza.getYears() + " anni";
    }
}
