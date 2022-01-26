package org.tyaa.demo.java.se.types;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java!");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        /* Primitive (Value) Types */

        byte b1 = 100; // -128 -> +127 // 1 B
        b1 = -128;
        // b1 = 128; // wrong value
        b1 = 127;
        short sh1 = 128; // 2 B
        sh1 = -129;
        int integer1 = 1234567890; // 4 B
        long integer2 = 12345678901L;

        float fl1 = 0.9999f;
        double d2 = 0.99999999999;
        double d3 = 0.99999999999d;

        boolean bool1 = true;
        bool1 = false;

        System.out.println(fl1);
        System.out.println(d2);

        char ch1 = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.printf("%s ", ch1++);
        }
        System.out.println();
        char ch2 = 'А';
        for (int i = 0; i < 32; i++) {
            System.out.printf("%s ", ch2++);
        }
    }
}
