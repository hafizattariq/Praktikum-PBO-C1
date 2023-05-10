/**
 * Pegawai.java 10/05/2023
 * Penulis : M. Hafiz Attariq
 */

public class Pegawai {
    String nama;
    int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : "+nama + ", Gaji Pokok : " + gajiPokok);
    }
}