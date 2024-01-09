import java.util.Scanner;

public class szymo5 {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);
        System.out.println("Masa");
        int masa = klawiatura.nextInt();
        double ciezar = masa * 9.8;
        if(ciezar >=1000){
            System.out.println("za ciezki: ");
        }
        else if (ciezar <=10){
            System.out.println("za lekki: ");
        }
        else if(ciezar > 10 && ciezar < 1000){
            System.out.println("ciezar odpowieni");
        }
    }
}
