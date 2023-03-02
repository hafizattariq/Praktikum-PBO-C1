/**
 * File      : OperasiTitik.java		02/03/23
 * Penulis   : M. Hafiz Attariq
 * Deskripsi : Kelas yang berisi class dari OperasiTitik
 * 
 */
public class OperasiTitik {
    double absis;
    double ordinat;

    public void refleksiSumbuX(Titik titik){
        double y;
        y = titik.getOrdinat();
        y = -1;
        titik.setOrdinat(y);
    }

    public void refleksiSumbuY(Titik titik){
        double x;
        x = titik.getAbsis();
        x = -1;
        titik.setAbsis(x);
    }
}