/*
Nama File   : Garis.java
Deskripsi   : Berisi atribut dan method dalam class Garis
Pembuat     : Muhammad Akal Fazli Riyadi
Tanggal     : 27/02/2026
*/

public class Garis {
    /* ATRIBUT */
    private Titik TAwal, TAkhir;
    static int counterGaris = 0;

    /* METHOD */
    // konstruktor tanpa parameter
    public Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    // konstruktor dengan parameter
    public Garis(Titik TAwal, Titik TAkhir) {
        this.TAwal = TAwal;
        this.TAkhir = TAkhir;
        counterGaris++;
    }

    public Titik getTitikAwal() {
        return this.TAwal;
    }

    public Titik getTitikAkhir() {
        return this.TAkhir;
    }

    public int getCounterTitik() {
        return counterGaris;
    }

    public void setTitikAwal(Titik T) {
        this.TAwal = T;
    }

    public void setTitikAkhir(Titik T) {
        this.TAkhir = T;
    }

    public double getPanjangGaris() {
        return getTitikAwal().getJarak(getTitikAkhir());
    }

    
}
