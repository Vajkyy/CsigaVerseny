package main;

import java.util.Random;

public class Csiga {

    private String szin;
    private int sebesseg;
    private int pozicio;
    private static final Random RND = new Random();

    public Csiga(String szin, int sebesseg, int pozicio) {
        this.szin = szin;
        this.sebesseg = sebesseg;
        this.pozicio = pozicio;
    }

    public String szinKod() {
        return switch (szin.toLowerCase()) {
            case "piros" -> "#FF0000";
            case "kék" -> "#0000FF";
            case "zöld" -> "#008000";
            default -> "#000000"; // !!!
        };
    }

    public void haladas() {
        int eredetiSebesseg = sebesseg;
        if (RND.nextInt(100) < 20) { // 20% esély boostra
            sebesseg += 1;            
        }
        pozicio += sebesseg;
        sebesseg = eredetiSebesseg; // A boost csak erre a körre érvényes
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
