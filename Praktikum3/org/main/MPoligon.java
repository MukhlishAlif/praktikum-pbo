/*
Nama file: MPoligon.java
Deskripsi: Main Poligon
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 15 maret 2023
 */
package org.main;
import org.bangundatar.*;
public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        Segitiga seg = new Segitiga(4,6,3);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
        seg.printInfo();
        System.out.println("Luas Persegi Panjang : "+seg.hitungLuas());
    }
}
