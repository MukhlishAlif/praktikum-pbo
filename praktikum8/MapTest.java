/*
Nama file: MapTest.java
Deskripsi: hash map class
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 30 Mei 2023
*/
import java.util.*;

public class MapTest {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"satu");
        map.put(2,"dua");
        //System.out.println(map.get(2));
        Collection<String> keys=map.values();
        for (String key:keys){
            System.out.println(key);
        }
    }
}
