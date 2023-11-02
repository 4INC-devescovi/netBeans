package classe;

public class Classe {
    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti)throws Exception{
        this.studenti = new Studente[studenti.length];
        for (int i = 0; i < studenti.length; i++){
            this.studenti[i] = new Studente(studenti[i]); 
        }  
        setCapoClasse(capoClasse);
    }

    public void setCapoClasse(Studente capoClasse)throws Exception{
        try{
            int i = 0;
            while (!(capoClasse.getCognome().isEmpty() && capoClasse.getCognome().isEmpty())&& i<studenti.length){
                if (capoClasse.getNome().equals(studenti[i].getNome()) 
                        && studenti[i].getCognome().equals(studenti[i].getCognome())){
                    this.capoClasse= capoClasse;
                }
                i++;
            }
            
            if (this.capoClasse == null){
                throw new Exception("il capo classe non Ã¨ presente nella classe");
            }

        }catch(Exception e){
            throw e;
        }
    }

    // che fa il metodo inverti attributi
    
    @Override
    public String toString() {
        String r = "nome capo Classe: " + capoClasse + "\n";
        for (int i = 0; i < studenti.length; i++) {
            r += "studenti[" + i + "]:" + studenti[i].toString() + "\n";
        }
        return r;
    }
}