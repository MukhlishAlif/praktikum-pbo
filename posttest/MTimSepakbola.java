/*
Nama file: TimSepakbola.java
Deskripsi: Main timsepakbola
pembuat: Muhammad Alif Mukhlish - 24060121120001
Tgl Pembuatan: 15 maret 2023
 */

class MTimSepakbola {
  public static void main(String[] args) {
    // TODO: Make an instance called 'liverpool' -> use constructor which you have made before
    
    // TODO: Make an instance called 'manchesterUnited' -> use constructor which you have made before
    TimSepakbola Liverpool;
    TimSepakbola ManUnited;
    Liverpool=new TimSepakbola("Liverpool");
    ManUnited=new TimSepakbola("ManUnited");
    
    Liverpool.startTandingBola(ManUnited);

    

    // TODO: call startTandingBola()
		

		// Assume that liverpool wins against manchesterUnited 7 - 0
    for (int i = 0; i < 7; i++) {
  		Liverpool.goal();

			// TODO: Replace [SKOR LIVERPOOL] and [SKOR MANCHESTERUNITED] with the correct METHOD
			// Code below should produce the output "Skor sementara: Liverpool 7 - 0 Manchester United"
			System.out.println("Skor sementara: " + Liverpool.nama + " " + Liverpool.skor + " - " + ManUnited.skor + " " + ManUnited.nama);
    }

		// TODO: call endTandingBola()
    Liverpool.endTandingBola(ManUnited);
		
  }
}

/* 
Expected output:

Pertandingan antara Liverpool dan Manchester United dimulai!

Skor sementara: Liverpool 1 - 0 Manchester United
Skor sementara: Liverpool 2 - 0 Manchester United
Skor sementara: Liverpool 3 - 0 Manchester United
Skor sementara: Liverpool 4 - 0 Manchester United
Skor sementara: Liverpool 5 - 0 Manchester United
Skor sementara: Liverpool 6 - 0 Manchester United
Skor sementara: Liverpool 7 - 0 Manchester United

Pertandingan antara Manchester United dan Liverpool selesai!
*/
