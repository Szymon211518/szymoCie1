import java.util.Scanner;

public class szymo6 {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);
        System.out.println("podaj liczbe sekund: ");
        double czas = klawiatura.nextDouble();
        double dni =0;
        double min =0;
        double sek =0;
        double godz =0;
        if(czas >=86400){
            dni =czas /86400;
        }
        else if(czas>=3600){
            godz = czas/3600;
        }
        else if(czas>=60){
             min =czas/60;
        }
        else{
            sek=czas;
        }
        System.out.println("dni: " + dni);
        System.out.println("godz: " + godz);
        System.out.println("min: " + min);
        System.out.println("sek: " + sek);

    }
}
