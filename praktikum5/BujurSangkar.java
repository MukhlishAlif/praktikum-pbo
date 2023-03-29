/*
Nama file: BujurSangkar.java
Deskripsi: bujur sangkar class file
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 29 maret 2023
 */

public class BujurSangkar extends BangunDatar {

    public double hitungLuas(double sisi) {
        double luas = sisi * sisi;
        return luas;
    }
}
//Apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode
//abstrak yang ada pada kelas BangungDatar? jelaskan!

//akan terjadi error pada saat compile kerena BangunDatar merupakan abstrak
//yang didalam nya terdapat metoe yang harus diimplementasikan ke BujurSangkar
