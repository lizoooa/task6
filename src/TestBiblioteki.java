public class TestBiblioteki {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Wiedźmin", 1990, "xxx", 320);
        Ksiazka k2 = new Ksiazka("Lód", 2007, "Dukaj", 1050);
        Film f1 = new Film("Zielona Mila", 1999, "Darabont", 189);
        Film f2 = new Film("Incepcja", 2010, "Nolan", 148);

        MediaBiblioteczne[] media = { k1, k2, f1, f2 };

        for (MediaBiblioteczne m : media) {
            m.wyswietlInformacje();
            System.out.println();
        }

        k1.wypozycz();
        k1.wypozycz();
        k1.zwroc();

        k1.sprawdzLiczbeStron();
        f1.sprawdzCzasTrwania();

        for (MediaBiblioteczne m : media) {
            if (m instanceof Ksiazka) {
                ((Ksiazka) m).sprawdzLiczbeStron();
            } else if (m instanceof Film) {
                ((Film) m).sprawdzCzasTrwania();
            }
        }
    }
}
