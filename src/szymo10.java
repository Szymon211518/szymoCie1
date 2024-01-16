import java.util.Scanner;

public class szymo10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("kalorie");
        System.out.println("gramy tluszczu w produkcie");
        double gramytluszczu = klawiatura.nextDouble();
        double kalorie =klawiatura.nextDouble();
        double kalorieztluszczu =gramytluszczu * 9;

        if(kalorieztluszczu > kalorie){
            System.out.println("Nieprawidłowe");
        }

        if(kalorieztluszczu * 0.3 > kalorie){
            System.out.println("Produkt niskotłuszczowy" + gramytluszczu);
        }
        else {
            System.out.println("Wysoko tłuszczowe" + kalorieztluszczu);
        }
    }
}
