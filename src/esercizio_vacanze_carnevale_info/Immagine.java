package Esercizio_vacanze_carnevale_info;

public class Immagine extends DatoMultimediale implements Visibile {
    private int luminosita;

    public Immagine(String titolo, int luminosita) throws Exception{
        super(titolo);
        setLuminosita(luminosita);
    }

    public void setLuminosita(int luminosita) throws Exception {
        if (luminosita < 0) {
            throw new Exception("La luminosita non può essere minore di zero");
        } else if (luminosita > 100) {
            throw new Exception("La luminosita non può essere maggiore di cento");
        } else {
            this.luminosita = luminosita;
        }
    }

    public int getLuminosita() {
        return luminosita;
    }

    @Override
    public void schiarisci() throws Exception {
        if (luminosita == 100) {
            throw new Exception("La luminosita non può andare oltre il cento");
        } else  {
            luminosita++;
        }
    }

    @Override
    public void scurisci() throws Exception {
        if (luminosita == 0) {
            throw new Exception("La luminosita non può andare sotto lo zero");
        } else  {
            luminosita--;
        }
    }

    @Override
    public String mostra() {
        return super.getTitolo() + asterischi();
    }

    private String asterischi() {
        String r = "";
        for (int  i = 0; i < luminosita; i++) {
            r += "*";
        }
        return r;
    }

    @Override
    public String toString() {
        return "Immagine{" + "luminosita=" + luminosita + '}';
    }
    
}