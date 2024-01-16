import java.util.Scanner;

public class szymo16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("wpisz liczbe książek zakupi9onych w tym miesiacu: ");
        int ksiązki = klawiatura.nextInt();
        if(ksiązki==0){
            System.out.println("Dostajesz 0 punkty: ");
        }
        else if (ksiązki==1) {
            System.out.println("Dostajesz 5 punktów");
        }
        else if (ksiązki==2) {
            System.out.println("Dostajesz 15 punktów");
        }
        else if (ksiązki==3) {
            System.out.println("Dostajesz 30 punktów");
        }
        else if (ksiązki>=4 ) {
            System.out.println("Dostajesz 60 punktów");
        }
    }
}
