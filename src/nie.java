import java.util.Scanner;

public class nie {
    public static void main(String[] args) {
        String pierwsze = "firstName";
        String drugie = "middleName";
        String trzecie = "lastName";


        Scanner klawiatura =new Scanner(System.in);


        System.out.println("firstName");
        String firstName = klawiatura.nextLine();
        klawiatura.nextLine();



        System.out.println("middleName");
        String middleName = klawiatura.nextLine();
        klawiatura.nextLine();




        System.out.println("lastName");
        String lastName = klawiatura.nextLine();
        klawiatura.nextLine();

        char inicjal = firstName.charAt(0);
        char inicjal2 = middleName.charAt(0);
        char inicjal3 = lastName.charAt(0);

        System.out.println("inicjały: ");
        System.out.println("Imie: " + inicjal );
        System.out.println("drugie imie: " + inicjal2 );
        System.out.println("nazwisko: " + inicjal3 );

    }
}
