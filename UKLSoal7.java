package com.mycompany.uklsoal7;

import java.util.Scanner;

public class UKLSoal7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Laba Rugi!");
        System.out.print("Input Jumlah Paket: ");
        int jumlahpaket = sc.nextInt();
        sc.nextLine();

        System.out.println();

        Object[][] paket = new Object[jumlahpaket][4];

        //input
        for (int i = 0; i < jumlahpaket; i++) {
            System.out.print("Nama Paket: ");
            String namapaket = sc.nextLine();
            paket[i][0] = namapaket;

            System.out.print("Biaya Produksi: ");
            int biayaproduksi = sc.nextInt();
            sc.nextLine();
            paket[i][1] = biayaproduksi;

            System.out.print("Harga Jual: ");
            int hargajual = sc.nextInt();
            sc.nextLine();
            paket[i][2] = hargajual;

            System.out.print("Jumlah Event: ");
            int jumlahevent = sc.nextInt();
            sc.nextLine();
            paket[i][3] = jumlahevent;

            System.out.println();
        }

        //hitungan
        int totalbp;
        int totalpdpt;
        int labarugi;
        String status;
        Object[][] analisis = new Object[jumlahpaket][4];

        for (int i = 0; i < jumlahpaket; i++) {
            totalbp = (int) paket[i][1] * (int) paket[i][3];
            analisis[i][0] = totalbp;

            totalpdpt = (int) paket[i][2] * (int) paket[i][3];
            analisis[i][1] = totalpdpt;

            labarugi = (int) analisis[i][1] - (int) analisis[i][0];
            analisis[i][2] = labarugi;

            if ((int) labarugi > 0) {
                status = "Laba";
            } else if ((int) labarugi < 0) {
                status = "Rugi";
            } else {
                status = "Impas";
            }
            analisis[i][3] = status;
        }

        //print
        System.out.println("\n------------------------------------------------------------------------");

        System.out.printf(
                "%-13s %-15s %-15s %-15s %-10s%n",
                "Nama", "Total Biaya", "Total Pendapatan", "Laba/Rugi", "Status"
        );
        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i < jumlahpaket; i++) {
            System.out.printf(
                    "%-13s %-15d %-15d %-15d %-10s%n",
                    paket[i][0],
                    analisis[i][0],
                    analisis[i][1],
                    analisis[i][2],
                    analisis[i][3]
            );
        }
        int totallabarugi = 0;
        for (int i = 0; i < jumlahpaket; i++) {
            totallabarugi += (int) analisis[i][2];
        }

        Object[] labatertinggi = {"Tidak Ada\"", 0};

        for (int i = 0; i < jumlahpaket; i++) {
            int labamax = 0;
            if ((int) analisis[i][2] > labamax) {
                labatertinggi[1] = (int)analisis[i][2];
                labatertinggi[0] = paket[i][0];
                labamax = (int) analisis[i][2];
            }
        }

        Object[] rugiterbesar = {"Tidak Ada", 0};

        for (int i = 0; i < jumlahpaket; i++) {
            if ((int) analisis[i][2] < (int) rugiterbesar[1]) {
                rugiterbesar[1] = (int) analisis[i][2];
                rugiterbesar[0] = paket[i][0];
            }
        }

        System.out.println("\nTotal Laba/Rugi Keseluruhan: " + totallabarugi);
        System.out.println("Paket dengan laba tertinggi: " + (String) labatertinggi[0] + " (" + (int) labatertinggi[1] + ")");
        System.out.println("Rugi Terbesar: " + (String) rugiterbesar[0] + " (" + (int) rugiterbesar[1] + ")");
        System.out.println("------------------------------------------------------------------------");
    }
}
