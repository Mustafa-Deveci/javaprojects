package com.company;

public class ArtisaGoreToplam {
    public static void main(String[] args) {

        int artis = 0;
        boolean artiyorMu = true;
        int toplam = 0;

        for (int i = 1; i <= 35; i = i + artis) {

            System.out.print(i);
            toplam = toplam + i;

            if (i != 35) {
                System.out.print(" + ");

            } else {
                System.out.print(" = " + toplam);

            }

            if (artis <= 4 && artiyorMu) {
                artis++;
                if (artis == 5) {
                    artiyorMu = false;
                }
                } else {

                    artis--;
                    if (artis == 1) {
                        artiyorMu = true;
                    }
                }

            }
        }
    }




