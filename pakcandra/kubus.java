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
public class kubus extends bangunruang {

    int volumekbs(int sisi) {
        return sisi * sisi * sisi;
    }

    public void tampil() {
        Scanner in = new Scanner(System.in);
        kubus k = new kubus();
        System.out.print("Masukkan sisi kubus :");
        System.out.println("Volume kubusnya adalah = " + k.volumekbs(in.nextInt()));
    }

}
