/*
Nama File   : Garis.java
Deskripsi   : Berisi atribut dan method dalam class Garis
Pembuat     : Muhammad Akmal Fazli Riyadi
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

    // mengembalikan titik awal garis
    public Titik getTitikAwal() {
        return this.TAwal;
    }
    
    // mengembalikan titik akhir garis
    public Titik getTitikAkhir() {
        return this.TAkhir;
    }
    
    // mengembalikan banyaknya garis
    public int getCounterTitik() {
        return counterGaris;
    }

    // mengubah titik awal garis
    public void setTitikAwal(Titik T) {
        this.TAwal = T;
    }
    
    // mengubah titik akhir garis
    public void setTitikAkhir(Titik T) {
        this.TAkhir = T;
    }

    // mengembalikan panjang garis
    public double getPanjangGaris() {
        return getTitikAwal().getJarak(getTitikAkhir());
    }

    // mengembalikan gradien garis
    public double getGradien() {
        return Math.abs(getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat()) 
        / Math.abs(getTitikAkhir().getAbsis() - getTitikAwal().getAbsis());
    }
    
    // mengembalikan titik tengah garis
    public Titik getTitikTengah() {
        double absisTengah = (getTitikAwal().getAbsis() + getTitikAkhir().getAbsis()) / 2;
        double ordinatTengah = (getTitikAwal().getOrdinat() + getTitikAkhir().getOrdinat() / 2);
        return new Titik(absisTengah, ordinatTengah);
    }

    // mengecek apakah 2 garis sejajar
    public boolean isSejajar(Garis GLain) {
        return getGradien() == GLain.getGradien();
    }
    
    // mengecek apakah 2 garis tegak lurus
    public boolean isTegakLurus(Garis GLain) {
        return getGradien() * GLain.getGradien() == -1;
    }

    // menampilkan titik awal dan titik akhir garis
    public void printGaris() {
        getTitikAwal().printTitik();
        getTitikAkhir().printTitik();
    }

    // menampilkan persamaan garis
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = TAwal.getOrdinat() - (m * TAwal.getAbsis());
        if (c > 0) {
            return "y = " + m + "x + " + c;
        }
        else if (c < 0) {
            return "y = " + m + "x + " + c;
        }
        else {
            return "y = " + m + "x";
        }
    }
} // end class garis
