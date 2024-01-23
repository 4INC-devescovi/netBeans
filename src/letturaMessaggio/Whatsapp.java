/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package letturaMessaggio;

/**
 *
 * @author riki and jack
 */
public class Whatsapp extends LetturaMessaggio{

    public Whatsapp(String testo) {
        super(testo);
    }

    private String convertiEmoji(char emoji){
        String t = "";
        switch(Character.hashCode(emoji)){
            case 9786:
                t = "faccina bianca che sorride";
                break;
            case 9787:
                t = "faccina nera che sorride";
                break;
            case 9829:
                t = "cuori";
                break;
            case 9830:
                t = "quadri";
                break;
            case 9827:
                t = "fiori";
                break;
            case 9824:
                t = "picche";
                break;
            case 8226:
                t = "punto";
                break;
            case 9688:
                t = "quadrato nero con quadrato bianco al centro";
                break;
            case 9675:
                t = "cerchio";
                break;
            case 9689:
                t = "cerchio con sfondo nero";
                break;
            case 9794:
                t = "genere maschile";
                break;
            case 9792:
                t = "genere femminile";
                break;
            case 9834:
                t = "nota singola";
                break;
            case 9835:
                t = "nota doppia";
                break;
            case 9788:
                t = "sole";
                break;
            default:
                t = Character.toString(emoji);
        }
        return t;
    }
    
    @Override
    public String leggiTesto(){
        String t = "";
        String testo = getTesto();
        for(int i = 0; i < testo.length(); i++){
            if(Character.hashCode(testo.charAt(i)) > 255)
                t += convertiEmoji(testo.charAt(i));
            else
                t += testo.charAt(i);
        }
        return t;
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
    
}
