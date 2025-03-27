package main;

public class CsigaversenyJatek {

    private String fogadottSzin;
    private Csiga[] csiga;
    private int korokSzama = 5;
    private String nyertes;

    public CsigaversenyJatek(String fogadottSzin, Csiga[] csiga, int korokSzama, String nyertes) {
        this.fogadottSzin = fogadottSzin;
        this.csiga = csiga;
        this.korokSzama = korokSzama;
        this.nyertes = nyertes;
    }

    public void fogadas(String szin) {

    }

    public String eredmeny() {
        return "";
    }

    public String getFogadottSzin() {
        return fogadottSzin;
    }

    public Csiga[] getCsiga() {
        return csiga;
    }

    public int getKorokSzama() {
        return korokSzama;
    }

    public String getNyertes() {
        return nyertes;
    }

    public void setFogadottSzin(String fogadottSzin) {
        this.fogadottSzin = fogadottSzin;
    }

    public void setKorokSzama(int korokSzama) {
        this.korokSzama=korokSzama;
    }

    public void setNyertes(String nyertes) {
        this.nyertes = nyertes;
    }

    public void setCsiga(Csiga[] csiga) {
        this.csiga = csiga;
    }

}
