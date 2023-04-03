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
public class bola extends bangunruang {
    int volumebla(int jari ) {
        return (int) (3.14 *jari*jari* jari *4/3);
    }

    public void tampil() {
        Scanner in = new Scanner(System.in);
        bola o = new bola();
        System.out.print("Masukkan jari jari bola :");
         int jari = in.nextInt();
        System.out.println("Volume bolanya adalah = " + o.volumebla(jari));
    }
}
