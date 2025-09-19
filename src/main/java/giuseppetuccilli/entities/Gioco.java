package giuseppetuccilli.entities;

import java.util.UUID;

public abstract class Gioco {
    protected String id = UUID.randomUUID().toString();
    protected String titolo;
    protected int annoPubblicazione;
    protected double prezzo;

    public Gioco(String titolo, int anno, double prezzo) {
        this.titolo = titolo;
        this.annoPubblicazione = anno;
        this.prezzo = prezzo;
    }

    public double getPrice() {
        return this.prezzo;
    }

    public String getId() {
        return this.id;
    }

    public void setTitolo(String t) {
        this.titolo = t;
    }

    public void setPrezzo(double p) {
        this.prezzo = p;
    }

    public void setAnnoPubblicazione(int a) {
        this.annoPubblicazione = a;
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
