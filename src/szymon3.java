import java.util.Scanner;

public class szymon3 {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);

        System.out.println("wprowadz wynik z testu");
        int wyniktestu1 = klawiatura.nextInt();

        System.out.println("wprowadz wynik z testu");
        int wyniktestu2 = klawiatura.nextInt();

        System.out.println("wprowadz wynik z testu");
        int wyniktestu3 = klawiatura.nextInt();

        System.out.println("ilosc napisanych testow: ");
        double iloscnapisanychtestow = klawiatura.nextDouble();
        double suma = wyniktestu1 + wyniktestu2 + wyniktestu3;
        double suma2 = suma/iloscnapisanychtestow;

        System.out.println("Srednia trzech testow" + suma2);

    }
}
