/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayInt;

/**
 *
 * @author rikid
 */
public class ArrayInt {
    private int[] array;
    private int dimL;   //dimensione logica
    
    public ArrayInt(int dimF) {
        dimL = 0;
        array = new int[dimF];
    }
    
    public boolean add(int add){
        boolean ris = false;
        if(dimL < array.length){
            array[dimL] = add;
            dimL++;
            ris = true;
        }
        return ris;
    }
    
    public boolean addAll(int[] add){;
        boolean ris = true;
        if(add.length > array.length - dimL){
            ensureCapacity(dimL + add.length);
        }
        int i = 0;
        while(i<add.length && ris == true){
            ris = add(add[i]);
            i++;
        }
        return ris;
        
    }
    
    public boolean addFirst(int add){
        boolean ris = false;
        if(dimL < array.length){
            ris = true;
            int cont = dimL-1;
            while (cont >= 0){
                array[cont+1] = array[cont];
                cont--;
            }
            dimL++;
        }
        return ris;
    }
    
    public int[] cloneArray(){
        int[] arrayCopia = new int[array.length];
        for(int i = 0; i < array.length; i++){
            arrayCopia[i] = array[i];
        }
        return arrayCopia;
    }
    
    public boolean addPos(int pos, int elem){
        boolean ris = false;
        if(array.length > pos){
            ris = true;
            if(array.length <= dimL){
                ensureCapacity(1);
            }
            int cont = dimL-1;
            while (cont >= pos){
                array[cont+1] = array[cont];
                cont--;
            }
            dimL++;
            array[pos] = elem;
        }
        return ris;
    }
    
    public void ensureCapacity(int minCapacity){
        int[] arrayCopia = new int[minCapacity + array.length];
        for(int i = 0; i < array.length; i++){
            arrayCopia[i] = array[i];
        }
        array = arrayCopia;
    }
    
    public String stampa(){
        String p = "La dimensione logica è: " + dimL + "\n";
        for(int i = 0; i < array.length; i++)
            p += "\n" + "vett[" + i + "]" + " = " + array[i];
        
        return p;
    } 
    

}
