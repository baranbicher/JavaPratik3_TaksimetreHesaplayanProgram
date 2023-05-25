import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double km, mino = 2.20, hesap;

        Scanner tm = new Scanner(System.in);

        System.out.print("Km Yazın: ");
        km = tm.nextDouble();

        hesap = (km * mino) + 10;
        hesap = hesap <= 20 ?  20 : hesap ;
        System.out.println("TaksiMetre Ücreti: " + hesap);
    }
}