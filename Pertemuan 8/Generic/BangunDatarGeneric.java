/**
 * Nama : M. Hafiz Attariq
 * File : BangunDatarGeneric.java 17/05/2023
 * Deskripsi : Kelas konstruksi generic untuk BangunDatar
 */

package Generic;

public class BangunDatarGeneric<P5 extends BangunDatar> {
    private P5 bangunDatar;

    public void set(P5 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public P5 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

/**Dalam kode di atas, T diganti dengan P5. Kita membuat
 * parameter generic baru yang masih terikat oleh pembatasan.
 * Namun sekarang kita menyebutnya dengan P5. Pergantian
 * karakter seperti ini hanya mempengaruhi nama parameter
 * generic yang digunakan dalam kelas BangunDatarGeneric*/
