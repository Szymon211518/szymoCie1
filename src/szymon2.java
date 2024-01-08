import java.util.Scanner;

public class szymon2 {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);
        int pudelko = 40;
        int porcje = 10;
        int kalorie = 300;
        System.out.println("wypisz ile ciastek zjadles");
        double zjedzoneciastka = klawiatura.nextDouble();
        int kaloriejednegociastka = 75;
        double jednociastko = klawiatura.nextDouble();
        double kcal = jednociastko*zjedzoneciastka;
        System.out.println("wypisz kcal " + kcal);

    }
}
