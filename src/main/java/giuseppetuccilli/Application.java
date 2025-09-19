package giuseppetuccilli;

import giuseppetuccilli.Enums.Generes;
import giuseppetuccilli.Enums.Platforms;
import giuseppetuccilli.entities.Collezione;
import giuseppetuccilli.entities.GiocoTavolo;
import giuseppetuccilli.entities.VideoGioco;

public class Application {

    public static void main(String[] args) {

        VideoGioco prova = new VideoGioco("titolo", 2005, 70, 30, Platforms.PC, Generes.OpenWorld);
        VideoGioco prova2 = new VideoGioco("titolo2", 2007, 40, 30, Platforms.PC, Generes.OpenWorld);
        GiocoTavolo tav1 = new GiocoTavolo("tav1", 1991, 50, 3, 60);
        GiocoTavolo tav2 = new GiocoTavolo("tav2", 1991, 50, 5, 60);
        System.out.println(prova);

        Collezione coll = new Collezione();
        coll.aggiungi(prova);
        coll.aggiungi(prova2);
        coll.aggiungi(tav1);
        coll.aggiungi(tav2);

        System.out.println(coll.ricercaPrezzo(60));
        System.out.println(coll.ricercaNumGiocatori(5));

        coll.elimina(prova.getId());
        System.out.println(coll);


    }
}
