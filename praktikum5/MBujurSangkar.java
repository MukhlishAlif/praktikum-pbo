/*
Nama file: MBujurSangkar.java
Deskripsi: bujur sangkar main file
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 29 maret 2023
 */

import java.util.Scanner;

class MBujurSangkar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}
