package com.company;

import java.util.Scanner;

public class SayiBulma {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int uretilenSayi = (int) (Math.random() * 101);

        int tahmin = -1;
        int tahminEtmeSayisi = 0;

        while (tahmin != uretilenSayi) {
            System.out.print(" Tahmininizi giriniz : ");
            tahmin = s.nextInt();
            tahminEtmeSayisi++;

            if (tahmin > uretilenSayi) {
                System.out.print(" Daha küçük bir tahminde bulununuz : ");

            } else if (tahmin < uretilenSayi) {
                System.out.print(" Daha büyük bir tahminde bulununuz : ");
            } else {
                System.out.println(" Başarılı tahmin ! " + tahminEtmeSayisi + ". tahminde buldunuz. ");

            }

        }


    }
}
