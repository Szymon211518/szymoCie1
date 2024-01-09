import java.util.Scanner;

public class szymo4 {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);
        System.out.println("Wprowadz trzy wyniki testu");
        int pierwszaocena = klawiatura.nextInt();
        int drugaocena = klawiatura.nextInt();
        int trzeciaocena = klawiatura.nextInt();
        double srednia;
        srednia = (pierwszaocena + drugaocena + trzeciaocena)/3;
        System.out.println("wynik pierwszego testu" + pierwszaocena);
        System.out.println("wynik drugiego testu" + drugaocena);
        System.out.println("wynik trzeciego testu" + trzeciaocena);
        System.out.println("wynik wszystkich testow" + srednia);
        if (srednia <=100 && srednia>=90) {
            System.out.println("ocena 5: ");
        }
        else if(srednia <=89 && srednia>=80){
            System.out.println("ocena 4: ");
        }
            else if(srednia <=79 && srednia>=70){
            System.out.println("ocena 3: ");
        }
            else if(srednia <=69 && srednia>=60){
            System.out.println("ocena 2: ");
        }
            else if(srednia >60){
            System.out.println("ocena 1");
        }
    }
}
