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
        Map<String, String> mhsMap = new HashMap<>(); 
        mhsMap.put("24060121120001", "Muhammad Alif Mukhlish"); 
        mhsMap.put("24060121130045", "Farhan Adka Reynaldi");
        mhsMap.put("24060121140165", "Nanda Farrel Chevalerie");
        mhsMap.put("24060121140141", "Muhammad Afiat Yulianto");
 
        mhsMap.forEach((nim, nama) -> System.out.println(nim+" - "+nama)); 
    } 
}