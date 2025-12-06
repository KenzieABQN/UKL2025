package com.mycompany.uklsoal1;

/**
 *
 * @author Kenji
 */
import java.util.Scanner;

public class UKLSoal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Baris Fibonacci");
        System.out.print("Input Jumlah Elemen: ");
        int jumlah = input.nextInt();
        if (jumlah >= 1) {
            int a = 1, b = 2, c = 0;
            int ganjil = 0, genap = 0;

            for (int i = 1; i <= jumlah; i++) {
                if(i == jumlah)
                {
                    System.out.print(a);
                }
                else
                {
                    System.out.print(a + ", ");
                    c = a + b;
                    a = b;
                    b = c;
                    if (c % 2 == 0) {
                        genap++;
                    } else {
                        ganjil++;
                    }
                }
            }
            System.out.println();
            System.out.println("Bilangan Ganjil: " + ganjil);
            System.out.println("Bilangan Genap: " + genap);

        } else {

            System.out.println("Input tidak boleh kurang dari 1");
        }
    }
}
