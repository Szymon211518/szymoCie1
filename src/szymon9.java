import java.util.Scanner;

public class szymon9 {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);
        System.out.println("Podaj liczbę cistek ktore chesz uzyskać: ");
        double ilosccistek = klawiatura.nextDouble();
        double szklankicukru =1.5*ilosccistek;
        double szklankamasla =1*ilosccistek;
        double szklankimaki =2.75*ilosccistek;
        System.out.println("szklanki cukru: " + szklankicukru + " szklanki masla: " + szklankamasla +" szklanki maki: " + szklankimaki);
    }
}
