package com.company;

import java.util.Scanner;

public class OrtalamaHiz {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Mesafe bilgisini giriniz (km): ");
        int mesafe = s.nextInt();

        System.out.print("Zaman bilgisini giriniz (saat):");
        int zaman = s.nextInt();

        double hiz = (double) mesafe / zaman;

        System.out.println("Saatteki ortalama hız : " + hiz);
    }
}
