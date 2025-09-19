package giuseppetuccilli.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    public void elimina(String id) {
        boolean found = false;
        Iterator<Gioco> iter = this.collezione.iterator();
        while (iter.hasNext()) {
            Gioco g = iter.next();
            if (g.getId().equals(id)) {
                iter.remove();
                found = true;
            }
        }
        if (!found) {
            System.out.println("elemnto non trovato");
        }


    }
}
