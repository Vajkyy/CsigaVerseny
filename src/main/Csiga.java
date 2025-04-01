package main;

public class Csiga {

    private String szin;
    private String szinKep;
    private String szinKonzol;
    private int sebesseg;
    private int pozicio;

    private static final String PIROS = "\u001B[31m";
    private static final String KEK = "\u001B[34m";
    private static final String ZOLD = "\u001B[32m";
    private static final String ALAP = "\u001B[0m";

    public Csiga(String szin, String szinKep, String szinKonzol, int sebesseg) {
        this.szin = szin;
        this.szinKep = szinKep;
        this.szinKonzol = getSzinKonzol(szin);
        this.sebesseg = sebesseg;
        this.pozicio = 0;
    }

    private String getSzinKonzol(String szin) {
        switch (szin) {
            case "piros":
                return PIROS;
            case "kék":
                return KEK;
            case "zöld":
                return ZOLD;
            default:
                return ALAP;
        }
    }

    public String getSzinKonzol() {
        return szinKonzol;
    }

    public String getSzinKep() {
        return szinKep;
    }

    public void haladas() {
        int eredetiSebesseg = sebesseg;
        sebesseg = (int) (Math.random() * 10);

        if (Math.random() < 0.2) {
            sebesseg *= 2;
            System.out.print("⚡⚡⚡⚡ ");
        }
        pozicio += sebesseg;
        sebesseg = eredetiSebesseg;
    }

    public String getSzin() {
        return szin;
    }

    public int getSebesseg() {
        return sebesseg;
    }

    public int getPozicio() {
        return pozicio;
    }
}
