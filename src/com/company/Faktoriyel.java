package com.company;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("N değeri giriniz : ");

        int n = s.nextInt();

        int faktoriyel = 1;
        int sayac = 1;

        while (n >= sayac) {
            faktoriyel *= sayac;
            sayac++;
        }
        System.out.println(n + " Faktöriyel : " + faktoriyel);
    }
}
