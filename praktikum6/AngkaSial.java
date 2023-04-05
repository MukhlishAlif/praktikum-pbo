/*
Nama file: AngkaSial.java
Deskripsi: class file AngkaSial
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 5 April 2023
 */
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + "bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka !!!");
        }
    }

}
//Pertanyaan 
//Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 

//Jawab
//Diperlukannya AngkaSialException yang merupakan turunan dari class exception. Karena ketika dijalankan tidak bisa dieksekusi
