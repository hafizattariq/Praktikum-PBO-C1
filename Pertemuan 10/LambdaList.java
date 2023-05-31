/**
 * File: LambdaList.java
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai parameter
 *              pada method.
 * Nama : M. Hafiz Attariq
 * NIM : 24060121140174
 * Lab : C
 */
import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        mahasiswaList.forEach((nama) -> {
            System.out.println(nama);
        });
    }
}
