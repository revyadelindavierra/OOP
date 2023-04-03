/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugass1;

/**
 *
 * @author Revy Adelinda
 */
import java.util.*;

public class HitungPecahan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int uang, sisa;
        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000};

        System.out.print("Masukkan jumlah uang: ");
        uang = in.nextInt();
        sisa = uang;

        System.out.println("Jumlah uang pecahan yang dibutuhkan: ");
        for (int i = 0; i < pecahan.length; i++) {
            if (uang >= pecahan[i]) {
                sisa = uang / pecahan[i];
                uang = uang % pecahan[i];
                System.out.println( sisa+" Lembar " + pecahan[i] );
            } else {
                System.out.println("0 Lembar "+pecahan[i] );
            }
        }

}}

    
   


