/**
 * File      : MOperasiTitik.java		02/03/23
 * Penulis   : M. Hafiz Attariq
 * Deskripsi : Kelas yang berisi main dari OperasiTitik
 * 
 */

public class MOperasiTitik{

    public static void main(String[] args){
        Titik t = new Titik(4, 0);
        OperasiTitik o = new OperasiTitik();
        System.out.println("Titik : (" + t.getAbsis() +"," + t.getOrdinat()+ ")");
        o.refleksiSumbuX(t);
        System.out.println("Titik : (" + t.getAbsis() +"," + t.getOrdinat()+ ")");
        o.refleksiSumbuY(t);
        System.out.println("Titik : (" + t.getAbsis() +"," + t.getOrdinat()+ ")");

    }
}