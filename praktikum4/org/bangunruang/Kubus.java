/*
Nama file: Kubus.java
Deskripsi: kubus class file
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 22 maret 2023
 */
package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {

    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan) {
        this.permukaan = permukaan;
    }

    public double hitungVolume() {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi * panjangSisi;
    }

    public double hitungLuasAlas() {
        return permukaan.hitungLuas();
    }

}
