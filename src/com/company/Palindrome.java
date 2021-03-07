package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print(" Bir kelime giriniz : ");
        String kelime = s.nextLine();

        int altSinir = 0;
        int ustSinir = kelime.length() - 1;
        boolean palindromeMu = true;

        while (altSinir < ustSinir) {

            if (kelime.charAt(altSinir) != kelime.charAt(ustSinir)) {
                palindromeMu = false;
                break;
            }
            altSinir++;
            ustSinir--;

        }
        if (palindromeMu) {
            System.out.println("Kelime palindromedur.");
        } else {
            System.out.println("Kelime palindrome değildir.");
        }

    }
}
