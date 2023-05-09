/*
Nama file: PegawaiDanGaji.java
Deskripsi: main file PegawaiDanGaji
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 9 Mei 2023
 */
public class PegawaiDanGaji {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Programmer("Joko");
        Pegawai pegawai3 = new Programmer("Argo");
        
        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
        
    }
}
