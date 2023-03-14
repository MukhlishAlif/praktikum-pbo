/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
/*
Nama file: Segitiga.java
Deskripsi: segitiga class file
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 15 maret 2023
 */
package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double sisi,tinggi;
    
    public Segitiga(double sisi, double tinggi, int jumlahSisi){
        this.sisi=sisi;
        this.tinggi=tinggi;
        this.jumlahSisi=jumlahSisi;
    }
    public double hitungLuas(){
        return  sisi*tinggi/2;
    }
    public void printInfo(){
        System.out.println("Bangun Segitiga bersisi "+this.getJumlahSisi());
    }
    
}
