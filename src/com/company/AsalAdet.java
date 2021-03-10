package com.company;

import java.util.Scanner;

public class AsalAdet {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Başlangıç değerini giriniz : ");
        int baslangic = s.nextInt();
        System.out.print("Bitiş değerini giriniz : ");
        int bitis = s.nextInt();

        int asalAdet = 0;

        for (int i = baslangic; i < bitis; i++) {
            boolean asalMi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i + " Sayısı asal sayı değil.");
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                System.out.println(i + " Sayısı asal sayı.");
                asalAdet++;
            }
        }
        System.out.println("Asal sayı adeti :" + asalAdet);
    }
}

