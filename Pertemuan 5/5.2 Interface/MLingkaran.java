/**
 * MLingkaran.java 02/04/2023
 * Penulis : M. Hafiz Attariq
 * Deskripsi : implementasi cara menghitung luas lingkaran
 */

public class MLingkaran {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(10.2);
        System.out.println("Luas lingkaran dengan jejari " + l.jejari + " adalah " + l.hitungLuas());
    }
}
