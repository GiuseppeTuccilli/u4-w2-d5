package giuseppetuccilli.entities;

public class GiocoTavolo extends Gioco {
    private int numGiocatori;
    private int minDurata;

    public GiocoTavolo(String titolo, int anno, double prezzo, int giocatori, int minDurata) {

        super(titolo, anno, prezzo);
        if (giocatori < 2 || giocatori > 10) {
            throw new RuntimeException("il num di giocatori deve essere tra 2 e 10");
        }
        this.numGiocatori = giocatori;
        this.minDurata = minDurata;

    }

    public int getNumGiocatori() {
        return this.numGiocatori;
    }

    @Override
    public String toString() {
        return "GiocoTavolo{" +
                "numGiocatori=" + numGiocatori +
                ", minDurata=" + minDurata +
                ", prezzo=" + prezzo +
                ", annoPubblicazione=" + annoPubblicazione +
                ", titolo='" + titolo + '\'' +
                ", id='" + id + '\'' +
                "} " +
                "} ";
    }
}
