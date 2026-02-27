/*
Nama File   : MTitik.java
Deskripsi   : Berisi atribut dan method dalam class Titik
Pembuat     : Muhammad Akal Fazli Riyadi
Tanggal     : 22/02/2026
*/
public class MTitik {
    public static void main(String[] args) {
        // Konstruktor tanpa parameter
        Titik T1 = new Titik();
        System.out.println("T1 awal:");
        T1.printTitik();

        // setAbsis(), setOrdinat(), getAbsis(), getOrdinat()
        T1.setAbsis(3);
        T1.setOrdinat(4);
        System.out.println("T1 setelah setAbsis & setOrdinat: (" + T1.getAbsis() + "," + T1.getOrdinat() + ")");

        // geser()
        T1.geser(2, -1);
        System.out.println("T1 setelah geser(2, -1):");
        T1.printTitik();

        // getKuadran(), getJarakPusat()
        System.out.println("Kuadran T1 = " + T1.getKuadran());
        System.out.println("Jarak T1 ke pusat = " + T1.getJarakPusat());

        // Konstruktor dengan parameter
        Titik T2 = new Titik(-2, 5);
        System.out.println("T2:");
        T2.printTitik();

        // getJarak(Titik)
        System.out.println("Jarak T1 ke T2 = " + T1.getJarak(T2));

        // refleksiX() dan refleksiY() (mengubah objek saat ini)
        T1.refleksiX();
        System.out.println("T1 setelah refleksiX:");
        T1.printTitik();

        T1.refleksiY();
        System.out.println("T1 setelah refleksiY:");
        T1.printTitik();

        // getRefleksiX() dan getRefleksiY() (membuat objek baru)
        Titik RX = T2.getRefleksiX();
        Titik RY = T2.getRefleksiY();

        System.out.println("Refleksi T2 terhadap sumbu X (objek baru):");
        RX.printTitik();

        System.out.println("Refleksi T2 terhadap sumbu Y (objek baru):");
        RY.printTitik();

        // getCounterTitik()
        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());

    }
}
