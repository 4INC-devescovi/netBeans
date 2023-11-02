package classe;

public class Studente {
    private String nome;
    private String cognome;
    
    public Studente(String nome , String cognome)throws Exception{
        setNome(nome);
        setCognome(cognome);
    }
    
    public Studente(Studente studente){
        nome = studente.nome;
        cognome = studente.cognome;
    }
    
    public final void setNome(String nome)throws Exception{
        this.nome = ctrNome(nome);
    }

    public final void setCognome(String cognome) throws Exception{
        this.cognome = ctrNome(cognome);
    }
    
    private String ctrNome(String nome)throws Exception{
        nome = nome.trim();
        try{
            if(nome.isEmpty()){
                throw new Exception("inserire un nome");
            }else{
                for(int i=0 ; i<nome.length() ; i++){
                    if(!(Character.isLetter(nome.charAt(i))
                            ||Character.isSpaceChar(nome.charAt(i))
                                ||nome.charAt(i)== '\''
                                ) ){
                        throw new Exception("il nome deve contenere solo lettere");
                    }
                }
            }
        }catch(Exception e){
            throw e;
        }
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    @Override
    public String toString() {
        return "nome:"+nome+"  cognome:"+cognome;
    }
    
}