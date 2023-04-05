/*
Nama file: Asersi1.java
Deskripsi: class file asersi 1
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 5 April 2023
 */
public class Asersi1 {

    public static void main(String args[]) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
