/**
 * MLingkaran2.java 02/04/2023
 * Penulis : M. Hafiz Attariq
 * Deskripsi : implementasi cara menghitung luas lingkaran
 *             dengan input jejari dari user   
 */

import java.util.Scanner;

public class MLingkaran2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai jejari lingkaran: ");
        double jejari = scanner.nextDouble();

        Lingkaran lingkaran = new Lingkaran(jejari);

        System.out.println("Luas lingkaran dengan jejari " + jejari + " adalah " + lingkaran.hitungLuas());
    }
}
