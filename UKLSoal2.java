/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal2;

/**
 *
 * @author Kenji
 */
import java.util.Scanner;
public class UKLSoal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input batas atas: ");
        int ba = sc.nextInt();
        System.out.print("Input batas bawah: ");
        int bb = sc.nextInt();
        for (int i = ba; i >= bb; i--)
        {
            if (i == bb)
            {
                System.out.println(i + ". saya senang");
            }
            else if (i % 3 == 2)
            {
                System.out.println(i + ". saya anak moklet");
            }
            else if (i % 3 == 1)
            {
                System.out.println(i + ". saya anak wikusama");
            }
            else if (i % 3 == 0)
            {
                System.out.println(i + ". saya angkatan 34");
            }
        }
    }
}
