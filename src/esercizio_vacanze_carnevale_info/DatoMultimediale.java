package Esercizio_vacanze_carnevale_info;

public abstract class DatoMultimediale {
    private String titolo;

    public DatoMultimediale(String titolo) throws Exception {
        setTitolo(titolo);
    }   

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) throws Exception {
        if (titolo == null) {
            throw new Exception("Il titolo non può essere null");
        } else if (titolo.isBlank()) {
            throw new Exception("Il titolo non può essere vuoto o contenere solo spazi");
        } else {
            this.titolo = titolo;
        }
    }



    @Override
    public String toString() {
        return "DatoMultimediale{titolo: " + titolo + "}";
    }
}