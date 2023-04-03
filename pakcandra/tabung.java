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
public class tabung extends bangunruang {
    
    int volumetbg(int jari,int tinggi ) {
        return (int) (3.14 * jari *jari* tinggi);
    }

    public void tampil() {
        Scanner in = new Scanner(System.in);
        tabung t = new tabung();
        System.out.print("Masukkan jari jari lingkarang tabung :");
         int jari = in.nextInt();
        System.out.println("Masukkan tinggi tabung");
        int tinggi = in.nextInt();
        System.out.println("Volume kubusnya adalah = " + t.volumetbg(jari, tinggi));
    }
}
