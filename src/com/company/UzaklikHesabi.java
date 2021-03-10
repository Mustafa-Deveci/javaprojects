package com.company;

import java.util.Scanner;

public class UzaklikHesabi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("x1 değerini giriniz : ");
        int x1 = s.nextInt();

        System.out.print("x2 değerini giriniz : ");
        int x2 = s.nextInt();

        System.out.print("y1 değerini giriniz : ");
        int y1 = s.nextInt();

        System.out.print("y2 değerini giriniz : ");
        int y2 = s.nextInt();

        double uzaklik = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println("iki nokta arasındaki uzaklık : " + uzaklik);

    }
}
