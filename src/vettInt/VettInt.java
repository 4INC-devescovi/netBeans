package vettInt;

import java.util.Random;

public class VettInt {
    private int[] vett;
    private int dimL;

    public VettInt(int[] vett) {
        dimL = 0;
        setVett(vett);
        
    }

    public void setVett(int[] vett) {
        this.vett = new int[vett.length];
        
        for(int i = 0; i < vett.length; i++){
            this.vett[i] = vett[i];
            dimL++;
        }  
    }  

    public int getDimL() {
        return dimL;
    }
    
    public int[] getVett() {
        return vett;
    }
    
    public void caricamentoRandom(int min, int max){
        Random rand = new Random();
        for(int i = 0; i < vett.length; i++){
            vett[i] = rand.nextInt(max + min) + min;
        }
    }
    
    public boolean scambioElementi(int posOrigin, int posDest){
        int nOrigin = 0;
        int nDest = 0;
        boolean t = false;
        if(posOrigin < vett.length && posDest < vett.length){
            nOrigin = vett[posOrigin];
            nDest = vett[posDest];
            vett[posDest] = nOrigin;
            vett[posOrigin] = nDest;
            
            t = true;
        }
        return t;
    }
    
    public boolean modificaElemento(int posizione, int valore){
        boolean tF = false;
        if(posizione >= 0 || posizione < vett.length){
            vett[posizione] = valore;
            tF = true;
        }    
        return tF;    
    }
    
    public boolean cancellaElemento(int posizione) {
        boolean risultato = false;
        if (posizione >= 0 && posizione < this.vett.length) {
            int [] vett = new int[this.vett.length-1];
            for (int i = 0; i < vett.length; i++){
                if (i < posizione){
                    vett[i]=this.vett[i];
                } else {
                    vett[i]=this.vett[i+1];
                }
            }
            this.vett = vett;
            risultato = true;
        }
        return risultato;
    }
    
    public int cercaElemento(int valore) {
        int cont = 0;
        for (int i = 0; i < this.vett.length; i++) 
            if (this.vett[i] == valore)
                cont++;
        if (cont == 0) {
            cont = -1;
        }
        return cont;
    }
    
    public int sommaElementi() {
        int somma = 0;
        for (int i = 0; i < this.vett.length; i++) {
            somma += this.vett[i];
        }
        return somma;
    }
    
    public int sommaElementiDaVettore(int[] v){
        int somma = 0;
        for(int i = 0; i < v.length; i++){
            int c = v[i]-1;
            somma += vett[c]; 
        }
        return somma;
    }
    
    public String stampa(String p){
        for(int i = 0; i < vett.length; i++)
            p += "\n" + "vett[" + i + "]" + " = " + vett[i];
        
        return p;
    }    
    
    public boolean cancellaElemento2(int posizione){
        boolean canc = false;
        int [] vet = new int[vett.length -1];
        
        if(posizione >= 0 && posizione < vett.length){
            for(int i = 0; i < vett.length; i++){
                if(i < posizione){
                    vet[i] = vett[i];
                if(i == posizione){
                    i++;
                }
                else{
                    vet[i-1] = vett[i];
                } 
                }
            }
        }
        return canc;
    }    
    
    
    
    
    public boolean aggiungiElemento(int posizione, int valore){
        boolean ris = false;
        if(posizione < vett.length){
            ris = true;
            if(vett.length <= dimL){
                ensureCapacity(1);
            }
            shiftDx(posizione);
            vett[posizione] = valore;
        }
        return ris;
    }
    
    private void ensureCapacity(int minCapacity){
        int[] vettCopia = new int[minCapacity+vett.length];
        for(int i = 0; i < vett.length; i++){
            vettCopia[i] = vett[i];
        }
        vett = vettCopia;
    }
    private boolean shiftDx(int pos){
        boolean ris = false;
        if(pos <= vett.length && dimL < vett.length){
            ris = true;
            int cont = dimL-1;
            while (cont >= pos){
                vett[cont+1] = vett[cont];
                cont--;
            }
            dimL++;
        }
        return ris;
    }
    
    
    
    public int numeroElementi(){
        return getDimL(); 
    }
    
    public void unisci(int[] vett2){
        int lungVettIniz = vett.length;
        if(dimL==lungVettIniz){
            ensureCapacity(vett2.length);
        }
        else{
            int diff = lungVettIniz-dimL;
            ensureCapacity(vett2.length+diff);
        }
        for(int i = 0; i<vett2.length; i++){
            vett[lungVettIniz+i] = vett2[i];
            dimL++;
        }
    }
   
    
    
}
