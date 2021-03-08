package com.company;

import java.util.Scanner;

public class TersCevirme {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int sayi = s.nextInt();

        int onlarBasamagi = sayi / 10;
        int birlerBasamagi = sayi % 10;

        int sayininTersi = birlerBasamagi * 10 + onlarBasamagi;
        System.out.println("Girdiğiniz sayinin tersi : " + sayininTersi);
    }
}
