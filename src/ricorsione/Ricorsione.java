/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ricorsione;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author rikid
 */
public class Ricorsione {
    
    //#################### MCM ####################//
    
    public static Integer mcm(String numeri){
        String[] numeriArr = numeri.split(",");
        Integer[] num = new Integer[numeriArr.length];
        for(int i = 0; i < numeriArr.length; i++)
            num[i] = Integer.parseInt(numeriArr[i]);
        Arrays.sort(num, Collections.reverseOrder());
        return calcMcm(num[0], num);
        
    }
    
    private static Integer calcMcm(int num, Integer[] arr){
        if(divisibileMcm(num, arr))
            return num;
        else
            return calcMcm(num + arr[0], arr);
    }
    
    private static boolean divisibileMcm(int num, Integer[] arr){
        for(int i = 0; i < arr.length; i++)
            if (num % arr[i] != 0)
                return false;
        return true;
    }
    
    //#################### MCD ####################//
    
    public static Integer MCD(String numeri){
        String[] numeriArr = numeri.split(",");
        Integer[] num = new Integer[numeriArr.length];
        for(int i = 0; i < numeriArr.length; i++)
            num[i] = Integer.parseInt(numeriArr[i]);
        Arrays.sort(num);
        return calcMCD(num[0], num);
        
    }
    
    private static Integer calcMCD(int num, Integer[] arr){
        if(divisibileMCD(num, arr))
            return num;
        else
            return calcMCD(num - 1, arr);
    }
    
    private static boolean divisibileMCD(int num, Integer[] arr){
        for(int i = 0; i < arr.length; i++)
            if (arr[i] % num != 0)
                return false;
        return true;
    }
    
    //#################### BinToDec ####################//
    
    public static Integer convBinToDec(String num){
        if(num.length() == 1)
            return Integer.parseInt(num);
        else
            return pow(2, num.length() - 1) * Integer.parseInt(num.substring(0, 1)) + convBinToDec(num.substring(1));
    }
    
    private static Integer pow(Integer base, Integer p){
        if(p < 1)
            return 1;
        else
            return base*pow(base, p - 1);
    }
    
    //#################### DecToBin ####################//
    
    public static String convDecToBin(Integer numero) {
        if (numero < 2) {
            return numero + "";
        } else {
            return convDecToBin(numero / 2) + numero % 2;
        }
    }
}
