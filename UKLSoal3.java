/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal3;

/**
 *
 * @author Kenji
 */
import java.util.Scanner;
public class UKLSoal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menghitung Faktorial");
        System.out.print("Input Bilangan: ");
        int bilangan = input.nextInt();
        int hasil = 1;
                
        for (int i = 1; i < bilangan ; i++)
        {
            System.out.print(i + " * ");
            hasil = hasil * i;
        }
        System.out.print(bilangan +" = " + hasil);
        
    }
}
