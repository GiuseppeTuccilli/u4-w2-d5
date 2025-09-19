package giuseppetuccilli;

import giuseppetuccilli.Enums.Generes;
import giuseppetuccilli.Enums.Platforms;
import giuseppetuccilli.entities.Collezione;
import giuseppetuccilli.entities.GiocoTavolo;
import giuseppetuccilli.entities.VideoGioco;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int nId = 5;
        String op = "";
        int numOp = 0;
        String title;
        int year = 0, dur = 0;
        double price = 0;
        String choosePlat = "";
        Platforms plat = null;
        String genChhose = "";
        Generes gen = null;
        int numPl = 0;

        Scanner scanner = new Scanner(System.in);

        VideoGioco prova = new VideoGioco(3, "titolo", 2005, 70, 30, Platforms.PC, Generes.OpenWorld);
        VideoGioco prova2 = new VideoGioco(4, "titolo2", 2007, 40, 30, Platforms.PC, Generes.OpenWorld);
        GiocoTavolo tav1 = new GiocoTavolo(1, "tav1", 1991, 50, 3, 60);
        GiocoTavolo tav2 = new GiocoTavolo(2, "tav2", 1991, 50, 5, 60);
        System.out.println(prova);

        Collezione coll = new Collezione();
        coll.aggiungi(prova);
        coll.aggiungi(prova2);
        coll.aggiungi(tav1);
        coll.aggiungi(tav2);

        while (true) {
            op = "";
            System.out.println("Collezione giochi (Videogiochi + giochi da tavolo)");
            System.out.println("inserire 1 per aggiungere un nuovo videogioco alla collezione");
            System.out.println("inserire 2 per aggiungere un nuovo gioco da tavolo alla collezione");
            System.out.println("inserire 3 per cercare un gioco in base all'id");
            System.out.println("inserire 4 per cercare giochi in base al prezzo massimo");
            System.out.println("inserire 5 per cercare giochi in base al numero di giocatori");
            System.out.println("inserire 6 per eliminare un gioco in base all'id");
            System.out.println("inserire 7 per modificare un gioco in base all'id");
            System.out.println("inserire 8 per le statistiche della collezione");
            System.out.println("inserire q per terminare");
            op = scanner.nextLine();
            if (op.equals("q")) {
                break;
            }

            try {
                numOp = Integer.parseInt(op);
                if (numOp < 1 || numOp > 8) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException e) {
                System.out.println("input non valido");
            }

            switch (numOp) {
                case 1:
                    nId++;
                    System.out.println("inserire il titolo");
                    title = scanner.nextLine();
                    System.out.println("inserire l'anno");
                    try {
                        year = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("input non valido");
                        break;
                    }
                    System.out.println("inserire il prezzo");
                    try {
                        price = Double.parseDouble(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("input non valido");
                        break;
                    }
                    System.out.println("inserire la durata");
                    try {
                        dur = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("input non valido");
                        break;
                    }
                    System.out.println("seleziona la piattaforma: (1 per PC; 2 per PS5; 3 per Xbox)");
                    choosePlat = scanner.nextLine();
                    try {
                        if (!choosePlat.equals("1") && !choosePlat.equals("2") && !choosePlat.equals("3")) {
                            throw new Exception("input non valido");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    if (choosePlat.equals("1")) {
                        plat = Platforms.PC;
                    } else if (choosePlat.equals("2")) {
                        plat = Platforms.PS5;
                    } else if (choosePlat.equals("3")) {
                        plat = Platforms.XBOX;
                    }
                    System.out.println("seleziona il genere: (1 per RPG; 2 per OpenWorld; 3 per Platform)");
                    genChhose = scanner.nextLine();
                    try {
                        if (!genChhose.equals("1") && !genChhose.equals("2") && !genChhose.equals("3")) {
                            throw new Exception("input non valido");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    if (genChhose.equals("1")) {
                        gen = Generes.RPG;
                    } else if (genChhose.equals("2")) {
                        gen = Generes.OpenWorld;
                    } else if (genChhose.equals("3")) {
                        gen = Generes.Platform;
                    }
                    coll.aggiungi(new VideoGioco(nId, title, year, price, dur, plat, gen));
                    System.out.println(coll.getCollezione());
                    break;
                case 2:
                    nId++;
                    System.out.println("inserire il titolo");
                    title = scanner.nextLine();
                    System.out.println("inserire l'anno");
                    try {
                        year = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("input non valido");
                        break;
                    }
                    System.out.println("inserire il prezzo");
                    try {
                        price = Double.parseDouble(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("input non valido");
                        break;
                    }
                    System.out.println("inserire la durata (minuti)");
                    try {
                        dur = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("input non valido");
                        break;
                    }
                    System.out.println("inserire il numero di giocatori");
                    try {
                        numPl = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("input non valido");
                        break;
                    }
                    coll.aggiungi(new GiocoTavolo(nId, title, year, price, numPl, dur));
                    System.out.println(coll.getCollezione());
                    break;
                case 3:
                    int idSearch = 0;
                    System.out.println("inserire l'id da cercare");
                    try {
                        idSearch = Integer.parseInt(scanner.nextLine());
                        try {
                            System.out.println(coll.cercaId(idSearch));
                        } catch (Exception e) {
                            System.out.println("id non trovato");
                        }
                    } catch (RuntimeException e) {
                        System.out.println("input non valido");
                    }
                    break;
                case 4:
                    double maxP = 0;
                    System.out.println("inserire il prezzo massimo");
                    try {
                        maxP = Double.parseDouble(scanner.nextLine());
                        if (!coll.ricercaPrezzo(maxP).isEmpty()) {
                            System.out.println(coll.ricercaPrezzo(maxP));
                        } else {
                            System.out.println("nessun elemento trovato");
                        }

                    } catch (RuntimeException e) {
                        System.out.println("input non valido");
                    }
                    break;
                case 5:


            }
        }


    }
}
