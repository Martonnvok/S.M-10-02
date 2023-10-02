package rokarudi;

import java.util.Scanner;

public class RokaRudi {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int vLap =  0;
        String lapok[];
        lapok = feltolt();
        for (int i = 0; i < 3; i++) {
            lapok(lapok);
            beolvasas(vLap);
            kever(vLap, lapok);
        }

        kiir(lapok);
    }

    private static String[] feltolt() {
        String lap[] = new String[24];
        String jelek[] = {"P", "T", "Z", "M"};
        String rSzamok[] = {"IX", "X", "VIII", "Felső", "Alsó", "Ász"};
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
                System.out.println(" |");
            }
            System.out.print("| " + lap[i]);

        }
    }

    private static int beolvasas(int vLap) {
        System.out.println("");
        do {
            System.out.print("Kérek egy oszlopot (1-3): ");
            vLap = sc.nextInt();
        } while (vLap >= 3 && vLap <= 1);

        return vLap;
    }

    private static String[] kever(int vLap, String lapok[]) {
        String ujLapok[] = new String[24];
        switch (vLap) {
            case 1:
                for (int i = 0; i < lapok.length; i++) {
                    ujLapok[i + 7] = lapok[20 - (i - 1) * 3];
                    ujLapok[i + 14] = lapok[19 - (i - 1) * 3];
                    ujLapok[i + 21] = lapok[21 - (i - 1) * 3];
                }

            case 2:
                for (int i = 0; i < lapok.length; i++) {
                    ujLapok[i + 7] = lapok[19 - (i - 1) * 3];
                    ujLapok[i + 14] = lapok[20 - (i - 1) * 3];
                    ujLapok[i + 21] = lapok[21 - (i - 1) * 3];
                }

            case 3:
                for (int i = 0; i < lapok.length; i++) {
                    ujLapok[i + 7] = lapok[21 - (i - 1) * 3];
                    ujLapok[i + 14] = lapok[19 - (i - 1) * 3];
                    ujLapok[i + 21] = lapok[20 - (i - 1) * 3];
                }

        }
        
        return ujLapok;

    }

    private static void kiir(String tomb[]) {
        System.out.println("Választott lap: " + tomb[10]);
    }

}
