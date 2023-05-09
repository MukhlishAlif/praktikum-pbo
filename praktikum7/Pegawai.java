/*
Nama file: Pegawai.java
Deskripsi: class file Pegawai
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 9 Mei 2023
 */
public class Pegawai {
    private String nama;
    private int gajiPokok=5000000;

    public void setNama(String nama){
        this.nama=nama;
    }
    public void TampilData(){
        System.out.println("nama : "+this.nama+ " gaji pokok : "+this.gajiPokok);
    }
    
}
