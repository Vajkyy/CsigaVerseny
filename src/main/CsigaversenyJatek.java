package main;

public class CsigaversenyJatek {

    private String fogadottSzin;
    private Csiga[] csiga;
    private int korokSzama;
    private String nyertes;

    public CsigaversenyJatek(String fogadottSzin, Csiga[] csiga, int korokSzama) {
        this.fogadottSzin = fogadottSzin;
        this.csiga = csiga;
        this.korokSzama = korokSzama;
        this.nyertes = "";
    }

    public void futtatas() {
        for (int kor = 1; kor <= korokSzama; kor++) {
            System.out.println("Kör " + kor);
            for (Csiga csiga : this.csiga) {
                csiga.haladas();
                System.out.println(csiga.getSzinKonzol() + csiga.getSzinKep() + " pozíciója: " + csiga.getPozicio() + "\u001B[0m");
            }
        }
    }

    public String eredmeny() {
        Csiga nyertesCsiga = csiga[0];
        for (int i = 1; i < csiga.length; i++) {
            if (csiga[i].getPozicio() > nyertesCsiga.getPozicio()) {
                nyertesCsiga = csiga[i];
            }
        }
        this.nyertes = nyertesCsiga.getSzin();
        System.out.println("A nyertes csiga színe: " + nyertes);
        return nyertes.equals(fogadottSzin) ? "Gratulálunk! Nyertél!" : "Sajnáljuk, veszítettél.";
    }
}
