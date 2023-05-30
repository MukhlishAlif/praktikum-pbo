/*
Nama file: ArrayListTest.java
Deskripsi: array list class
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 30 Mei 2023
*/
import java.util.*;

public class ArrayListTest {

    public static void main(String[] args) {
       
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("ini");
        strings.add("adalah");
        strings.add("string");
        strings.remove("adalah");
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}
