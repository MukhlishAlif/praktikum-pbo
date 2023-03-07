/*
Nama file: OperasiTitik.java
Deskripsi: Operasi Titik class file
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 7 maret 2023
 */
class OperasiTitik {
    //membuat refleksi ordinat terhadap absis
    private void refleksiSumbuX(Titik titik) {
        double ordinat = titik.getOrdinat();
        ordinat = ordinat * -1;
        titik.setOrdinat(ordinat);
    }
    //membuat refleksi absis terhadap ordinat
    private void refleksiSumbuY(Titik titik) {
        double absis = titik.getAbsis();
        absis = absis * -1;
        titik.setAbsis(absis);
    }
    //memanggil prosedur refleksiSumbuX
    public Titik refleksiX(Titik titik) {
        refleksiSumbuX(titik);
        return titik;
    }
    //memanggil prosedur refleksiSumbuY
    public Titik refleksiY(Titik titik) {
        refleksiSumbuY(titik);
        return titik;
    }
}
