package classe;

import java.util.Objects;


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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + nome.hashCode();
        hash = 83 * hash + cognome.hashCode();
        return hash;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Studente other = (Studente) obj;
        if (!this.nome.equals(other.nome)) {
            return false;
        }
        return this.cognome.equals(other.cognome);
    }

    
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); 
    }

    @Override
    protected Studente clone() throws CloneNotSupportedException {
        return (Studente) super.clone();
    }   
}