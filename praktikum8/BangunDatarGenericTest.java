/*
Nama file: BangunDatarGenericTest.java
Deskripsi: main class bangun datar
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 30 Mei 2023
*/
public class BangunDatarGenericTest {

    public static void main(String args[]) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<>();
        bdg.set(l);
        System.out.println(bdg.hitungKeliling());
    }
}
