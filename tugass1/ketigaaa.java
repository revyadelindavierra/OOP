/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugass1;

import java.util.Scanner;

/**
 *
 * @author Revy Adelinda
 */
public class ketigaaa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // meminta masukan dari pengguna
        System.out.print("Masukkan tinggi (n): ");
        int m = input.nextInt();
        System.out.print("Masukkan lebar (m): ");
        int n = input.nextInt();

        // membuat array dua dimensi dan mengisinya
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    array[i][j] = 1;
                } else if (i == 1 || i == m - 2 || j == 1 || j == n - 2) {
                    array[i][j] = 2;
                } else if (i == 2 || i == m - 3 || j == 2 || j == n - 3) {
                    array[i][j] = 3;
                } else if (i == 3 || i == m - 4 || j == 3 || j == n - 4) {
                    array[i][j] = 4;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        // menampilkan array dua dimensi
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


    



