import java.util.Scanner;

public class szymon6 {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);
        System.out.println("Wprowadz cene posilku");
        double cenaposilku = klawiatura.nextDouble();
        double podatek = cenaposilku * 6.75;
        double napiwek = podatek * 0.2;
        double cenazawszystko = cenaposilku + napiwek +podatek;
        System.out.println("Cena posilku: " + cenaposilku);
        System.out.println("wartosc podatku: " + podatek);
        System.out.println("wartosc napiwku: " + napiwek);
    }
}
