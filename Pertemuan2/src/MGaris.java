/*
Nama File   : MGaris.java
Deskripsi   : Berisi aplikasi dalam class Garis
Pembuat     : Muhammad Akmal Fazli Riyadi
Tanggal     : 27/02/2026
*/

public class MGaris {
	public static void main(String[] args) {
		// Konstruktor tanpa parameter
		Garis g1 = new Garis();
		System.out.println("g1 (default):");
		g1.printGaris();

		// Konstruktor dengan parameter
		Titik a = new Titik(0, 0);
		Titik b = new Titik(4, 4);
		Garis g2 = new Garis(a, b);

		// getTitikAwal() dan getTitikAkhir()
		System.out.println("\nTitik awal g2:");
		g2.getTitikAwal().printTitik();
		System.out.println("Titik akhir g2:");
		g2.getTitikAkhir().printTitik();

		// setTitikAwal() dan setTitikAkhir()
		g2.setTitikAwal(new Titik(2, 1));
		g2.setTitikAkhir(new Titik(8, 7));
		System.out.println("\ng2 setelah set titik awal & akhir:");
		g2.getTitikAwal().printTitik();
		g2.getTitikAkhir().printTitik();

		// getPanjangGaris()
		System.out.println("\nPanjang g2 = " + g2.getPanjangGaris());

		// getGradien()
		System.out.println("Gradien g2 = " + g2.getGradien());

		// getTitikTengah()
		Titik tengah = g2.getTitikTengah();
		System.out.println("Titik tengah g2:");
		tengah.printTitik();

		// isSejajar() dan isTegakLurus()
		Garis g3 = new Garis(new Titik(1, 1), new Titik(3, 3));
		Garis g4 = new Garis(new Titik(0, 2), new Titik(2, 0));

		System.out.println("\ng2 sejajar g3? " + g2.isSejajar(g3));
		System.out.println("g2 tegak lurus g4? " + g2.isTegakLurus(g4));

		// printGaris()
		System.out.println("\nprintGaris g3:");
		g3.printGaris();

		// getPersamaanGaris()
		System.out.println("\nPersamaan g2: " + g2.getPersamaanGaris());
		System.out.println("Persamaan g3: " + g3.getPersamaanGaris());

		// getCounterTitik() (counter garis)
		System.out.println("\nJumlah objek Garis = " + g1.getCounterTitik());
	}
}
