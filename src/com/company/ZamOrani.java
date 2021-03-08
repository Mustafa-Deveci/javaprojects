package com.company;

import java.util.Scanner;

public class ZamOrani {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Eski fiyatı giriniz : ");
        float eskiFiyat = s.nextFloat();

        System.out.print("Yeni fiyatı giriniz : ");
        float yeniFiyat = s.nextFloat();

        double zamOrani = ((yeniFiyat - eskiFiyat) / eskiFiyat) * 100;
        System.out.println("Zam oranı %" + zamOrani);


    }
}
