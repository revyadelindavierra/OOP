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
public class limas extends bangunruang {
    int volumelms(int luasalas,int tinggi ) {
        return (int) ( luasalas * tinggi/3);
    }

    public void tampil() {
        Scanner in = new Scanner(System.in);
        limas l = new limas();
        System.out.print("Masukkan luas alas limas :");
         int lal = in.nextInt();
        System.out.println("Masukkan tinggi limas");
        int tinggi = in.nextInt();
        System.out.println("Volume kubusnya adalah = " +l.volumelms(lal, tinggi) );
    }
}
