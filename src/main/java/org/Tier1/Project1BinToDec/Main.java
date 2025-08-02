package org.Tier1.Project1BinToDec;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please inform a binary number: (max is 8 digits)");
        String binary = sc.nextLine();

        if (binary.length() > 8) {
            System.err.println("The given binary number is too big");
        }

        System.out.println(calculateDecimal(binary));

    }


    public static int calculateDecimal(String binary) {
        String aux = binary;
        int number = 0;

        System.out.println("Input: " + binary);

        while (!aux.isEmpty()) {
            char lastChar = aux.charAt(aux.length() - 1);
            int position = binary.length() - aux.length();

            if (Character.digit(lastChar, 10) == 1) {
                number += (int) Math.pow(2, position);
            }

            aux = aux.substring(0, aux.length() - 1);  // Always remove last char
            System.out.println("char: " + lastChar + ", pos: " + position);
        }


        return number;
    }

}
