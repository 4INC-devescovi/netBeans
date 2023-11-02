package classe;

public class ClasseMain {

    public static void main(String[] args) {
        Studente test = null;
        Studente test1 = null;
        Studente test2 = null;
        Studente test3 = null;
        try{
            test = new Studente("Giacomo Antonio", "Calo'");
            test1 = new Studente("Gianluca", "Fortarel");
            test2 = new Studente("Luca", "Goller");
            test3 = new Studente("Danilo", "Telch");
            
            Studente[] st = {test, test1, test2};
            Classe cl = new Classe (test1, st);
            System.out.println(cl);
        }catch(Exception e){
            System.err.println(e);
        }
    }
}