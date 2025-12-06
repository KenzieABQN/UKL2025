/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal4;

/**
 *
 * @author Kenji
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class UKLSoal4 {

    public static void main(String[] args) {
        ArrayList<Integer> jumlahtebakan = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean menang = false;
        boolean tampilkanhasil = false;
        System.out.println("Tebak Angka!");
        
        int batasatas = 100 + 1;
        Random rng = new Random();
        int angkabenar = rng.nextInt(batasatas);
        
        while(menang == false)
        {
            System.out.print("Input Tebakan: ");
            int tebakan = sc.nextInt();
           
           if (tebakan < angkabenar)
           {
               System.out.println("Terlalu rendah, coba lagi!");
               jumlahtebakan.add(tebakan);
           }
           else if (tebakan > angkabenar)
           {
               System.out.println("Terlalu tinggi, coba lagi!");
               jumlahtebakan.add(tebakan);
           }
           else if (tebakan > batasatas)
           {
              System.out.println("Menyerah? Jawabannya adalah " + angkabenar + "!");
              tampilkanhasil = true;
           }
           else if (tebakan == angkabenar)
               {
                   menang = true;
                   jumlahtebakan.add(tebakan);
                   System.out.println("Selamat! Anda menebak benar! Jumlah tebakan anda: " + jumlahtebakan.size());
                   tampilkanhasil = true;
               }
           if (tampilkanhasil == true)
           {
                System.out.print("Jawaban sebelumnya: ");
                   
                for (int i = 0; i < jumlahtebakan.size(); i++)
                   {
                       System.out.print(jumlahtebakan.get(i) + " ");
                   }
           }
        }                
    }
}
