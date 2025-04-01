package main;

import java.util.Scanner;

public class JatekIndito {

    public static void main(String[] args) {
        Csiga[] csigak = {new Csiga("piros", "🐌", "Piros", 1), new Csiga("kék", "🐌", "Kék", 1), new Csiga("zöld", "🐌", "Zöld", 1)};
        System.out.print("Tippelj (piros, kék, zöld): ");
        Scanner scanner = new Scanner(System.in);
        String fogadottSzin = scanner.nextLine();
        CsigaversenyJatek jatek = new CsigaversenyJatek(fogadottSzin, csigak, 10);
        jatek.futtatas();
        System.out.println(jatek.eredmeny());
    }
}
