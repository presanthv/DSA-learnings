package com.firstjavaprogram;

import java.lang.reflect.Type;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // 1.Type Conversion
        //Here Java auto-converts int to float but the inverse is not possible i.e.
        // int numInteger = 10.1;
//        float num = 10;
//        System.out.println(num);

        // 2.Type Casting
//        int numInt = (int)(10.013f);
//        System.out.println(numInt);

        // 3.Type Promotion in Expressions.
        // Declaring and initializing primitive types
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        // The Expression
        double result = (f * b) + (i / c) - (d * s);
        // float + int + double = double

        // Printing the result obtained after
        // all the promotions are done
        System.out.println("result = " + result);
    }
}