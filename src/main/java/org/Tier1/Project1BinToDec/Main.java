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
        String aux2 =  binary;
        Integer number = 0;

        while (aux2.length() < 8 && aux2.length() > 1) {
            aux2 = aux2.substring(0, aux2.length()-1);
            Integer c = Integer.parseInt(aux2);

            number += c*(2*aux2.length());

        }


        return number;
    }

}
