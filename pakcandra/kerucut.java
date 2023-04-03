/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pakcandra;

import java.util.Scanner;

/**
 *
 * @author Revy Adelinda
 */
public class kerucut extends bangunruang  {
     int volumekrc(int jari,int tinggi ) {
        return (int) (3.14 * jari * tinggi/3);
    }

    public void tampil() {
        Scanner in = new Scanner(System.in);
        kerucut r = new kerucut();
        System.out.print("Masukkan jari jari lingkarang kerucut :");
         int jari = in.nextInt();
        System.out.println("Masukkan tinggi kerucut");
        int tinggi = in.nextInt();
        System.out.println("Volume kubusnya adalah = " + r.volumekrc(jari, tinggi));
    }
}
