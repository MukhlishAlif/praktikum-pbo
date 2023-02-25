/*
Nama file: Titik.java
Deskripsi: Class titik beserta setter dan getter
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 25 Februari 2023
*/

class Titik{
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik(){
		counterTitik++;
	}

	void SetAbsis(double a){
		absis=a;
	}
	void SetOrdinat(double o){
		ordinat=o;
	}
	double getAbsis(){
		return absis;
	}
	double getOrdinat(){
		return ordinat;
	}
	static int getCounterTitik(){
		return counterTitik;
	}
}
