package com.company;

import java.util.Scanner;

public class AsalBulma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print(" Üst sınırı giriniz : ");
        int girilenSayi = s.nextInt();

        for (int i = 2; i <= girilenSayi; i++) {
            boolean asalMi = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    asalMi = false;
                    break;
                }

            }
            if (asalMi) {
                System.out.print(i + " , ");
            }

        }


    }
}
