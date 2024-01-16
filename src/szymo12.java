import java.util.Scanner;

public class szymo12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj imie 1");
        String imie1 = klawiatura.nextLine();
        System.out.println("Podaj pierwszy czas: ");
        double czas1 = Double.parseDouble(klawiatura.nextLine());
        System.out.println("Podaj imie 2");
        String imie2 = klawiatura.nextLine();
        System.out.println("Podaj drugi czas: ");
        double czas2 = Double.parseDouble(klawiatura.nextLine());
        System.out.println("Podaj imie 3");
        String imie3 = klawiatura.nextLine();
        System.out.println("Podaj trzeci czas: ");
        double czas3 = Double.parseDouble(klawiatura.nextLine());
        if (czas1<czas2 && czas2<czas3){
            System.out.println(" miejsce 1: "+imie1 + " miejsce 2: " + imie2 + " miejsce 3: " + imie3);
        }
        else if(czas1<czas2 && czas2>czas3){
            System.out.println(" miejsce  1: "+imie1 + " miejsce 2: "+ imie3 +" miejsce 3: "+ imie2);
        }
        else if(czas1<czas2 && czas1>czas3){
            System.out.println(" miejsce 1: " + imie2 + "  miejsce 2: "+ imie1 + " miejsce 3: "+ imie3);
        }
        else if(czas3<czas2 && czas1>czas2){
            System.out.println(" miejsce 1: "+imie3 + " miejsce 2: "+ imie1 + " miejsce 3: "+ imie2);
        }
        else if(czas3<czas2 && czas2>czas1){
            System.out.println(" miejsce 1: " + imie2 + " miejsce 2: "+ imie2 + " miejsce 3: " + imie1);
        }
    }
}
