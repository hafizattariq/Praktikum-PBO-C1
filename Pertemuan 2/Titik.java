    /* Nama File : titik.java
     * Nama : M. Hafiz Attariq
     * NIM : 24060121140174
     * Lab : PBO C1
     */

class Titik{
    private double absis;
    private double ordinat;
    private static int counterTitik; //menghitung objek titik
    Titik(double a, double o){
        counterTitik++;
        absis = a;
        ordinat = o;
    }
    Titik(){
        counterTitik++;
        absis = 0;
        ordinat = 0;
    }
    public void setAbsis(double a){
        absis = a;
    }
    public void setOrdinat(double o){
        ordinat = o;
    }
    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }
    public int getCounterTitik(){
        return counterTitik;
    }
    public void cetakTitik(){
        System.out.println("Titik ("+absis+","+ordinat+")");
    }
}