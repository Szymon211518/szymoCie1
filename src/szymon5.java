import java.util.Scanner;

public class szymon5 {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);
        System.out.println("Wyspisz swoje ulubine miasto");
        String ulubionemiasto =klawiatura.nextLine();
        System.out.println(ulubionemiasto.length());
        System.out.println(ulubionemiasto.toLowerCase());
        System.out.println(ulubionemiasto.toUpperCase());
        char pierwszalitera = ulubionemiasto.charAt(0);
        System.out.println(ulubionemiasto.charAt(0));
    }
}
