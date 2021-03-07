package com.company;

import java.util.Scanner;

public class EbobBulma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print(" sayi1 giriniz : ");
        int sayi1 = s.nextInt();

        System.out.print(" sayi2 giriniz : ");
        int sayi2 = s.nextInt();

        int ebob = 1;
        int kontrol = 2;
        while (kontrol <= sayi1 && kontrol <= sayi1) {
            if (sayi1 % kontrol == 0 && sayi2 % kontrol == 0) {
                ebob = kontrol;
            }
            kontrol++;
        }
        if (ebob == 1) {
            System.out.println(" sayılar aralarında asaldır. ");
        } else {
            System.out.println(sayi1 + " ve " + sayi2 + "'in en büyük ortak böleni : " + ebob);
        }

    }
}
