import java.util.Scanner;

public class szymo2 {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);
        System.out.println("dzień");
        int dni =klawiatura.nextInt();
        System.out.println("miesiąc");
        int miesiac = klawiatura.nextInt();
        System.out.println("2ostatnie cyfry roku");
        int rok = klawiatura.nextInt();


        int data;
        data =dni*miesiac;
        if(data==rok){
            System.out.println("madżik data");
        }
        else
            System.out.println("nie madżik data");
    }
}
