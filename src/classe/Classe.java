package classe;

public class Classe {
    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti){
        this.studenti = new Studente[studenti.length];
        for (int i = 0; i < studenti.length; i++){
            this.studenti[i] = new Studente(studenti[i]); 
        }  
        setCapoClasse(capoClasse);
    }

    public void setCapoClasse(Studente capoClasse) {
        this.capoClasse = capoClasse;
    }

    public void inveriAtt() throws Exception{
        String cognome = capoClasse.getNome();
        String nome = capoClasse.getCognome();
        capoClasse.setCognome(cognome);
        capoClasse.setNome(nome);

        for (int i = 0; i < studenti.length; i++) {
            cognome = studenti[i].getNome();
            nome = studenti[i].getCognome();
            studenti[i].setCognome(cognome);
            studenti[i].setNome(nome);
        }

    }
    
    public void ordinaStudenti() {
        int n = studenti.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (studenti[j].getCognome().compareTo(studenti[j + 1].getCognome()) > 0) {
                    Studente temp = studenti[j];
                    studenti[j] = studenti[j + 1];
                    studenti[j + 1] = temp;
                }
            }
        }
    }
    
    
    @Override
    public String toString() {
        String r = "nome capo Classe: " + capoClasse + "\n";
        for (int i = 0; i < studenti.length; i++) {
            r += "studenti[" + i + "]:" + studenti[i].toString() + "\n";
        }
        return r;
    }
}