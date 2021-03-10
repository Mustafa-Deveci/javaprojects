package com.company;

public class TekCiftToplami {
    public static void main(String[] args) {

        int tekSayiToplami = 0;
        int ciftSayiToplami = 0;

        for (int i = 1; i < 50; i++) {
            if (i % 2 == 0) {
                ciftSayiToplami += i;
            } else {
                tekSayiToplami += i;
            }
        }
        System.out.println("Çift sayiların toplamı : " + ciftSayiToplami);
        System.out.println("Tek sayıların toplamı : " + tekSayiToplami);
    }
}
