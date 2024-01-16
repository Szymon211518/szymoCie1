import java.util.Scanner;

public class szymo13 {
    public static void main(String[] args){
            Scanner klawiatura = new Scanner(System.in);

            System.out.println("powietrze, woda lub stal: ");
            String sssss = klawiatura.nextLine();

            System.out.println("odleglosc: ");
            double odleglosc = klawiatura.nextDouble();

            switch(sssss){

                case "powietrze":
                    double czas = odleglosc/343;
                    System.out.println("Czas potrzebny na pokonanie dystansu w powietrzu to: "+ czas);
                    break;

                case "woda":
                    double czas1 = odleglosc/1490;
                    System.out.println("Czas potrzebny na pokonanie dystansu w wodzie to: "+ czas1);
                    break;

                case "stal":
                    double czas2 = odleglosc/5100;
                    System.out.println("Czas potrzebny na pokonanie dystansu w stali to: "+ czas2);
                    break;
                default:
                    System.out.println("Nieprawidłowe dane");
                    break;
            }
        }
    }


