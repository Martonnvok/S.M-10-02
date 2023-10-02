package rokarudi;

import java.util.Scanner;

public class RokaRudi {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String lapok[] = new String[21];
        lapok = feltolt();
        int vLap = 0;
        for (int i = 0; i < 3; i++) {
            lapok(lapok);
            beolvasas(vLap);
            kever();
        }

        kiir();
    }

    private static String[] feltolt() {
        String lap[] = new String[21];
        String jelek[] = {"Piros", "Tök", "Zöld", "Makk"};
        String rSzamok[] = {"IX", "X", "VIII", "Felső", "Alsó"};
        int index = 0;
        for (int i = 0; i < jelek.length; i++) {
            for (int j = 0; j < rSzamok.length; j++) {
                lap[index++] = jelek[i] + "_" + rSzamok[j];
            }

        }
        return lap;
    }

    private static void lapok(String[] lap) {
        for (int i = 0; i < lap.length; i++) {
            if (i % 3 == 0) {
                System.out.println("");
            }
            System.out.print(lap[i] + ", ");
        }
    }

    private static void beolvasas(int vLap) {
        do {
            System.out.print("Kérek egy oszlopot (1-3): ");
            vLap = sc.nextInt();
        } while (vLap >= 3 && vLap <= 1);
       
    }

    private static void kever() {

    }

    private static void kiir() {

    }

}
