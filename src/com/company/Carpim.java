package com.company;

import java.util.Scanner;

public class Carpim {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Bir değer giriniz, çıkmak için 0 tuşlayınız. ");

        int kullaniciDegeri = s.nextInt();
        int carpimSonucu = 1;
        boolean hemenCikildiMi = true;

        while (kullaniciDegeri != 0) {
            carpimSonucu *= kullaniciDegeri;
            System.out.print("Bir değer giriniz, çıkmak için 0 tuşlayınız. ");
            kullaniciDegeri = s.nextInt();

            hemenCikildiMi = false;
        }

        if (hemenCikildiMi) {
            System.out.print("uygulamadan çıkıldı. ");
        } else {
            System.out.print("girdiğiniz sayiların çarpımı : " + carpimSonucu);
        }
    }
}

