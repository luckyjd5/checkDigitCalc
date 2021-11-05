package com.company;

public class Main {

    public static void main(String[] args) {
        int[] barcode = {9,3,1,1,9,6,0,0,4,3,7,1};
        int total = 0;
        for (int i = 0; i < barcode.length; i++) {
            if (i == 0) {
            }
            else {
                total += barcode[i];
                barcode[i] = 0;
                i++;
            }
        }
        total *= 3;
        for (int i = 0; i < barcode.length; i++) {
            total += barcode[i];
        }
        if (80 - total >= 0) {
            System.out.println("Check digit is " + (80 - total));
        }
        else {
            System.out.println("False");
        }
    }
}