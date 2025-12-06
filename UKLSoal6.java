package com.mycompany.uklsoal6;

import java.util.Scanner;

class Pelanggan
{
    String nama;
    char golongan;
    int listrik;
    
    Pelanggan (String nama, char golongan, int listrik)
    {
        this.nama = nama;
        this.golongan = golongan;
        this.listrik = listrik;
    }
}

public class UKLSoal6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tagihan Listrik Bulanan");
        
        System.out.print("Input Nama Pelanggan: ");
        String nama = sc.nextLine();
        
        System.out.print("Input Golongan: ");
        char golongan = sc.next().charAt(0);
        golongan = Character.toUpperCase(golongan);

        int biaya = 0;
        switch (golongan)
        {
            case 'A':
                biaya = 1200;
                break;
            case 'B':
                biaya = 1500;
                break;
            case 'C':
                biaya = 1800;
                break;
        }

        System.out.print("Input Pemakaian Listrik (kWh): ");
        int listrik = sc.nextInt();
        
        boolean biayatambahan = false;
        if (listrik > 500)
        {
           biayatambahan = true;
        }
        
        Pelanggan p = new Pelanggan(nama, golongan, listrik);
        
        int tagihan = biaya * p.listrik;
        
        System.out.println("\n======================");
        System.out.println("Nama Pelanggan: " + p.nama);
        System.out.println("Golongan Listrik: " + p.golongan);
        System.out.println("Pemakaian Listrik: " + p.listrik);
        System.out.println("Tagihan: " + tagihan);
        
        double tambahan = 0;
        if (biayatambahan == true)
        {
            if (golongan == 'A')
            {
                tambahan = tagihan*0.1;
            }
            else if (golongan == 'B')
            {
                tambahan = tagihan *0.2;
            }
            else
            {
                tambahan = tagihan*0.3;
            }
            tagihan += tambahan;
        }
        System.out.println("Total Tagihan: " + tagihan);
        System.out.println("Biaya Tambahan " + tambahan);
        System.out.println("======================");
    }
}
