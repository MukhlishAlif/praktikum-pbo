/*
Nama file: Titik.java
Deskripsi: Titik class file
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 7 maret 2023
*/
class Titik {

    private double absis;
    private double ordinat;
    private static int counterTitik;
    //inisiasi titik dan counter titik
    Titik() {
        absis = 0.0;
        ordinat = 0.0;
        counterTitik++;
    }
    //membuat titik dengan absis a dan ordinat o
    Titik(double a, double o) {
        absis = a;
        ordinat = o;
        counterTitik++;
    }
    //setting absis titik
    public void setAbsis(double a) {
        absis = a;
    }
    //setting ordinat titik
    public void setOrdinat(double o) {
        ordinat = o;
    }
    //mendapatkan nilai absis titik
    public double getAbsis() {
        return absis;
    }
    //mendapatkan nilai ordinat titik
    public double getOrdinat() {
        return ordinat;
    }
    //menghitung jumlah titik yang terbuat
    public static int getCounterTitik() {
        return counterTitik;
    }

}
