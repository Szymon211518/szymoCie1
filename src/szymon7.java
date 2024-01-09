public class szymon7 {
    public static void main(String[] args) {
        double akcjakcje = 600;
        double ceni =21.77;
        double prowizja = 0.02;
        double costam =600*21.77;
        double podatek= costam*0.02;
        double cenazpodatkiem=podatek+costam;
        System.out.println("kwota zaplacona za same akcje: " + costam);
        System.out.println("kwota zaplacona za podatek: " + podatek);
        System.out.println("kwota łaczna: " + cenazpodatkiem);
    }
}
