import java.util.Scanner;

public class szymo9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Waga");
        double waga = klawiatura.nextDouble();
        System.out.println("Km");
        double Km = klawiatura.nextDouble();
        if(waga<=1)
        {
            double koszt1= (Km/500)*1.1;
            System.out.println("koszt wynosi: " + koszt1);
        }
        if(waga<=1 && waga==3)
        {
            double koszt1 = (Km/500)*2.2;
            System.out.println("koszt wynosi: " + koszt1);
        }
        if(waga<=1 && waga==5)
        {
            double koszt1= (Km/500)*3.7;
            System.out.println("koszt wynosi: " + koszt1);
        }
        if(waga>5)
        {
            double koszt1= (Km/500)*3.8;
            System.out.println("koszt wynosi: " + koszt1);
        }
    }
}
