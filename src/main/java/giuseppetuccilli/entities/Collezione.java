package giuseppetuccilli.entities;

import giuseppetuccilli.Enums.Generes;
import giuseppetuccilli.Enums.Platforms;

import java.util.*;
import java.util.stream.Collectors;

public class Collezione {
    private ArrayList<Gioco> collezione = new ArrayList<>();

    public void aggiungi(Gioco g) {
        this.collezione.add(g);
    }

    public List<Gioco> ricercaPrezzo(double p) {
        return this.collezione.stream().filter(gioco -> gioco.getPrice() <= p).toList();
    }

    public List<Gioco> ricercaNumGiocatori(int n) {
        return this.collezione.stream().filter(gioco -> gioco instanceof GiocoTavolo)
                .filter(gioco -> ((GiocoTavolo) gioco).getNumGiocatori() == n).toList();
    }

    @Override
    public String toString() {
        return "Collezione{" +
                "collezione=" + collezione +
                '}';
    }

    public void elimina(int id) {
        boolean found = false;
        Iterator<Gioco> iter = this.collezione.iterator();
        while (iter.hasNext()) {
            Gioco g = iter.next();
            if (g.getId() == id) {
                iter.remove();
                found = true;
            }
        }
        if (!found) {
            System.out.println("elemnto non trovato");
        }
    }

    public void modVideoGioco(VideoGioco g, String t, int a, double p, int dur, Platforms plat, Generes gen) {
        g.setDurata(dur);
        g.setPiattaforme(plat);
        g.setGenere(gen);
        g.setTitolo(t);
        g.setAnnoPubblicazione(a);
        g.setPrezzo(p);
    }

    public void modGiocoTavolo(GiocoTavolo g, String t, int a, double p, int m, int numP) {
        g.setTitolo(t);
        g.setAnnoPubblicazione(a);
        g.setPrezzo(p);
        g.setMinDurata(m);
        g.setNumGiocatori(numP);

    }

    public Gioco find(int id) {
        Gioco element = null;
        Iterator<Gioco> iter = this.collezione.iterator();
        while (iter.hasNext()) {
            Gioco g = iter.next();
            if (g.getId() == id) {
                element = g;
            }
        }
        return element;
    }

    public void Stats() {
        System.out.println("Statistiche della collezione:");
        List<Gioco> videos = this.collezione.stream().filter(gioco -> gioco instanceof VideoGioco).toList();
        List<Gioco> tavolos = this.collezione.stream().filter(gioco -> gioco instanceof GiocoTavolo).toList();
        System.out.println("numero videogiochi: " + videos.size());
        System.out.println("numero giochi da tavolo: " + tavolos.size());
        List<Gioco> exepnsive = this.collezione.stream().sorted(Comparator.comparing(Gioco::getPrice).reversed()).toList();
        System.out.println("gioco più costoso: " + exepnsive.getFirst());
        OptionalDouble med = OptionalDouble.of(this.collezione.stream().collect(Collectors.averagingDouble(g -> g.getPrice())));
        System.out.println("media dei prezzi: " + med);

    }
}
