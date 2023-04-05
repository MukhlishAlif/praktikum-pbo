/*
Nama file: Asersi2.java
Deskripsi: class file asersi 2 dan class lingkaran
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 5 April 2023
 */
class Lingkaran {

    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {

    public static void main(String args[]) {

        double jariJari = 5;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("kelieling lingkaran = " + kelilingLingkaran);
    }
}
//Pertanyaan 
//secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 

//Jawab
//Terdapat kode yang kurang tepat pada class Asersi2, jari-jari seharusnya jari-jari>0 tetapi jari-jari!= 0 karna
