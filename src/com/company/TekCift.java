package com.company;

import java.util.Scanner;

public class TekCift {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = s.nextInt();
        int kalan = sayi % 2;

        switch (kalan) {
            case 0:
                System.out.println("Girdiğiniz sayı çifttir.");
                break;
            case 1:
                System.out.println("Girdiğiniz sayı tektir.");
                break;
            default:
                System.out.println("Hata oluştu.");
                break;
        }
    }
}
