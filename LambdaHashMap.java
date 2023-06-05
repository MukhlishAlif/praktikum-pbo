/*
Nama file: LambdaHashMap.java
Deskripsi: hash map menggunakan lambda
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan:  5 Mei 2023
 */

import java.util.HashMap; 
import java.util.Map; 
 
public class LambdaHashMap{ 
    public static void main(String[] args){ 
        Map<String, String> mahasiswaMap = new HashMap<>(); 
        mahasiswaMap.put("24060121120001", "Muhammad Alif Mukhlish"); 
        mahasiswaMap.put("24060121130045", "Farhan Adka Reynaldi");
        mahasiswaMap.put("24060121140165", "Nanda Farrel Chevalerie");
        mahasiswaMap.put("24060121140141", "Muhammad Afiat Yulianto");
 
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim+" - "+nama)); 
    } 
}