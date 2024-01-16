import java.util.Scanner;

public class szymo14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
            System.out.println("Wybierz pakiet A, B, C: ");
            System.out.println("• Pakiet A: Cena to 39,99 złotego miesięcznie, w tym 450 darmowych minut.\n" +
                    "Każda następna minuta kosztuje 0,45 złotego.\n" +
                    "• Pakiet B: Cena to 59,99 złotego miesięcznie, w tym 900 darmowych minut.\n" +
                    "Każda następna minuta kosztuje 0,40 złotego.\n" +
                    "• Pakiet C: Cena to 69,99 złotego miesięcznie, brak limitu minut.");
            String cos = klawiatura.nextLine();
            System.out.println("Podaj liczbe rozmów: ");
            double min = klawiatura.nextDouble();

            switch (cos){

                case "A":
                    System.out.println("Pakiet A: Cena to 39,99 złotego miesięcznie, w tym 450 darmowych minut.\n" +
                            "Każda następna minuta kosztuje 0,45 złotego");

                    double  cena=39.99 + (0.45*(min-450));
                    System.out.println("Cena za pakiet: "+ cena);
                    break;

                case "B":
                    System.out.println("Pakiet B: Cena to 59,99 złotego miesięcznie, w tym 900 darmowych minut.\n" +
                            "Każda następna minuta kosztuje 0,40 złotego.");


                    double  cena1=59.99 + (0.45*(min-900));
                    System.out.println("Cena za pakiet: "+ cena1);


                case "C":
                    System.out.println("Pakiet C: Cena to 69,99 złotego miesięcznie, brak limitu minut.");

                    double  cena2=69.99;
                    System.out.println("Cena za pakiet: "+ cena2);
                    break;
            }

        }
    }


