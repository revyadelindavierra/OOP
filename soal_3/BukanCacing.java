/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal_3;

import java.util.Scanner;

/**
 *
 * @author Revy Adelinda
 */
public class BukanCacing extends classification {
     @Override
    public void tanpakaki() {
        System.out.println("Itervertebrata yang tidak memiliki kaki (bukan cacing):");
        System.out.println("1. trematoda   - Fluke Worm");
        System.out.println("2. Cacing Pita - Tapewrom");
    }

    public void tampil() {
        Scanner in = new Scanner(System.in);
        System.out.println("INTERVERTEBRATA");
        System.out.println("1.Memiliki kaki");
        System.out.println("2.Tidak memiliki kaki");
        System.out.println("--------------------");
        System.out.print("Pilih klasifikasinya: ");
        int pilih = in.nextInt();

       switch(pilih){
        case 1:
               System.out.println("1.Memiliki 3 pasang kaki");
               System.out.println("2.Memiliki lebih dari 3 pasang kaki");
               System.out.println("------------------------------------");
               System.out.print("Pilih jenis hewan: ");
               int jenis = in.nextInt();
            if(jenis == 1){
                 TigaPasangKaki t = new TigaPasangKaki();
                 t.berkaki();
            }else{
                LebihDariTiga l = new LebihDariTiga();
                l.berkaki();
            }break;
        case 2: 
             System.out.println("1.Cacing");
               System.out.println("2.Bukan Cacing");
               System.out.println("------------------------------------");
               System.out.print("Pilih jenis hewan: ");
               int jeniss = in.nextInt();
            if(jeniss == 1){
                Cacing c = new Cacing();
                c.tanpakaki();
            }else{
                BukanCacing b = new BukanCacing();
                b.tanpakaki();
            }break;
        default: System.out.println("GADAAAAA WOIIIII");
       }
    }
}
