/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugass1;

/**
 *
 * @author Revy Adelinda
 */
import java.util.Scanner;

public class Karyawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = input.next();
      
        System.out.print("Masukkan nilai test akademik: ");
        int nilaiAkademik = input.nextInt();

        System.out.print("Masukkan nilai test ketrampilan: ");
        int nilaiKetrampilan = input.nextInt();

        System.out.print("Masukkan nilai test psikologi: ");
        int nilaiPsikologi = input.nextInt();
        System.out.println("-------------------------------------");
        double rata = (nilaiAkademik + nilaiKetrampilan + nilaiPsikologi) / 3.0;

        if (rata >= 75) {
            if (nilaiAkademik > nilaiKetrampilan && nilaiAkademik > nilaiPsikologi) {
                System.out.println(nama+" ditempatkan di bagian administrasi");
            } else if (nilaiKetrampilan > nilaiAkademik && nilaiKetrampilan > nilaiPsikologi) {
                System.out.println(nama+" ditempatkan di bagian produksi");
            } else {
                System.out.println(nama+" ditempatkan di bagian pemasaran");
            }
        } else {
            System.out.println("Maaf, Anda tidak lulus seleksi.");
        }
    }
}

