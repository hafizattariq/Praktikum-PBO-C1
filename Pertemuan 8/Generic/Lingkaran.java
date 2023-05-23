/**
 * Nama : M. Hafiz Attariq
 * File : Lingkaran.java 17/05/2023
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 */

package Generic;

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2 * Math.PI * jejari;
    }
}
