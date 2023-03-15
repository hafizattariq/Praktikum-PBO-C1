/**
 * File : Poligon.java 15/03/2023
 * Penulis : M. Hafiz Attariq
 * Deskripsi : representasi dasar dari objek poligon (segi banyak)
*/

package org.poligon;

public class Poligon {
    protected int jumlahSisi;
    
    public Poligon(){
        this.jumlahSisi = 0;
    }

    public void setJumlahSisi(int jumlahSisi){
        this.jumlahSisi = jumlahSisi;
    }

    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
}
