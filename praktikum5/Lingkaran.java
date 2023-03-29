/*
Nama file: Lingkaran.java
Deskripsi: Lingkaran class file impelementasi interface IArea
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 29 maret 2023
 */

import static java.lang.Math.PI;

class Lingkaran implements IArea {

    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}
