/*
Nama file: MOperasiTitik.java
Deskripsi: Main Operasi Titik
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 7 maret 2023
 */
class MOperasiTitik {

    public static void main(String[] args) {
        Titik p = new Titik(4.0, 4.0);
        OperasiTitik op = new OperasiTitik();

        System.out.println("Titik(" + p.getAbsis() + "," + p.getOrdinat() + ")");

        op.refleksiX(p);
        System.out.println("setelah refleksi sb X: Titik(" + p.getAbsis() + "," + p.getOrdinat() + ")");

        op.refleksiY(p);
        System.out.println("setelah refleksi sb Y: Titik(" + p.getAbsis() + "," + p.getOrdinat() + ")");

    }
}
