/*
Nama File   : Titik.java
Deskripsi   : Berisi atribut dan method dalam class Titik
Pembuat     : Muhammad Akal Fazli Riyadi
Tanggal     : 22/02/2026
*/
public class Titik {
    /* ATRIBUT */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* METHOD */
    // konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // konstruktor untuk membuat titik dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // konstruktor untuk membuat titik (0,0)
    // Titik() {
    //     this(0,0);
    // }

    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru x
    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // mengembalikan nilai kuadran pada titik
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0) {
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else if (absis == 0 && ordinat == 0) {
            return 0;
        }
        else {
            return 4;
        }
    }
    
    // mengembalikan jarak titik ke pusat
    double getJarakPusat() {
        return Math.sqrt(Math.pow(absis,2) + Math.pow(ordinat,2));
    }

    double getJarak(Titik T) {
        double selisihAbsis = this.absis - T.absis;
        double selisihOrdinat = this.ordinat - T.ordinat;
        
        return Math.sqrt((selisihAbsis * selisihAbsis) + (selisihOrdinat * selisihOrdinat));
    }
} // end class Titik double getJarakPusat() {
