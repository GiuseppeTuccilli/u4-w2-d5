package giuseppetuccilli.entities;

import giuseppetuccilli.Enums.Generes;
import giuseppetuccilli.Enums.Platforms;

public class VideoGioco extends Gioco {
    private int durata;
    private Platforms piattaforme;
    private Generes genere;

    public VideoGioco(int id, String titolo, int anno, double prezzo, int durata, Platforms piattaforme, Generes genere) {
        super(id, titolo, anno, prezzo);
        this.durata = durata;
        this.piattaforme = piattaforme;
        this.genere = genere;

    }

    public void setDurata(int d) {
        this.durata = d;
    }

    public void setPiattaforme(Platforms p) {
        this.piattaforme = p;
    }

    public void setGenere(Generes g) {
        this.genere = g;
    }


    @Override
    public String toString() {
        return "VideoGioco{" +
                "durata=" + durata +
                ", piattaforme=" + piattaforme +
                ", genere=" + genere +
                ", id='" + id + '\'' +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo=" + prezzo + '\'' +
                "} ";
    }
}
