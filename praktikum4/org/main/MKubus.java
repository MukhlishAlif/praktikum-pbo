/*
Nama file: MKubus.java
Deskripsi: main kubus file
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 22 maret 2023
 */
package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {

    public static void main(String[] args) {
        BujurSangkar bujursangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujursangkar);

        BujurSangkar bujurSangkar2 = new BujurSangkar(18);
        Kubus kubus2 = new Kubus(bujurSangkar2);

        System.out.println("Luas Alas Kubus: " + kubus.hitungLuasAlas());
        System.out.println("Volume Kubus: " + kubus.hitungVolume());

        System.out.println("Luas Alas Kubus: " + kubus2.hitungLuasAlas());
        System.out.println("Volume Kubus: " + kubus2.hitungVolume());
    }

}
