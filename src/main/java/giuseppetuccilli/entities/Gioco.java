package giuseppetuccilli.entities;

import java.util.UUID;

public class Gioco {
    protected String id = UUID.randomUUID().toString();
    protected String titolo;
    protected int annoPubblicazione;
    protected double prezzo;

    public Gioco(String titolo, int anno, double prezzo) {
        this.titolo = titolo;
        this.annoPubblicazione = anno;
        if (prezzo <= 0) {
            throw new RuntimeException("il prezzo deve essere maggiore di 0");
        }
        this.prezzo = prezzo;
    }

    public double getPrice() {
        return this.prezzo;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                        ", titolo='" + titolo + '\'' +
                        ", annoPubblicazione=" + annoPubblicazione +
                        ", prezzo=" + prezzo
                ;
    }
}
