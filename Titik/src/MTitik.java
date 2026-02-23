/*
Nama File   : MTitik.java
Deskripsi   : Berisi atribut dan method dalam class Titik
Pembuat     : Muhammad Akal Fazli Riyadi
Tanggal     : 22/02/2026
*/
public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        T1.setAbsis(3); // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // Mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // Mencetak koordinat T1 ke layar
        T1.geser(3,4); // Menggeser T1 sejauh (3,4)
        T1.printTitik(); // Mencetak koordinat T1 ke layar
        
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik();

        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah objek Titik = " + T3.getCounterTitik());
    }
}
