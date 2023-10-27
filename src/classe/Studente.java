package classe;

public class Studente {
    
    private String cognome;
    private String nome;

    public Studente(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        
    }

    public void setNome(String nome) throws Exception {
        if(!nome.isEmpty()){
            if(Character.isUpperCase(nome.))
            for(int i = 0; i < nome.length(); i++){
                
            }
        } else {
            throw new Exception("Il nome non può essere vuoto");
        }
    }
    
    
}
