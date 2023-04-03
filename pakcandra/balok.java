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
public class balok extends bangunruang  {
     int volumeblk(int panjang,int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }

    public void tampil() {
        Scanner in = new Scanner(System.in);
        balok b = new balok();
        System.out.print("Masukkan panjang balok :");
        int panjang = in.nextInt();
        System.out.println("Masukkan lebar balok");
        int lebar = in.nextInt();
        System.out.println("Masukkan tinggi balok");
        int tinggi = in.nextInt();
        System.out.println("Volume balkonya adaalah : "+b.volumeblk(panjang, lebar, tinggi));
    }
}
