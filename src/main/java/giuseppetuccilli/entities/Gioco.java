package giuseppetuccilli.entities;

public abstract class Gioco {
    protected int id;
    protected String titolo;
    protected int annoPubblicazione;
    protected double prezzo;

    public Gioco(int id, String titolo, int anno, double prezzo) {
        this.id = id;
        this.titolo = titolo;
        this.annoPubblicazione = anno;
        this.prezzo = prezzo;
    }

    public double getPrice() {
        return this.prezzo;
    }

    public int getId() {
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
