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
public class prisma extends bangunruang {
    int volumeprs(int alas,int tinggi ) {
        return (int) ((alas*tinggi/2)*tinggi);
    }

    public void tampil() {
        Scanner in = new Scanner(System.in);
        prisma p = new prisma();
        System.out.print("Masukkanalas kerucut :");
         int alas = in.nextInt();
        System.out.println("Masukkan tinggi kerucut");
        int tinggi = in.nextInt();
        System.out.println("Volume kubusnya adalah = " + p.volumeprs(alas, tinggi));
    }
}
