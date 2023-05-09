/*
Nama file: Programmer.java
Deskripsi: subclass dari Pegawai , Programmer
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 9 Mei 2023
 */
public class Programmer extends Pegawai{

    private int bonus=450000;
    public Programmer(String nama){
        setNama(nama);
    }public void TampilData(){
        super.TampilData();
        System.out.println("Bonus :"+this.bonus);
    }
}
