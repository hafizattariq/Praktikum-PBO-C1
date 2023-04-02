/**
 * Lingkaran.java 02/04/2023
 * Penulis : M. Hafiz Attariq
 * Deskripsi : kelas implementasi IArea berupa
 *             cara menghitung luas lingkaran
 */

import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    public double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI * jejari * jejari;
    }
}
