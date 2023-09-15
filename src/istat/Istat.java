package istat;
public class Istat {
    private String[] reg;
    private double[] latte;
    private double[] pane;
    
    public Istat(String[] reg, double[] latte, double[] pane){
        this.reg = copiaString(reg);
        this.latte = copiaDouble(latte);
        this.pane = copiaDouble(pane);
    }
    
    public String stampa(){
        String t = "";
        for(int i = 0; i < reg.length - 1; i++)
            t += "\n" + reg[i] + ":  latte = " + latte[i] + "  -  pane = " + pane[i];
        return t;
    }
    
    private double[] copiaDouble(double[] vIn){
        double[] vOut = new double[vIn.length];
        for(int i = 0; i < vIn.length; i++){
            vOut[i] = vIn[i];
        }
        return vOut;
    }
    
    
    private String[] copiaString(String[] vIn){
        String[] vOut = new String[vIn.length];
        for(int i = 0; i < vIn.length; i++){
            vOut[i] = vIn[i];
        }
        return vOut;
    }
    
    private String format(double num){
        return String.format("%.2f", num);
    }
    
    public String maggiore(){
        double posPaneMagg = pane[0];
        double posLatteMagg = latte[0];
        String risLatte = "";
        String risPane = "";
        for(int i = 1; i < reg.length; i++){
            if(posLatteMagg < latte[i]){
                posLatteMagg = latte[i];
                risLatte = reg[i] + " - latte: " + format(posLatteMagg);
            }
            else if(posLatteMagg == latte[i]){
                risLatte += "\n" + reg[i] + " - latte: " + format(posLatteMagg);
            }
            if(posPaneMagg < pane[i]){
                posPaneMagg = pane[i];
                risPane = reg[i] + " - pane: " + format(posPaneMagg);
            }
            else if(posPaneMagg == pane[i]){
                risPane += "\n" + reg[i] + " - pane: " + format(posPaneMagg);
            }
        }
        return risLatte + "\n" + risPane;
    }
            
}
