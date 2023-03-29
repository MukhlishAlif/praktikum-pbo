/*
Nama file: BujurDatar.java
Deskripsi: Bangun datar class file
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 29 maret 2023
 */

public abstract class BangunDatar {

    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l) {
        luas = l;
    }

    public double getLuas() {
        return luas;
    }
}
