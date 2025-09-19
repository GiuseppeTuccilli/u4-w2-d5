package giuseppetuccilli.entities;

import giuseppetuccilli.Enums.Generes;
import giuseppetuccilli.Enums.Platforms;

public class VideoGioco extends Gioco {
    private int durata;
    private Platforms piattaforme;
    private Generes genere;

    public VideoGioco(String titolo, int anno, double prezzo, int durata, Platforms piattaforme, Generes genere) {
        super(titolo, anno, prezzo);
        this.durata = durata;
        this.piattaforme = piattaforme;
        this.genere = genere;

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
