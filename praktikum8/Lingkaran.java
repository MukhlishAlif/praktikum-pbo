/*
Nama file: Lingkaran.java
Deskripsi: sub class bangun datar, lingkaran
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 30 Mei 2023
 */
public class Lingkaran extends BangunDatar{

    private double jejari;
    public Lingkaran(double jejari){
        this.jejari=jejari;
    }
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
