import java.util.Scanner;

public class szymon1 {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);
        System.out.println("Wypisz kilometry");
     double kilometry = klawiatura.nextDouble();
        System.out.println("Wypisz litry paliwa");
     double litry = klawiatura.nextDouble();
     System.out.println("Wypisz kilometry" + kilometry/litry);
       ;

    }
}
