/**
 * Manajer.java 10/05/2023
 * Penulis : M. Hafiz Attariq
 */

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}