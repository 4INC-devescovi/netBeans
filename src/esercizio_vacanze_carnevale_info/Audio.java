package Esercizio_vacanze_carnevale_info;

public class Audio extends DatoMultimediale{
    private int volume;
    private int durata;
    
    public Audio(String titolo, int volume, int durata) throws Exception {
        super(titolo);
        setVolume(volume);
        setDurata(durata);
    }


    public void setVolume(int volume) throws Exception {
        if (volume < 0) {
            throw new Exception("Il volume non può essere negativo");
        } else if (volume > 100) {
            throw new Exception("Il volume non può assumere valori maggiori di cento");
        } else {
            this.volume = volume;
        }
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() +  " Audio{volume: " + volume + "}";
    }

    public String play() {
        String ris = "";
        int cont = 0;
        while (cont < durata) {
            ris += super.getTitolo() + puntiEsclamativi();
            cont++;
        }
        return ris;
    }

    public void alza() throws Exception {
        if (volume == 100) {
            throw new Exception("Il volume non può superare cento");
        } else {
            volume++;
        }
    }

    public void abbassa() throws Exception {
        if (volume == 0) {
            throw new Exception("Il volume non può scendere sotto lo zero");
        } else {
            volume--;
        }
    }

    private String puntiEsclamativi() {
        String r = "";
        for (int i = 0; i < volume; i++) {
            r += "!";
        }
        return r;
    }

    public void setDurata(int durata) throws Exception{
        if (durata <= 0) {
            throw new Exception("La durata non può essere minore uguale a zero"); 
        } else {
            this.durata = durata;
        }
    }

    public int getDurata() {
        return durata;
    }
}