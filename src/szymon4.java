import java.util.Scanner;

public class szymon4 {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);
        System.out.println("wypisz cene detaliczna: ");
        double cenadetaliczna = klawiatura.nextDouble();
        double marza = 0.4;

             double zysk = cenadetaliczna * marza;
             System.out.println("zysk: " + zysk);


    }
}
