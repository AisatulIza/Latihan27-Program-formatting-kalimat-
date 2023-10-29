package pkgLatihan27;
import java.util.Scanner;
/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Deskripsi : Program ini adalah program yang menampilkan Formatting kalimat menjadi huruf besar dan huruf kecil
*/
public class SIRegPagi22166008Latihan27 {
  public static void main(String[] args) {
   Scanner masukkan = new Scanner(System.in);
    //Input kalimat
    System.out.print("Masukkan kalimat : "); 
    String kalimat = masukkan.nextLine();
    System.out.println("====Hasil Formatting====");
    //Output kalimat menggunakan huruf besar
    System.out.println("Huruf Besar : " +kalimat.toUpperCase( ));
    // Output kalimat menggunakan huruf kecil
    System.out.println("Huruf Kecil : " +kalimat.toLowerCase( ));
  }
}
