/*
Nama file: MLingkaran.java
Deskripsi: Lingkarang main file
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 29 maret 2023
 */

import java.util.Scanner;

public class MLingkaran {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
    }
}
