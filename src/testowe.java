import java.util.Scanner;

public class testowe {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);
        System.out.println("wypisz cene");
        double wartoscProduktu = klawiatura.nextDouble();
        double podatekStanowy = klawiatura.nextDouble() / 0.02;
        double podatekLokalny = klawiatura.nextDouble() / 0.04;
        double cenaProduktu = wartoscProduktu - podatekStanowy - podatekLokalny;
        System.out.println("Wartość: " + wartoscProduktu + "podatek Stanowy: " +podatekStanowy + "podatek lokalny: " + podatekLokalny);
    }
}
