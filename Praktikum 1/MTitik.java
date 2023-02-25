/*
Nama file: MTitik.java
Deskripsi: Main Class titik
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 25 Februari 2023
*/

class MTitik{
	
	public static void main(String[] args){
		Titik t1;
		Titik t2;
		Titik t3;
		t1=new Titik();
		t2=new Titik();
		t3=new Titik();
		t1.SetAbsis(1);
		t1.SetOrdinat(2);
		t2.SetAbsis(3);
		t2.SetOrdinat(4);
		t3.SetAbsis(5);
		t3.SetOrdinat(6);
		System.out.println("counter titik = "+t3.getCounterTitik());
		System.out.println("t1("+t1.getAbsis()+","+t1.getOrdinat()+")");
		System.out.println("t2("+t2.getAbsis()+","+t2.getOrdinat()+")");
		System.out.println("t3("+t3.getAbsis()+","+t3.getOrdinat()+")");

	}
	
}