/*
Nama file: BujurSangkar.java
Deskripsi: bujur sangkar class file
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 22 maret 2023
 */
package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {

    private double panjangSisi;

    public BujurSangkar(double panjangSisi) {
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas() {
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi() {
        return this.panjangSisi;
    }
}
