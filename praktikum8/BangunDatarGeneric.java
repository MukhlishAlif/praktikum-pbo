/*
Nama file: BangunDatarGeneric.java
Deskripsi: generic bangun datar
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 30 Mei 2023
*/
public class BangunDatarGeneric<Test extends BangunDatar>{

    private Test bangunDatar;
    
    public void set(Test tipeBangundatar){
        bangunDatar = tipeBangundatar;
    }
    public Test get(){
        return bangunDatar;
    }
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

//ketika mengubah karakter 'T' menjadi 'Test' tidak akaan mempengaruhi output, Karakter yang diubah hanya sebagai variabel
