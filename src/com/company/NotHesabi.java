package com.company;

import java.util.Scanner;

public class NotHesabi {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int notDegeri = 0, notSinir = 0;

        System.out.print(" Not değerini giriniz : ");

        notDegeri = s.nextInt();

        notSinir = notDegeri / 10;


        switch (notSinir) {

            case 9, 10:
                System.out.println(" Notunuz AA ");
                break;
            case 8:
                System.out.println(" Notunuz BA ");
                break;
            case 7:
                System.out.println(" Notunuz BB ");
                break;
            case 6:
                System.out.println(" Notunuz CB ");
                break;
            case 5:
                System.out.println(" Notunuz CC ");
                break;
            default:
                System.out.println(" Notunuz CC den daha düşük ");
        }

    }
}
