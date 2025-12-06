package com.mycompany.uklsoal5;
import java.util.Scanner;
public class UKLSoal5 {

    public static void main(String[] args) {
        System.out.println("Menghitung Frekuensi Elemen dalam Array");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input besar array: ");
        int besar = sc.nextInt();
        int[] array = new int[besar];
        int[] frekuensi = new int[besar];
        
        for (int i = 0; i < besar; i++)
        {
            System.out.print("Input nomor: ");
            array[i] = sc.nextInt();
            sc.nextLine();
        }
        
        for (int num : array)
        {
            for (int i = 0; i <= besar; i++)
            {
                int j = i+1;
                if (num == j)
                {
                    frekuensi[i]++;
                }
            }
        }
        
        for (int i = 1; i <= besar; i++)
        {
            int j = i-1;
            System.out.println("Frekuensi " + i + " adalah = " + frekuensi[j]);
        }

    }
}
