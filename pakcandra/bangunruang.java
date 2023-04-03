/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pakcandra;

import java.util.Scanner;

/**
 *
 * @author Revy Adelinda
 */
public class bangunruang {

    public int volume;

    public static void main(String[] args) {
        kubus k = new kubus();
        k.tampil();
        System.out.println("====================");
        balok b = new balok();
        b.tampil();
        System.out.println("====================");
        tabung t = new tabung();
        t.tampil();
        System.out.println("====================");
       limas l = new limas();
       l.tampil();
        System.out.println("=====================");
        prisma p = new prisma();
        p.tampil();
        System.out.println("=====================");
        bola o = new bola();
        o.tampil();
        System.out.println("=====================");
        kerucut r = new kerucut();
        r.tampil();
        

    }
}
