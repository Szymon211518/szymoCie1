import java.util.Scanner;

public class szymo8 {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);
        System.out.println("Podaj liczbe pakietow");
        double pak1= klawiatura.nextDouble();
        double cennik1=pak1*99;
        if(pak1>=10&& pak1<19)
        {
            double rab1=cennik1*0.2;
            double canal = cennik1-rab1;
            System.out.println("promocja-20%: "+ rab1 );
            System.out.println("cena po rabacie: " + cennik1);
        }
        if (pak1>20 && pak1<49)
        {
            double rab2=cennik1*0.3;
            double cennik2 = cennik1-rab2;
            System.out.println("promocja-30%: "+ rab2 );
            System.out.println("cena po rabacie: " + cennik2);
        }
        if (pak1>50 && pak1<99)
        {
            double rab3=cennik1*0.4;
            double cennik3 = cennik1-rab3;
            System.out.println("promocja-40%: "+ rab3 );
            System.out.println("cena po rabacie: " + cennik3);
        }
        if (pak1>100)
        {
            double rab4=cennik1*0.5;
            double cennik4 = cennik1-rab4;
            System.out.println("promocja-50%: "+ rab4 );
            System.out.println("cena po rabacie: " + cennik4);
        }
    }
}
