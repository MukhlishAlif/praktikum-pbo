/*
Nama file: Manajer.java
Deskripsi: subclass dari Pegawai , Manajer
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 9 Mei 2023
 */
public class Manajer extends Pegawai{
    private int tunjangan=700000;
    public Manajer(String nama){
        setNama(nama);
    }public void TampilData(){
        super.TampilData();
        System.out.println("Bonus :"+this.tunjangan);
    }
}
