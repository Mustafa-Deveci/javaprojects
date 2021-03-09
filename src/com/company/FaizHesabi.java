package com.company;

import java.util.Scanner;

public class FaizHesabi {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Para miktarı giriniz : ");
        int miktar = s.nextInt();

        System.out.print("ay cinsinden zaman giriniz : ");
        int ayZaman = s.nextInt();

        System.out.print("Faiz oranını giriniz : ");
        double faizOrani = s.nextDouble();

        double tutar = (miktar * ayZaman * faizOrani) / 100;

        System.out.println("Tutar : " + tutar);


    }
}
