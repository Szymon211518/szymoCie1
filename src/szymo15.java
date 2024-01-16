import java.util.Scanner;

public class szymo15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbe czeko");
        double czeki = klawiatura.nextDouble();
         if (czeki<20)
         {
             double cena1 =(0.1* czeki)+10;
             System.out.println(" pierwsza cena: " + cena1);
         }
         else if (czeki>=20 && czeki<=39)
         {
             double cena2 =(0.08* czeki)+10;
             System.out.println(" druga cena: " + cena2);
         }
         else if (czeki>=40 && czeki<=59)
         {
             double cena3 =(0.06* czeki)+10;
             System.out.println(" trzecia cena: " + cena3);
         }
         else if (czeki>=60)
         {
             double cena4 =(0.04* czeki)+10;
             System.out.println(" czwarta cena: " + cena4);
         }
    }
}
