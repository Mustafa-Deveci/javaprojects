package com.company;

import java.util.Scanner;

public class EbobBulma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Değer");
        int num = s.nextInt();
        int num2 = s.nextInt();
        int gcd = 1;
        for (int i = 1; i <= Math.min(num, num2); i++)
            if (num % i == 0 && num2 % i == 0)
                gcd = i;

        System.out.println("Ebob: " + gcd);
    }
}
