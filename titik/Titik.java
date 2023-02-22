    /* Nama File : titik.java
     * Nama : M. Hafiz Attariq
     * NIM : 24060121140174
     * Lab : PBO C1
     */

class Titik{
    double absis;
    double ordinat;
    static int counterTitik; //menghitung objek titik
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
    void setAbsis(double a){
        absis = a;
    }
    void setOrdinat(double o){
        ordinat = o;
    }
    double getAbsis(){
        return absis;
    }
    double getOrdinat(){
        return ordinat;
    }
    int getCounterTitik(){
        return counterTitik;
    }
    void cetakTitik(){
        System.out.println("Titik ("+absis+","+ordinat+")");
    }
}