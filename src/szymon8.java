public class szymon8 {
    public static void main(String[] args) {
        double ankieta = 12467;
        double energetyk= 0.14;
        double smakcytrynowy=0.64;
        double jedennapojtygodniowo=ankieta*energetyk;
        double jedenenergetykcytrynowy=ankieta*smakcytrynowy;
        System.out.println("wypisz przybliżoną liczbę ankietowanych osób, które kupują przynajmniej jeden napój\n" +
                "energetyczny tygodniowo: " + jedennapojtygodniowo);
        System.out.println("wypisz przybliżoną liczbę ankietowanych osób, które preferują napoje energetyczne o\n" +
                "smaku cytrusowym: " + jedenenergetykcytrynowy);

    }
}
