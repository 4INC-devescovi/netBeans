package tipiGenerici;

/*

E   -> Tipo di un elemento in una raccolta (Collection)
K   -> Tipo di una chiave in una mappa (HashMap)
V   -> Tipo di valore in una mappa (HashMap)

*/

public class Box <T>{
    
    private T t;
    
    public Box(){}

    public Box(T t) {
        this.t = t;
    }
    
    public void setT(T t) throws Exception{
        if(t == null)
            throw new Exception("L'attributo non può essere null ");
        this.t = t;
    }

    @Override
    public String toString() {
        return t.toString();
    }
    
    public Class tipo(){
        return t.getClass();
    }
    
    static public <T> T verificaTipo(T valore){
        return (T)valore.getClass();
    }
    
    
}
