public class TestBiblioteki {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("eeee", 3333, "xxx", 333);
        Ksiazka k2 = new Ksiazka("ddd", 3442, "ffe", 1050);
        Film f1 = new Film("Zzz", 1999, "zz", 189);
        Film f2 = new Film("lll", 347, "lll", 148);

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
