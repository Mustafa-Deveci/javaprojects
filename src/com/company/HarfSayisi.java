package com.company;

public class HarfSayisi {
    public static void main(String[] args) {
        //ASCII  TABLE

        char ilkHarf = 'a';
        char sonHarf = 'f';

        int harfSayisi = (int) sonHarf - (int) ilkHarf - 1;

        System.out.println(ilkHarf + " ile " + sonHarf + " arasında " + harfSayisi + " harf var. ");


    }
}
