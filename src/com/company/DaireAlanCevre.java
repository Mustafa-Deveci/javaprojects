package com.company;

import java.util.Scanner;

public class DaireAlanCevre {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print(" Yaricap değerini giriniz : ");
        int yaricap = s.nextInt();

        double pi = 3.14;

        double daireCevre = 2 * pi * yaricap;
        double daireAlan = pi * yaricap * yaricap;

        System.out.println(" Daire alanı : " + daireAlan);
        System.out.println(" Daire çevresi : " + daireCevre);

    }
}
