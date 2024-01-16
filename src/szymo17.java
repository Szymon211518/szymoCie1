import java.util.Scanner;

public class szymo17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println( "Czy któraś z osob jest na diecie wegańskiej?: ");
        String dieta1 =klawiatura.nextLine();
        System.out.println( "Czy któraś z osob jest na diecie wegetarjańskiej?: ");
        String dieta2 =klawiatura.nextLine();
        System.out.println( "Czy któraś z osob jest na diecie bezglutenowej?: ");
        String dieta3 =klawiatura.nextLine();
        if(dieta1.equals("tak") & dieta2.equals("tak") & dieta3.equals("tak")){
            System.out.println( "Czy któraś z osob jest na diecie wegańskiej?: " + dieta1);
            System.out.println( "Czy któraś z osob jest na diecie wegetarjańskiej?: " + dieta2);
            System.out.println( "Czy któraś z osob jest na diecie bezglutenowej?: " + dieta3);
            System.out.println("Możecie iść do kawiarnia na rogu lub kuchnia u szefa: ");
        }
        else if(dieta1.equals("tak") & dieta2.equals("nie") & dieta3.equals("tak")){
            System.out.println( "Czy któraś z osob jest na diecie wegańskiej?: " + dieta1);
            System.out.println( "Czy któraś z osob jest na diecie wegetarjańskiej?: " + dieta2);
            System.out.println( "Czy któraś z osob jest na diecie bezglutenowej?: " + dieta3);
            System.out.println("Możecie iść do pizzeri przy Dworcowej: ");
        }
        else if(dieta1.equals("tak") & dieta2.equals("nie") & dieta3.equals("nie")){
            System.out.println( "Czy któraś z osob jest na diecie wegańskiej?: " + dieta1);
            System.out.println( "Czy któraś z osob jest na diecie wegetarjańskiej?: " + dieta2);
            System.out.println( "Czy któraś z osob jest na diecie bezglutenowej?: " + dieta3);
            System.out.println("Możecie iść do Włoskiej Specjały: ");
        }
        else if(dieta1.equals("nie") & dieta2.equals("nie") & dieta3.equals("nie")){
            System.out.println( "Czy któraś z osob jest na diecie wegańskiej?: " + dieta1);
            System.out.println( "Czy któraś z osob jest na diecie wegetarjańskiej?: " + dieta2);
            System.out.println( "Czy któraś z osob jest na diecie bezglutenowej?: " + dieta3);
            System.out.println("Możecie iść do Luksusowe burgery u Jarka: ");
        }
        else{
            System.out.println( "Czy któraś z osob jest na diecie wegańskiej?: " + dieta1);
            System.out.println( "Czy któraś z osob jest na diecie wegetarjańskiej?: " + dieta2);
            System.out.println( "Czy któraś z osob jest na diecie bezglutenowej?: " + dieta3);
            System.out.println("Nic nie mozemy ci polecic:( ");
        }

    }
}
