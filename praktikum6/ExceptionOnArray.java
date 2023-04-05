/*
Nama file: ExceptionOnArray.java
Deskripsi:  main file
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 5 April 2023
 */
public class ExceptionOnArray {
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}