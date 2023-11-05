package com.firstjavaprogram;

import java.util.Scanner;

public class ScannerUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usrInt = input.nextInt();
        float usrFloat = input.nextFloat();
        double usrDouble = input.nextDouble();
        String usrString = input.next();

        System.out.println(usrInt);
        System.out.println(usrFloat);
        System.out.println(usrDouble);
        System.out.println(usrString);
    }
}
